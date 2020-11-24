package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NodeStyleRotateDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane  = new StackPane();
        Button bt = new Button("OK");
        bt.setStyle("-fx-border-color: blue; -fx-background-color:yellow");
        pane.getChildren().add(bt);

        pane.setRotate(45);
        pane.setStyle("-fx-border-color: red; -fx-background-color: pink");

        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("Rotated");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
