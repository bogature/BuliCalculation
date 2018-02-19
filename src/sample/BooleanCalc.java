package sample;

public class BooleanCalc {
    private String firstOperand;
    private String secondOperand;
    private String operation;
    private String rezult;

    public BooleanCalc() {
    }

    public BooleanCalc(String firstOperand, String secondOperand, String operation, String rezult) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operation = operation;
        this.rezult = rezult;
    }

    @Override
    public String toString() {
        return firstOperand + " " + operation + " " + secondOperand + " = " + rezult;
    }

    public String getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(String firstOperand) {
        this.firstOperand = firstOperand;
    }

    public String getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(String secondOperand) {
        this.secondOperand = secondOperand;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getRezult() {
        return rezult;
    }

    public void setRezult(String rezult) {
        this.rezult = rezult;
    }
    
//    Operation 1 ^
    public void conjunction() {
        if ((this.getFirstOperand() == "false") || (this.getSecondOperand() == "false"))
            this.rezult = "false";
        else if ((this.getFirstOperand() == "true") && (this.getSecondOperand() == "true"))
            this.rezult = "true";
        else
            this.rezult = "null";
    }

    //    Operation 2 V
    public void disjunction() {
        if ((this.getFirstOperand() == "true") || (this.getSecondOperand() == "true"))
            this.rezult = "true";
        else if ((this.getFirstOperand() == "false") && (this.getSecondOperand() == "false"))
            this.rezult = "false";
        else
            this.rezult = "null";
    }

    //    Operation 3 ~
    public void equivalence() {
        if ((this.getFirstOperand() == "null") || (this.getSecondOperand() == "null"))
            this.rezult = "null";
        else if (this.getFirstOperand() == this.getSecondOperand())
            this.rezult = "true";
        else
            this.rezult = "false";
    }

    //    Operation 4 |
    public void barcodeScheffer() {
        if ((this.getFirstOperand() == "false") || (this.getSecondOperand() == "false"))
            this.rezult = "true";
        else if ((this.getFirstOperand() == "true") && (this.getSecondOperand() == "true"))
            this.rezult = "false";
        else
            this.rezult = "null";
    }



    //    Operation 5 (+)
    public void modTwo() {
        if ((this.getFirstOperand() == "null") || (this.getSecondOperand() == "null"))
            this.rezult = "null";
        else if (this.getFirstOperand() == this.getSecondOperand())
            this.rezult = "false";
        else
            this.rezult = "true";
    }

    //    Operation 6 →
    public void implication(){
        if((this.getFirstOperand() == "true") && (this.getSecondOperand() == "false"))
            this.rezult = "false";
        if((this.getFirstOperand() == "false") || (this.getSecondOperand() == "true"))
            this.rezult = "true";
        else
            this.rezult = "null";
    }

    //    Operation 7 !→
    public void zapImplication() {
        if((this.getFirstOperand() == "true") && (this.getSecondOperand() == "false"))
            this.rezult = "true";
        if((this.getFirstOperand() == "false") || (this.getSecondOperand() == "true"))
            this.rezult = "false";
        else
            this.rezult = "null";
    }

    //    Operation 8 ←
    public void obernImplication() {
        if((this.getSecondOperand() == "true") && (this.getFirstOperand() == "false"))
            this.rezult = "false";
        if((this.getSecondOperand() == "false") || (this.getFirstOperand() == "true"))
            this.rezult = "true";
        else
            this.rezult = "null";
    }



    //    Operation 9 !←
    public void zapOberImplication() {
        if((this.getSecondOperand() == "true") && (this.getFirstOperand() == "false"))
            this.rezult = "true";
        if((this.getSecondOperand() == "false") || (this.getFirstOperand() == "true"))
            this.rezult = "false";
        else
            this.rezult = "null";
    }

    //    Operation 10 ↓
    public void arrowPier(){
        if ((this.getFirstOperand() == "true") || (this.getSecondOperand() == "true"))
            this.rezult = "false";
        else if ((this.getFirstOperand() == "false") && (this.getSecondOperand() == "false"))
            this.rezult = "true";
        else
            this.rezult = "null";
    }



    public void reverseImplication() {
        if((this.getSecondOperand() == "true") && (this.getFirstOperand() == "false"))
            this.rezult = "false";
        if((this.getSecondOperand() == "false") || (this.getFirstOperand() == "true"))
            this.rezult = "true";
        else
            this.rezult = "null";
    }

    public void constTrue() {
        this.rezult = "true";
    }

    public void constFalse() {
        this.rezult = "false";
    }

    public void repeatFirstOperand() {
        this.rezult = this.getFirstOperand();
    }

    public void repeatSecondOperand() {
        this.rezult = this.getSecondOperand();
    }

    public void notFirstOperand() {
        if (this.getFirstOperand() == "true")
            this.rezult = "false";
        else if (this.getFirstOperand() == "false")
            this.rezult = "true";
        else
            this.rezult = "null";
    }

    public void notSecondOperand() {
        if (this.getSecondOperand() == "true")
            this.rezult = "false";
        else if (this.getSecondOperand() == "false")
            this.rezult = "true";
        else
            this.rezult = "null";
    }

    //    private Boolean valueOne;
//    private Boolean valueTwo;
//    private String rez;
//    private String operation;
//
//    public BooleanCalc() {
//    }
//
//    @Override
//    public String toString() {
//        return valueOne + " " + operation + " " + valueTwo + " = " + rez + ";";
//    }
//
//
//
//
//
//    public Boolean getValueOne() {
//        return valueOne;
//    }
//
//    public void setValueOne(Boolean valueOne) {
//        this.valueOne = valueOne;
//    }
//
//    public Boolean getValueTwo() {
//        return valueTwo;
//    }
//
//    public void setValueTwo(Boolean valueTwo) {
//        this.valueTwo = valueTwo;
//    }
//
//    public String getRez() {
//        return rez;
//    }
//
//    public void setRez(String rez) {
//        this.rez = rez;
//    }
//
//    public String getOperation() {
//        return operation;
//    }
//
//    public void setOperation(String operation) {
//        this.operation = operation;
//    }
}
