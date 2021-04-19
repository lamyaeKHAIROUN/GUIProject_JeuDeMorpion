package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.DragEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.util.EventObject;

public class Controller {

    @FXML
    private Button startButton;

    @FXML
    private ProgressBar loadbar;

    public void satartB (ActionEvent event) throws IOException {

        System.out.println("You clicked me!");
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("niveau1.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage)  ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        app_stage.show();


    }

    public void isLoading(DragEvent dragEvent) {

    }
}
