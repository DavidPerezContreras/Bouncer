package org.iesmurgi.bouncer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class HelloController {


    @FXML
    private Bouncer bouncer;
    @FXML
    private Pane rootr;

    public void initialize(){
        Thread th = new Thread(bouncer);
        th.setDaemon(true);
        th.start();
    }
}