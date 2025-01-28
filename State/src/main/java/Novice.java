public class Novice extends State {

    public Novice(Character character) {
        super(character);
    }

    @Override
    public void train() {
        Character character = super.getCharacter();
        int xp = character.getXp();
        character.setXp(xp += 10);
        System.out.println("You are training");
        System.out.println("Your xp is now " + xp);

        if (xp >= 100) {
            character.setLevel(new Intermediate(character));
            System.out.println("You are now an intermediate");

        }

    }


    @Override

    public void meditate() {
        System.out.println("Cannot meditate, must be at least an intermediate");
    }



    @Override

    public void fight() {
        System.out.println("Cannot fight, must be at least an intermediate");
    }


}
