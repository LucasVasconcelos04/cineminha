module com.mycompany.cineminha {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.cineminha to javafx.fxml;
    exports com.mycompany.cineminha;
}
