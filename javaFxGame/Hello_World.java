package javaFxGame;
import javafx.application.Application;

import javafx.scene.control.*;  

import javafx.stage.Stage;

import javafx.scene.layout.*;

import javafx.scene.*;

 

 

public class Hello_World extends Application{  


    public static void main(String[] args) {

        launch();

    }


    @Override  

    public void start(Stage primaryStage) throws Exception {  

        // TODO Auto-generated method stub  

        Button btn1= new Button("Button");

        Button btn2= new Button("Button");

        Button btn3= new Button("Button");

        Button btn4= new Button("Button");


        GridPane root = new GridPane();


        root.add(btn1, 0, 0);

        root.add(btn2, 1, 1);

        root.add(btn3, 2, 2);

        root.add(btn4, 3, 3);


        Scene sc = new Scene(root);


        primaryStage.setScene(sc);

        primaryStage.show();

    }  


}  