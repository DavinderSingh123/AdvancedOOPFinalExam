module com.example.w22comp1011gctest2student {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.w22comp1011gctest2student to javafx.fxml;
    exports com.example.w22comp1011gctest2student;
    exports com.example.w22comp1011gctest2student.model;

    opens com.example.w22comp1011gctest2student.model to javafx.fxml, com.google.gson;
}