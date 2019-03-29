package com.lite.android.calculatorapp;

public class Calculator {
    private float leftValue;
    private float rightValue;
    private float result;

    public Calculator(float leftValue, float rightValue) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public float getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(float leftValue) {
        this.leftValue = leftValue;
    }

    public float getRightValue() {
        return rightValue;
    }

    public void setRightValue(float rightValue) {
        this.rightValue = rightValue;
    }

    public float getResult(String operator) {
        switch (operator) {
            case "+":
                result = this.leftValue + this.rightValue;
                break;
            case "-":
                result = this.leftValue - this.rightValue;
                break;
            case "*":
                result = this.leftValue * this.rightValue;
                break;
            case "/":
                if (this.rightValue == 0) {
                    result =  Float.POSITIVE_INFINITY;
                }
                result = this.leftValue / this.rightValue;
                break;
        }
        return result;
    }
}
