import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    public static void main (String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group);

        stage.setScene(scene);

        stage.show();

        stage.setWidth(400);
        stage.setHeight(500);

        double screenWidth = Screen.getPrimary().getBounds().getWidth();
        double screenHeight = Screen.getPrimary().getBounds().getHeight();

        stage.setX(screenWidth - stage.getWidth());
        stage.setY(screenHeight - stage.getHeight());

        stage.initStyle(StageStyle.DECORATED);
    }
}
