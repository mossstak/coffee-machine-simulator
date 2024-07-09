# Coffee Machine Simulator

This project is a simple Coffee Machine Simulator built using Java and JavaFX. It simulates the process of making an espresso, including grinding coffee beans and brewing the coffee.

## Features

- Simulates grinding coffee beans at different grind levels.
- Simulates brewing espresso with varying extraction times based on grind levels.
- Provides feedback on the quality of the espresso based on the extraction time.

## Project Structure

- `CoffeeMachineApp.java`: The main application class that sets up the JavaFX UI and handles user interactions.
- `Coffee.java`: Represents a coffee object with properties like name, water amount, and coffee beans amount.
- `CoffeeGrinder.java`: Simulates the process of grinding coffee beans.
- `EspressoMachine.java`: Simulates the process of brewing espresso.
- `Inventory.java`: Manages the inventory of coffee beans and water.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- JavaFX SDK

### Running the Application

1. Clone the repository:
    ```sh
    git clone https://github.com/mossstak/coffee-machine-simulator.
    cd coffeemachine
    ```

2. Compile and run the application:
    ```sh
    ./gradlew run
    ```

### Using the Application

1. Launch the application.
2. Enter a grind level between 1 and 10.
3. Click the "Make Espresso" button.
4. The application will simulate the grinding and brewing process and provide feedback on the quality of the espresso.

## Code Overview

### CoffeeMachineApp.java

This is the main class that sets up the JavaFX UI and handles user interactions. It includes:

- A `GridPane` layout with labels, text fields, and buttons.
- Event handling for the "Make Espresso" button to simulate the coffee-making process.
- Feedback on the quality of the espresso based on the extraction time.

### Coffee.java

This class represents a coffee object with properties like:

- `name`: The name of the coffee.
- `water`: The amount of water required.
- `coffeeBeans`: The amount of coffee beans required.

### CoffeeGrinder.java

This class simulates the process of grinding coffee beans. It includes a method to grind coffee beans at a specified grind level.

### EspressoMachine.java

This class simulates the process of brewing espresso. It includes methods to calculate the extraction time based on the grind level and to brew the coffee.

### Inventory.java

This class manages the inventory of coffee beans and water. It includes methods to check if there are enough ingredients and to use ingredients when making coffee.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
