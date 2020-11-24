package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShowHBoxVBox extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();

        pane.setTop(getHBox());
        pane.setLeft(getVBox());

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Show HBox and VBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private HBox getHBox() {
        HBox h = new HBox(15);
        h.setPadding(new Insets(15,15,15,15));
        h.setStyle("-fx-background-color: gold");
        h.getChildren().add(new Button("Computer Science"));
        h.getChildren().add(new Button("Chemistry"));
        ImageView image = new ImageView("Image/SouthKorea.png"); //HBox:top 가로배열
        h.getChildren().add(image);
        return h;
    }

    private VBox getVBox() {
        VBox v = new VBox(15);
        v.setPadding(new Insets(15,5,5,5));
        v.getChildren().add(new Label("Courses"));

        Label[] courses = {new Label("CSCI 1301"), new Label("CSCI 1302"),
        new Label("CSCI 2410"), new Label("CSCI 3720")};

        for (Label course : courses) {
            VBox.setMargin(course, new Insets(0,0,0,15));
            v.getChildren().add(course);
        }
        return v;
    }
}
