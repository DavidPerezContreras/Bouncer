module org.iesmurgi.bouncer {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.iesmurgi.bouncer to javafx.fxml;
    exports org.iesmurgi.bouncer;
}