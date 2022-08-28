package org.example;

import java.util.Scanner;

public class CalculatorImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        System.out.println("enter 1st number = " + firstNum);
        int secondNum = sc.nextInt();
        System.out.println("enter 2nd number = " + secondNum);

        Calculator input = new Calculator();
        input.setFirstNum(firstNum);
        input.setSecondNum(secondNum);
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