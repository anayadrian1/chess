import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Chess");

        BorderPane root = new BorderPane();
        HBox buttons = new HBox(10);
        Button reset = new Button("Reset");
        buttons.getChildren().addAll(reset);
        buttons.setAlignment(Pos.CENTER);
        buttons.setStyle("-fx-background-color: #21DE52");

        root.setTop(buttons);
        GridPane grid = new GridPane();
        root.setCenter(grid);

        Board board = new Board(grid, 100);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

        reset.setOnAction(event -> board.reset());


    }
}
