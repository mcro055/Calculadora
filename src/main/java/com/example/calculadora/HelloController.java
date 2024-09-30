package com.example.calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Button btn2;
    @FXML
    private Button btn1;
    @FXML
    private Label MainLabel;
    @FXML
    private Button btnDiv;
    @FXML
    private Button btnMns;
    @FXML
    private Button btnPls;
    @FXML
    private Button btnTms;
    @FXML
    private Button btn8;
    @FXML
    private Button btnEq;
    @FXML
    private Button btn9;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn3;
    @FXML
    private Button btn0;
    @FXML
    private Button CA;

    @FXML
    public void Prsdbtn0() {
        MainLabel.setText(MainLabel.getText()+"0");
    }
    @FXML
    public void Prsdbtn1() {
        MainLabel.setText(MainLabel.getText()+"1");
    }
    @FXML
    public void Prsdbtn2() {
        MainLabel.setText(MainLabel.getText()+"2");
    }

    @FXML
    public void Prsdbtn3() {
        MainLabel.setText(MainLabel.getText()+"3");
    }

    @FXML
    public void Prsdbtn4() {
        MainLabel.setText(MainLabel.getText()+"4");
    }

    @FXML
    public void Prsdbtn5() {
        MainLabel.setText(MainLabel.getText()+"5");
    }

    @FXML
    public void Prsdbtn6() {
        MainLabel.setText(MainLabel.getText()+"6");
    }

    @FXML
    public void Prsdbtn7() {
        MainLabel.setText(MainLabel.getText()+"7");
    }

    @FXML
    public void Prsdbtn8() {
        MainLabel.setText(MainLabel.getText()+"8");
    }

    @FXML
    public void Prsdbtn9() {
        MainLabel.setText(MainLabel.getText()+"9");
    }


    @FXML
    public void PrsdbtnPls() {
    }

    @FXML
    public void PrsdbtnMns() {
    }

    @FXML
    public void PrsdbtnTms() {
    }

    @FXML
    public void PrsdbtnEq() {
    }

    @FXML
    public void PrsdbtnDiv() {
    }

    @FXML
    public void PrsdbtnCA() {
        MainLabel.setText("");
    }
}