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

        // Use a borderpane to separate the game from the buttons
        BorderPane root = new BorderPane();
        HBox buttons = new HBox(10);
        Button reset = new Button("Reset");
        buttons.getChildren().addAll(reset);
        buttons.setAlignment(Pos.CENTER);
        buttons.setStyle("-fx-background-color: #21DE52");
        root.setTop(buttons);
        // Gridpane to hold the game in
        GridPane grid = new GridPane();
        root.setCenter(grid);
        // Class that represents the board the game is played on
        Board board = new Board(grid, 100);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Buttons utilize methods on the board
        reset.setOnAction(event -> board.reset());


    }
}
