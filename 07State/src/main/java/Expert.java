public class Expert extends State {

    public Expert(Character character) {
        super(character);

    }

    @Override
    public void train() {
        Character character = super.getCharacter();
        int xp = character.getXp();
        character.setXp(xp += 10);

        if (xp >= 300) {
            character.setLevel(new Master(character));
            System.out.println("You are now a master");

        }

    }

    @Override
    public void meditate() {
        Character character = super.getCharacter();
        int health = character.getHealth();
        character.setHealth(health += 10);
        System.out.println("You are meditating");
        System.out.println("Your health is now " + health);



    }

    ;

    @Override
    public void fight() {
        Character character = super.getCharacter();
        int xp = character.getXp();
        int health = character.getHealth();
        character.setHealth(health -= 10);
        character.setXp(xp += 10);
        System.out.println("You are fighting");
        System.out.println("Your health is now " + health);
        System.out.println("Your xp is now " + xp);
        if (health <= 0) {
            System.out.println("You are dead");
        }


    }


}
