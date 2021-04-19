package controller;




import ai.MultiLayerPerceptron;
import ai.SigmoidalTransferFunction;
import ai.Test;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.input.DragEvent;
import javafx.stage.Stage;
import sample.Main;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class TestContoller implements Initializable {

    private MultiLayerPerceptron net;

    public TestContoller() {
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void setStage(Stage stage) {
    }

    public void setMainApp(Main m) {
   //     this.mainApp = m;
    }

    public void pressButtonTest(ActionEvent event) {
    }

    public void pressStartButtoon(ActionEvent event) {

    }

    public void pressPauseButton(ActionEvent event) {
    }

    public void pressStopButton(ActionEvent event) {
    }

    //public void getTask (HashMap<Integer, Coup> mapTrain){}

/*
    // Feilds


    @FXML
    private Button startButton;

    @FXML
    private Button pauseButton;
    @FXML
    private Button stopButton;
    @FXML
    private TextField tf;
    @FXML
    private ProgressIndicator pi;
    @FXML
    private ProgressBar pb;

    private Main mainApp;


    @FXML
    public void pressStartButtoon(){
        try {
            int size=9;
            System.out.println();
            System.out.println("Start training...");
            int [] layers= new int []{128,size,128};

            if (this.net==null){
                this.net= new MultiLayerPerceptron(layers,0.1,new SigmoidalTransferFunction)
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



*/


}
