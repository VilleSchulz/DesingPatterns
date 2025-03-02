package graphics;

import javafx.scene.image.Image;

public class RoadTexture implements TileTexture {

    private Image image = new Image(getClass().getResource("/road.png").toExternalForm());

    public Image getImage() {
        return image;
    }


}
