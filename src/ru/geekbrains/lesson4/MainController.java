package ru.geekbrains.lesson4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Button send;
    @FXML
    private TextArea textArea;
    @FXML
    private TextField message;

    @FXML
    private void click(ActionEvent event) {
        textArea.setText(textArea.getText() +  '\n' + "You: " +message.getText());
        message.setText("");
    }
}
