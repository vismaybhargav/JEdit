module org.vismayb.jedit {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.vismayb.jedit to javafx.fxml;
    exports org.vismayb.jedit;
}