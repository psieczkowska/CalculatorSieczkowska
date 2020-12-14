package edu.ib;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class JavaFXCalculatorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField display;

    @FXML
    private Button btnC;

    @FXML
    private Button btnChangeSign;

    @FXML
    private Button btnPercent;

    @FXML
    private Button btnDivide;

    @FXML
    private Button btnSeven;

    @FXML
    private Button btnEight;

    @FXML
    private Button btnNine;

    @FXML
    private Button btnMultiply;

    @FXML
    private Button btnFour;

    @FXML
    private Button btnFive;

    @FXML
    private Button btnSix;

    @FXML
    private Button btnSubstract;

    @FXML
    private Button btnOne;

    @FXML
    private Button btnTwo;

    @FXML
    private Button btnThree;

    @FXML
    private Button btnAddition;

    @FXML
    private Button btnZero;

    @FXML
    private Button btnDot;

    @FXML
    private Button btnEqual;

    Methods c = new Methods();


    @FXML
    void onAdditionClick(ActionEvent event) {
        c.onAdditionClick(display);
    }

    @FXML
    void onChangeSignClick(ActionEvent event) {
        c.onChangeSignClick(display);
    }

    @FXML
    void onClearClick(ActionEvent event) {
        c.onClearClick(display);
    }

    @FXML
    void onDivideClick(ActionEvent event) {
        c.onDivideClick(display);
    }

    @FXML
    void onDotClick(ActionEvent event) {
        c.onDotClick(display);
    }

    @FXML
    void onEightClick(ActionEvent event) {
        c.onEightClick(display);
    }

    @FXML
    void onEqualClick(ActionEvent event) {
        c.onEqualClick(display);
    }

    @FXML
    void onFiveClick(ActionEvent event) {
        c.onFiveClick(display);
    }

    @FXML
    void onFourClick(ActionEvent event) {
        c.onFourClick(display);
    }

    @FXML
    void onMultiplyClick(ActionEvent event) {
        c.onMultiplyClick(display);
    }

    @FXML
    void onNineClick(ActionEvent event) {
        c.onNineClick(display);
    }

    @FXML
    void onOneClick(ActionEvent event) {
        c.onOneClick(display);
    }

    @FXML
    void onPercentClick(ActionEvent event) {
        c.onPercentClick(display);
    }

    @FXML
    void onSevenClick(ActionEvent event) {
        c.onSevenClick(display);
    }

    @FXML
    void onSixClick(ActionEvent event) {
        c.onSixClick(display);
    }

    @FXML
    void onSubstractClick(ActionEvent event) {
        c.onSubstractClick(display);
    }

    @FXML
    void onThreeClick(ActionEvent event) {
        c.onThreeClick(display);
    }

    @FXML
    void onTwoClick(ActionEvent event) {
        c.onTwoClick(display);
    }

    @FXML
    void onZeroClick(ActionEvent event) {
        c.onZeroClick(display);
    }

    @FXML
    void initialize() {
        assert display != null : "fx:id=\"display\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnC != null : "fx:id=\"btnC\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnChangeSign != null : "fx:id=\"btnChangeSign\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnPercent != null : "fx:id=\"btnPercent\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnDivide != null : "fx:id=\"btnDivide\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnSeven != null : "fx:id=\"btnSeven\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnEight != null : "fx:id=\"btnEight\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnNine != null : "fx:id=\"btnNine\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnMultiply != null : "fx:id=\"btnMultiply\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnFour != null : "fx:id=\"btnFour\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnFive != null : "fx:id=\"btnFive\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnSix != null : "fx:id=\"btnSix\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnSubstract != null : "fx:id=\"btnSubstract\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnOne != null : "fx:id=\"btnOne\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnTwo != null : "fx:id=\"btnTwo\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnThree != null : "fx:id=\"btnThree\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnAddition != null : "fx:id=\"btnAddition\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnZero != null : "fx:id=\"btnZero\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnDot != null : "fx:id=\"btnDot\" was not injected: check your FXML file 'calculator.fxml'.";
        assert btnEqual != null : "fx:id=\"btnEqual\" was not injected: check your FXML file 'calculator.fxml'.";

    }
}