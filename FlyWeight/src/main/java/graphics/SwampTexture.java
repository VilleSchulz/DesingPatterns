package graphics;

import com.sun.prism.Texture;
import javafx.scene.image.Image;

public class SwampTexture implements TileTexture {

    private Image image = new Image(getClass().getResource("/swamp.png").toExternalForm());

    public Image getImage() {
        return image;
    }
}
