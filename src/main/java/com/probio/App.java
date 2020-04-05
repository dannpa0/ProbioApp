package com.probio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"));
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    public static Parent loadFXML(String fxml) throws IOException {
//        System.out.println(App.class.getResource("/org/openjfx/"+fxml + ".fxml").toString());
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/org/openjfx/"+fxml + ".fxml"));
//        System.out.println(fxmlLoader.getLocation().getPath());

        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}