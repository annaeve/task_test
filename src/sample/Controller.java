package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Controller {
    public GridPane myGridPane;
    public Label myLabel;
    int counter = 0;

    public void onClick(ActionEvent actionEvent) {
        counter++;
        myLabel.setText("Овечка " + counter + "...");
    }
}
