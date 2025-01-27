public class Intermediate extends State {

    public Intermediate(Character character) {
        super(character);
    }

    @Override
    public void train() {
        int xp = super.getCharacter().getXp();
        super.getCharacter().setXp(xp += 10);
        System.out.println("You are training");
        System.out.println("Your xp is now " + xp);
    }

    @Override
    public void meditate() {
        Character character = super.getCharacter();
        int health = character.getHealth();
        character.setHealth(health += 10);
        System.out.println("You are meditating");
        System.out.println("Your health is now " + health);
        if (health >= 200) {
            character.setLevel(new Expert(character));
            System.out.println("You are now an expert");
        }

    }

    ;

    @Override
    public void fight()
    {
        System.out.println("Cannot fight, must be at least an expert");
    };
}
