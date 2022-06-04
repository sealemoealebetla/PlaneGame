module com.example.cloudeplanegame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cloudeplanegame to javafx.fxml;
    exports com.example.cloudeplanegame;
}