package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class TemperatureController {
    @FXML
    private TextField numberInputField;
    private double number;
    public Label resultLabel;
    private void getUserInput() {
        String userInput = numberInputField.getText();
        try {
            number = Double.parseDouble(userInput);
            System.out.println("Entered number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid double. ");
        }

    }
    @FXML
    public void celsiusToFahrenheit() {
        getUserInput();
        double newNumber = (number * 9.0/5.0) + 32;
        resultLabel.setText(String.valueOf(newNumber));
    }
    @FXML
    public void celsiusToKelvin() {
        getUserInput();
        double newNumber = number + 273.15;
        resultLabel.setText(String.valueOf(newNumber));
    }
    @FXML
    public void fahrenheitToCelsius() {
        getUserInput();
        double newNumber = (number - 32) * 5.0/9.0;
        resultLabel.setText(String.valueOf(newNumber));
    }
    @FXML
    public void fahrenheitToKelvin() {
        getUserInput();
        double newNumber = ((number - 32) * 5.0/9.0) + 273.15;
        resultLabel.setText(String.valueOf(newNumber));
    }
    @FXML
    public void kelvinToCelsius() {
        getUserInput();
        double newNumber = number - 273.15;
        resultLabel.setText(String.valueOf(newNumber));
    }
    @FXML
    public void kelvinToFahrenheit() {
        getUserInput();
        double newNumber = (number - 273.15) * 9.0/5.0 + 32;
        resultLabel.setText(String.valueOf(newNumber));
    }
}