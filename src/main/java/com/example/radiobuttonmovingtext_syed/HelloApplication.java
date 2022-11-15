package com.example.radiobuttonmovingtext_syed;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class HelloApplication extends Application {
    public AnchorPane pain = new AnchorPane();
    public HBox textBox = new HBox();
    @Override
    public void start(Stage stage) throws IOException {
        buildUI();
        Scene scene = new Scene(pain, 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    private void buildUI() {

        //Add an HBox and repeatedly much everything up.
        textBox.setStyle("-fx-border-color: rgb(0,0,0)");
        textBox.setPadding(new Insets(0, 10, 10, 10));
        textBox.setSpacing(10);
        textBox.setPrefHeight(100);
        textBox.setPrefWidth(590);
        pain.getChildren().add(textBox);
        textBox.setLayoutX(5);
        textBox.setLayoutY(150);

        //Add Text Object
        Text text = new Text("Programming is Fun!");
        text.setFont( Font.font("Comic Sans", FontWeight.EXTRA_BOLD, 25));
        pain.getChildren().add(text);
        text.setLayoutX(300);
        text.setLayoutY(200);

        //Add five radio buttons.
        ArrayList<String> colors = new ArrayList(Arrays.asList("Red", "Yellow", "Black", "Orange", "Green"));
        ArrayList<Color> colorObjects = new ArrayList<>(Arrays.asList(Color.RED, Color.YELLOW, Color.BLACK, Color.ORANGE, Color.GREEN));

        ToggleGroup group = new ToggleGroup();
        for(int i = 0; i < 5; i++){
            ColorButton button = new ColorButton(colors.get(i), colorObjects.get(i));
            //System.out.println(colors.get(i) + " " + colorObjects.get(i).toString());
            pain.getChildren().add(button);
            button.setLayoutX(100 * i + 50);
            button.setLayoutY(25);
            button.setToggleGroup(group);
            int finalI = i;
            button.setOnAction(e ->{
                text.setFill(colorObjects.get(finalI));
            });
        }



        //Add Moving Buttons and Handlers

        //id left
        Button b = new Button("<=");

        //id right
        Button bb = new Button("=>");


    }

    public static void main(String[] args) {
        launch();
    }
}