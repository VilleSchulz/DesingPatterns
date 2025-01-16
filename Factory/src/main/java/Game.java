
package main.java;
public class Game {

    public static void main(String[] args) {
      Game game = new Game();
      Map cityMap = game.createMap("city",10,20);
        System.out.println("City");
      cityMap.display();



      Map wildernessMap = game.createMap("wilderness",10,20);
        System.out.println("Wilderness");
        wildernessMap.display();
    }



    private Map createMap(String type, int width, int height){
        return switch (type.toLowerCase()) {
            case "city" -> new CityMap(width, height);
            case "wilderness" -> new WildernessMap(width, height);
            default -> throw new IllegalArgumentException("Unknown type" + type);
        };





    }

    }
