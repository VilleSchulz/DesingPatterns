import javafx.scene.canvas.GraphicsContext;
import maps.Map;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;

import javafx.stage.Stage;
import tiles.Tile;


public class MapView extends Application {
    private MapController controller = new MapController(20, 20);
    private final int CANVAS_WIDTH = controller.getGridWidth() * controller.getTileSize();
    private final int CANVAS_HEIGHT = controller.getGridHeight() * controller.getTileSize();
    private Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
    private GraphicsContext gc = canvas.getGraphicsContext2D();
    int tilesPerRow = controller.getGridWidth();
    int tilesPerColumn = controller.getGridHeight();

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Flyweight Maps.Map Demo");
        BorderPane root = new BorderPane();
        primaryStage.setScene(new Scene(root));
        root.setCenter(canvas);
        Button createWilderness = new Button("Create Wilderness");
        Button createCity = new Button("Create City");
        HBox buttonBox = new HBox(createCity, createWilderness);
        root.setBottom(buttonBox);
        primaryStage.show();

        createWilderness.setOnAction(e -> {
            gc.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);
            Map map = controller.createWilderness();

            drawMap(map);



        });

        createCity.setOnAction(e -> {
            Map map = controller.createCity();
            drawMap(map);


        });


    }

    public void drawMap(Map map){
        for (int i = 0; i < tilesPerRow; i++) {
            for (int j = 0; j < tilesPerColumn; j++) {
                gc.drawImage(map.getTileImage(i, j), i * controller.getTileSize(),
                        j * controller.getTileSize(), controller.getTileSize(), controller.getTileSize());

            }

        }
    }

}

