package org.lugozr.service;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Nikola Mirosavljev
 */
public class LibraryManagementUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/ui/login.fxml"));

        Scene scene = new Scene(root, 750, 500);
        scene.getStylesheets().add(getClass().getResource("/ui/assets/application.css").toString());

        primaryStage.setTitle("Menadžment Biblioteke");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
