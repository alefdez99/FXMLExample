module es.ieslosmontecillos.fxmlexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.fxmlexample to javafx.fxml;
    exports es.ieslosmontecillos.fxmlexample;
}