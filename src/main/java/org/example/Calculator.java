/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 28-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package org.example;

public class Calculator {
    private int result;
    private int firstNum;
    private int secondNum;

    public Calculator() {
    }

    public Calculator(int result, int firstNum, int secondNum) {
        this.result = result;
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public int sub(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public int divide(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }

    public int module(int firstNum, int secondNum) {
        return firstNum % secondNum;
    }
}
