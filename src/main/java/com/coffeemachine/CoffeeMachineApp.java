package com.coffeemachine;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.Random;

public class CoffeeMachineApp extends Application {
    private Inventory inventory = new Inventory(500, 100); // Initial inventory
    private CoffeeGrinder coffeeGrinder = new CoffeeGrinder();
    private EspressoMachine espressoMachine = new EspressoMachine();
    private Random random = new Random();

    @Override
    public void start(@SuppressWarnings("exports") Stage primaryStage) {
        primaryStage.setTitle("Coffee Machine Simulator");

        // UI Elements
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER); // Center the grid itself
        grid.setVgap(20); // Set vertical gap between elements

        Label titleLabel = new Label("Espresso Machine");
        titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24)); // Set font to Arial, bold, size 24
        GridPane.setHalignment(titleLabel, HPos.CENTER); // Center the title label horizontally

        Label grindLabel = new Label("Grind level (1-10):");
        TextField grindField = new TextField();
        GridPane.setMargin(grindField, new Insets(0, 0, 0, 10)); // Add margin to the left of grindField

        Button makeCoffeeButton = new Button("Make Espresso");
        GridPane.setHalignment(makeCoffeeButton, HPos.CENTER); // Center the button horizontally
        Label resultLabel = new Label();
        Label extractionLabel = new Label();
        GridPane.setHalignment(resultLabel, HPos.CENTER); 
        GridPane.setHalignment(extractionLabel, HPos.CENTER);
        // Adding title to the grid
        grid.add(titleLabel, 0, 0, 2, 1); // Spanning across 2 columns

        makeCoffeeButton.setOnAction(event -> {
            try {
                Coffee espresso = new Coffee("Espresso", 50, 18);

                if (inventory.checkIngredients(espresso)) {
                    int grindLevel = random.nextInt(10) + 1; // Random grind level between 1 and 10
                    coffeeGrinder.grindCoffee(espresso.getCoffeeBeans(), grindLevel);
                    inventory.useIngredients(espresso);
                    int extractionTime = espressoMachine.brewCoffee(espresso, grindLevel);
                    if (extractionTime < 28) {
                        extractionLabel.setText("The extraction time is " + extractionTime + " seconds.");
                        resultLabel.setText("The coffee is under-extracted (too coarse). Adjust the grinder.");
                    } else if (extractionTime > 33) {
                        extractionLabel.setText("The extraction time is " + extractionTime + " seconds.");
                        resultLabel.setText("The coffee is over-extracted (too fine). Adjust the grinder.");
                    } else {
                        extractionLabel.setText("The extraction time is " + extractionTime + " seconds.");
                        resultLabel.setText("Enjoy your " + espresso.getName());
                    }
                } else {
                    resultLabel.setText("Sorry, can't make your coffee.");
                }
            } catch (NumberFormatException e) {
                resultLabel.setText("Invalid input. Please enter numbers.");
            }
        });

        // Adjusting other elements' positions to accommodate the title
        grid.add(grindLabel, 0, 1);
        grid.add(grindField, 1, 1);
        grid.add(makeCoffeeButton, 0, 2, 2, 1);
        grid.add(extractionLabel, 0, 3, 2, 1);
        grid.add(resultLabel, 0, 4, 2, 1);

        Scene scene = new Scene(grid, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
