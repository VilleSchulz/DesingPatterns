import java.util.*;

public class BlackJack extends Game {
    Scanner sc;
    int numberOfPlayers;
    List<Player> players;
    List<Player> droppedPlayers;
    List<Card> cards;
    private Player winner;
    private Player looser;
    Player currentPlayer;

    public BlackJack() {
        players = new ArrayList<>();
        cards = new ArrayList<>();
        sc = new Scanner(System.in);
        droppedPlayers = new ArrayList<>();

    }



//********************** BASE GAME LOGIC ***********************
    //Ask player name and add it to game
    @Override
    public void initializeGame(int numberOfPlayers) {
        winner = null;
        this.numberOfPlayers = numberOfPlayers;
        //if reinitializing game  add dropped players back to game
        addDroppedPlayersBack();
        if (players.isEmpty()) {
            for (int i = 0; i < numberOfPlayers; i++) {
                System.out.println("Give  player " + (i + 1) + " name: ");
                String playername = sc.nextLine();
                Player player = new Player(playername, i);
                players.add(player);
                System.out.printf("Player %d: %s added\n", i + 1, playername);
            }

        }

        //initialize cards (only one stack of cards)
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                //add cards to table stack
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
        //suffle cards for randomness
        Collections.shuffle(cards);

        //give 2 cards to players in start
        initialHand();

    }


    //This method is called to play single turn of player
    @Override
    public void playSingleTurn(int playerIndex) {

        for (Player plr : players) {
            if (plr.index == playerIndex) {
                currentPlayer = plr;
            }
        }
            // if only one player left he wins
            if (players.size() == 1) {
                System.out.println("Only one player left, game ends");
                System.out.println("Winner is " + players.get(0).name);
                System.out.println(players.get(0).name + " has " + players.get(0).getValue());
                this.winner = players.get(0);
                return;
            }
        //loop until player stays or has 21 or more
        checkIfWinner();
        while (winner == null) {
            System.out.println(currentPlayer.name + " do you want to take new card Y/N or Stay(S)");
            String answer = sc.nextLine().toUpperCase();
            switch (answer) {
                case "Y":
                    currentPlayer.takeCard(cards.remove(0));
                    printHand(currentPlayer);
                    //check if player has 21 or more
                    for (Player droppedPlayer : droppedPlayers) {
                        if (droppedPlayer.name.equals(currentPlayer.name)) {
                            return;
                        }
                    }
                    break;

                case "S":
                    currentPlayer.setStay();
                    return;
                case "N":
                    return;

                default:
                    System.out.println("Invalid input");
                    break;

            }
        }


    }

    //This method is called to check if game has ended if so it will ask if player wants to play again or end game
    @Override
    public boolean endOfGame() {
        if (this.winner != null) {
            this.winner.wins += 1;
            for (Player player : players) {


                if (!player.name.equals(winner.name)) {
                    player.loses += 1;
                }
            }
            System.out.println("****Round ended****");
            System.out.println("Winner is " + winner.name);
            System.out.println("********************");
            //ask if player wants to play again

            if (players.isEmpty()) {
                return true;
            }

            while(true){
                System.out.println("Do you want to play again? Y/N");
                String answer = sc.nextLine().toUpperCase();
                switch (answer) {
                    case "Y":
                        clearHands();
                        initializeGame(numberOfPlayers);
                        return false;
                    case "N":
                        return true;
                    default:
                        System.out.println("Invalid input");
                        break;
                }

            }


        }
        return false;



    }

    //This method is called when game ends to display winner
    @Override
    public void displayWinner() {
        Player mostWins = null;
        emptyPlayers();

        //find player with most wins
        for (Player player : droppedPlayers) {
            if (mostWins == null) {
                mostWins = player;
            }
            if (player.wins > mostWins.wins) {
                mostWins = player;
            }
        }
        //display winner with total wins
        System.out.println("Winner is " + mostWins.name);
        for (Player player : droppedPlayers) {
            System.out.println(player.name + " had " + player.wins);
        }

    }
    //********************** BASE GAME LOGIC ENDS ***********************






    //This method is called to give 2 cards to players in start
    public void initialHand() {
        for (Player player : players) {
            if (player.getCards().isEmpty()) {
                while (player.getCards().size() < 2) {
                    player.takeCard(cards.remove(0));


                }
            }

            printHand(player);
        }
        checkIfWinner();
    }


    //This method is called to print players hand
    public void printHand(Player player) {
        System.out.println(player.name + "  **HAND**: ");
        List<Card> hand = player.getCards();
        for (Card card : hand) {
            System.out.println(card.toString());

        }

    }

    public void checkIfWinner() {
        Player bestPlayer = null;
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            Player player = iterator.next();
            int currentPlayerHand = player.getValue();

            // if player has more than 21 he loses
            if (currentPlayerHand > 21) {
                droppedPlayers.add(player);
                iterator.remove();
                System.out.println(player.name + " has more than 21 and is OUT");
            }

            // if player has 21 it wins
            if (currentPlayerHand == 21) {
                this.winner = player;
            }
            // if all players stay check who has best hand
            if (allPlayersStayed()) {
                if (bestPlayer == null || bestPlayer.getValue() < currentPlayerHand) {
                    bestPlayer = player;
                }
                this.winner = bestPlayer;
            }


        }
    }

    public boolean allPlayersStayed() {
        for (Player player : players) {
            if (!player.getStay()) {
                return false;
            }
        }
        return true;
    }

    public void clearHands() {
        emptyPlayers();
        for (Player player : droppedPlayers) {
            player.clearHand();


        }


    }

    private void addDroppedPlayersBack() {
        List<Player> playersToAddBack = new ArrayList<>(droppedPlayers);
        for (Player player : playersToAddBack) {
            players.add(player);
            droppedPlayers.remove(player);
        }
    }

    public void emptyPlayers() {
        List<Player> playersToRemove = new ArrayList<>(players);
        for (Player player : playersToRemove) {
            droppedPlayers.add(player);
            players.remove(player);
        }
    }



}
