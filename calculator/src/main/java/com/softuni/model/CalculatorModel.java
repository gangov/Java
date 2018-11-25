package com.softuni.model;

public class CalculatorModel {
    private Double leftOperand;
    private String operator;
    private Double rightOperand;

    public CalculatorModel() {
    }

    public Double getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(Double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Double getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(Double rightOperand) {
        this.rightOperand = rightOperand;
    }

    public Double calculate() {
        switch (this.operator) {
            case "+":
                return this.leftOperand + this.leftOperand;
            case "-":
                return this.leftOperand - this.rightOperand;
            case "*":
                return this.leftOperand * this.rightOperand;
            case "/":
                return this.leftOperand / this.rightOperand;
            default:
                return 0d;
        }
    }
}
