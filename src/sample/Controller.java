package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;



import java.io.IOException;

public class Controller {

    @FXML
    private Button button1;

    public void buttonIsClicked(ActionEvent event) throws IOException {
        button1.setText("X");
    }
}
