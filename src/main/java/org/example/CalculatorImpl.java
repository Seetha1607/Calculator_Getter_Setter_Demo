package org.example;

public class CalculatorImpl {
    public static void main(String[] args) {

        Calculator input = new Calculator();
        input.setFirstNum(25);
        input.setSecondNum(25);
        int addResult = input.add(input.getFirstNum(), input.getSecondNum());
        System.out.println("addResult = " + addResult);
        int subResult = input.sub(input.getFirstNum(), input.getSecondNum());
        System.out.println("subResult = " + subResult);
        int mulResult = input.multiply(input.getFirstNum(), input.getSecondNum());
        System.out.println("mulResult = " + mulResult);
        int divideResult = input.divide(input.getFirstNum(), input.getSecondNum());
        System.out.println("divideResult = " + divideResult);
        int moduloResult = input.module(input.getFirstNum(), input.getSecondNum());
        System.out.println("moduloResult = " + moduloResult);
    }
}