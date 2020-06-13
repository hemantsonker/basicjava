package com.ibm.calculator;

public class Main {

    public static  void main (String[] args){
        SimpleCalculator calc=new SimpleCalculator();
        calc.setFirstNumber(10.0);
        calc.setSecondNumber(4);

        System.out.println("Additon " + calc.getAdditionResult());
        System.out.println("Subtraction " + calc.getSubtractionResult());
        System.out.println("Multiplication" + calc.getMultiplicationResult());
        System.out.println("Divide " + calc.getDivisionResult());

    }
}
