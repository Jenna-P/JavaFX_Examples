package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowImage extends Application {
    @Override
    public void start(Stage primaryStage){
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));
        Image image = new Image("Image/SouthKorea.png");
        pane.getChildren().add(new ImageView(image));

        ImageView imageV2 = new ImageView(image);
        imageV2.setFitHeight(100);
        imageV2.setFitWidth(100);
        pane.getChildren().add(imageV2);

        ImageView imageV3 = new ImageView(image);
        imageV3.setRotate(90);
        pane.getChildren().add(imageV3);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Flag of South Korea : 한국 ");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
