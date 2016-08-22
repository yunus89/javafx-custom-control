package com.yunusfx.javafxcustomcontrols;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp extends Application {

    private static final Logger log = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        SalesController sc = new SalesController();
        Parent rootNode = (Parent)sc.init();
        Scene scene = new Scene(rootNode, 400, 200);
        
        stage.setTitle("Custom");
        stage.setScene(scene);
        stage.show();
    }
}
