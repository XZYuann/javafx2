package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //button
        Button b1=new Button("button1");
        Button b2=new Button("button2");
        Button b3=new Button("button3");
        //AnchorPane
        AnchorPane ap=new AnchorPane();
        ap.getChildren().addAll(b1,b2,b3);
        ap.setStyle("-fx-background-color: blue");
        //SceneSet
        Scene scene2=new Scene(ap);
        primaryStage.setScene(scene2);
        primaryStage.setTitle("javafx");
        primaryStage.setHeight(800);
        primaryStage.setWidth(600);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
