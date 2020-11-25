package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class MinGUI extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MinGUI.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }
    @FXML
    TextArea textFelt;

    public void show() {
        System.out.println("Clicked Button :)");
        textFelt.appendText("Hurra! Det virker!\n");


    }



}
