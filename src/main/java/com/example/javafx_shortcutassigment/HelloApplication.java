package com.example.javafx_shortcutassigment;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        Scene scene = new Scene(pane,600,600);

        Label lbSave = new Label("Ctrl + s for save:");
        lbSave.setLayoutX(100);
        lbSave.setLayoutY(50);


        Label label = new Label("Insert value:");
        label.setLayoutX(100);
        label.setLayoutY(80);

        TextField tx = new TextField();
        tx.setStyle("-fx-background-color: White");
        tx.setLayoutX(100);
        tx.setLayoutY(100);
        tx.setPrefWidth(200);

        pane.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if( event.isControlDown() && event.getCode().equals(KeyCode.S) ) {
                    System.out.println("Saving values.");

                }
            }
        });



        tx.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {

                tx.setStyle("-fx-background-color: Red");
            }
        });

        tx.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {

                tx.setStyle("-fx-background-color: White");
            }
        });


        pane.getChildren().addAll(tx, label, lbSave);

        primaryStage.setScene(scene);
        primaryStage.setTitle("event bubble");
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}