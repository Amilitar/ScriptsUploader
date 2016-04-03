package com.sibhtc.scriptsuploader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * User: nikpodrivnik
 * Date: 28/10/15
 */
public class MainApp extends Application {

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        String fxmlFile = "/fxml/hello.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = (Parent) loader.load(getClass().getResource(fxmlFile));
        stage.setTitle("ScriptUploader 0.0.1");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
