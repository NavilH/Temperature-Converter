package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TemperatureConverter extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TemperatureConverter.class.getResource("temperatureconverter-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 420, 240);
        scene.getStylesheets().add(TemperatureConverter.class.getResource("styles.css").toExternalForm());
        stage.setTitle("Temperature Converter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}