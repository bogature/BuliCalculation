package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.Objects;


public class Controller {

    private boolean operationFlag;

    @FXML
    private Label lbl1;

    @FXML
    private Label lblOper;

    @FXML
    private Label lbl2;

    @FXML
    private Label lblRezOper;

    @FXML
    private Button btnRez;

    @FXML
    private TextArea textAreaHistory;

    ArrayList<BooleanCalc> calc = new ArrayList<>();

    BooleanCalc bulCalc = new BooleanCalc();

    @FXML
    void initialize(){

    }

    @FXML
    void onClickBtnApdate(ActionEvent event) {
        lblRezOper.setText("");
        bulCalc.setOperation(null);
    }

    @FXML
    void onClickTrue(ActionEvent event) {
        if (bulCalc.getOperation() == null){
            bulCalc.setFirstOperand("true");
            lblRezOper.setText(String.valueOf(bulCalc.getFirstOperand()));
        } else {
            bulCalc.setSecondOperand("true");
            lblRezOper.setText(String.valueOf(bulCalc.getFirstOperand()) + " " + bulCalc.getOperation() + " " + String.valueOf(bulCalc.getSecondOperand()));
        }
    }
//
    @FXML
    void onClickFalse(ActionEvent event) {
        if (bulCalc.getOperation() == null){
            bulCalc.setFirstOperand("false");
            lblRezOper.setText(String.valueOf(bulCalc.getFirstOperand()));
        } else {
            bulCalc.setSecondOperand("false");
            lblRezOper.setText(String.valueOf(bulCalc.getFirstOperand()) + " " + bulCalc.getOperation() + " " + String.valueOf(bulCalc.getSecondOperand()));
        }
    }
//
    @FXML
    void onClickNull(ActionEvent event) {
        if (bulCalc.getOperation() == null){
            bulCalc.setFirstOperand("null");
            lblRezOper.setText(String.valueOf(bulCalc.getFirstOperand()));
        } else {
            bulCalc.setSecondOperand("null");
            lblRezOper.setText(String.valueOf(bulCalc.getFirstOperand()) + " " + bulCalc.getOperation() + " " + String.valueOf(bulCalc.getSecondOperand()));
        }
    }

//    *************************************************************

    @FXML
    void onClickbtnConjunction(ActionEvent event) {
        bulCalc.setOperation(" ^ ");
    }

    @FXML
    void onClickBtnDisunction(ActionEvent event) {
        bulCalc.setOperation(" V ");
    }

    @FXML
    void onClickBtnEquivalence(ActionEvent event) {
        bulCalc.setOperation(" ~ ");
    }

    @FXML
    void onClickBtnBarcodeScheffer(ActionEvent event) {
        bulCalc.setOperation(" | ");
    }



    @FXML
    void onClickBtnModTwo(ActionEvent event) {
        bulCalc.setOperation(" (+) ");
    }

    @FXML
    void onClickBtnImplication(ActionEvent event) {
        bulCalc.setOperation(" → ");
    }

    @FXML
    void onClickBtnZapImplication(ActionEvent event) {
        bulCalc.setOperation(" !→ ");
    }

    @FXML
    void onClickBtnObernImplication(ActionEvent event) {
        bulCalc.setOperation(" ← ");
    }



    @FXML
    void onClickBtnZapOberImplication(ActionEvent event) {
        bulCalc.setOperation(" !← ");
    }

    @FXML
    void onClickBtnArrowPier(ActionEvent event) {
        bulCalc.setOperation(" ↓ ");
    }




    @FXML
    void onClickBtnConstFalse(ActionEvent event) {
        bulCalc.setOperation(" (const 0) ");
    }

    @FXML
    void onClickBtnConstTrue(ActionEvent event) {
        bulCalc.setOperation(" (const 1) ");
    }

    @FXML
    void onClickBtnRepeatSecondOperand(ActionEvent event) {
        bulCalc.setOperation(" (repeat second) ");
    }

    @FXML
    void onClickBtnRepeatFirstOperand(ActionEvent event) {
        bulCalc.setOperation(" (repeat first) ");
    }

    @FXML
    void onClickBtnNotSecondOperand(ActionEvent event) {
        bulCalc.setOperation(" (not second) ");
    }

    @FXML
    void onClickBtnNotFirstOperand(ActionEvent event) {
        bulCalc.setOperation(" (not first) ");
    }

    @FXML
    void onClickRez(ActionEvent event) {

        if (Objects.equals(bulCalc.getOperation(), " ^ "))
            bulCalc.conjunction();

        else if (Objects.equals(bulCalc.getOperation(), " V "))
            bulCalc.disjunction();

        else if (Objects.equals(bulCalc.getOperation(), " ~ "))
            bulCalc.equivalence();

        else if (Objects.equals(bulCalc.getOperation(), " | "))
            bulCalc.barcodeScheffer();



        else if (Objects.equals(bulCalc.getOperation(), " (+) "))
            bulCalc.modTwo();

        else if (Objects.equals(bulCalc.getOperation(), " → "))
            bulCalc.implication();

        else if (Objects.equals(bulCalc.getOperation(), " !→ "))
            bulCalc.zapImplication();

        else if (Objects.equals(bulCalc.getOperation(), " ← "))
            bulCalc.obernImplication();



        else if (Objects.equals(bulCalc.getOperation(), " !← "))
            bulCalc.zapOberImplication();

        else if (Objects.equals(bulCalc.getOperation(), " ↓ "))
            bulCalc.arrowPier();

        else if (Objects.equals(bulCalc.getOperation(), " (const 0) "))
            bulCalc.constFalse();

        else if (Objects.equals(bulCalc.getOperation(), " (const 1) "))
            bulCalc.constTrue();

        else if (Objects.equals(bulCalc.getOperation(), " (repeat second) "))
            bulCalc.repeatSecondOperand();

        else if (Objects.equals(bulCalc.getOperation(), " (repeat first) "))
            bulCalc.repeatFirstOperand();

        else if (Objects.equals(bulCalc.getOperation(), " (not second) "))
            bulCalc.notSecondOperand();

        else if (Objects.equals(bulCalc.getOperation(), " (not first) "))
            bulCalc.notFirstOperand();


        System.out.println(bulCalc.getRezult());
        lblRezOper.setText(bulCalc.getFirstOperand() + " " + bulCalc.getOperation() + " " + bulCalc.getSecondOperand() + " = " + bulCalc.getRezult());


        calc.add(0, new BooleanCalc(bulCalc.getFirstOperand(), bulCalc.getSecondOperand(), bulCalc.getOperation(),  bulCalc.getRezult()));


        String buf = "";
        for (BooleanCalc obj : calc)
            buf += obj + "\n";
        textAreaHistory.setText(buf);
    }



}
