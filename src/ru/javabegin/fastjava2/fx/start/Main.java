package ru.javabegin.fastjava2.fx.start;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by Neboola on 04.11.2015.
 */
public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button = new Button("Go!");
        Text text = new Text(10, 20, "Boo!");
        text.setFont(new Font(20));

        BorderPane pane = new BorderPane();
        pane.setCenter(button);
        pane.setTop(text);

        Scene scene = new Scene(pane, 400, 400);

        primaryStage.setTitle("Hello, World!");
        primaryStage.setScene(scene);
        primaryStage.show();






    }

    public static void main(String[] args) {
        launch(args);
    }
}
