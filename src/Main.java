import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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

        stage.initStyle(StageStyle.TRANSPARENT);

        stage.show();

        stage.setWidth(400);
        stage.setHeight(500);

        double screenWidth = Screen.getPrimary().getBounds().getWidth();
        double screenHeight = Screen.getPrimary().getBounds().getHeight();

        stage.setX(screenWidth - stage.getWidth());
        stage.setY(screenHeight - stage.getHeight());

        stage.requestFocus();

        stage.setResizable(false);

        Text text = new Text("Fertig Programmieren");

        group.getChildren().add(text);

        text.setX(10);
        text.setY(20);
        text.setFont(Font.font("Flubber", 22));



        scene.setOnKeyPressed(event -> {

        });

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {

            }
        });

    }
}
