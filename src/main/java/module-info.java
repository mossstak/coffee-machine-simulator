module com.coffeemachine {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.coffeemachine to javafx.fxml;
    exports com.coffeemachine;
}
