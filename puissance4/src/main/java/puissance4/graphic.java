package puissance4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class graphic {
    public void start(Stage mainWindo) throws Exception {
        VBox box1 = new VBox();
        Scene windo = new Scene(box1, 300, 700);
        mainWindo.setTitle("puissance4");
        mainWindo.setScene(windo);
        mainWindo.show();
    }
}
