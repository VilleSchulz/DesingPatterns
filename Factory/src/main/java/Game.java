public class Game {

    public static void main(String[] args) {
        Game game = new Game();
        //Map map = game.createMap("city", 10, 20);
        Map map = game.createmap(new CityMap(10, 20));
        System.out.println("City");
        map.display();

    }

    private Map createmap(Map map) {
        return map.generateMap();

    }
}


