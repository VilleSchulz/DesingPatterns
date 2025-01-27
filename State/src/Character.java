public class Character {
    private String name;
    private int health;
    private int xp;
    private State level;

    public Character(String name, int health, int xp) {
        this.name = name;
        this.health = health;
        this.xp = xp;
        this.level = new Novice(this);

    }

    @Override
    public String toString(){
        return "Name: "  + name+ "\nHealth: "+ health+ "\n Xp: "+xp;
    }

    public void setLevel(State level) {
        this.level = level;
    }

    public State getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;

    }

    public  String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

   public void train(){
        level.train();
    }
    public void meditate(){
        level.meditate();
    }
    public void fight(){
        level.fight();
    }
}
