package org.example;

public class Person {

    public long sum(long num1, long num2){
        return num1 + num2;
    }

    public long divide(long num1, long num2){
        if(num2 == 0L){
            throw new ArithmeticException("НЕЛЬЗЯ ДЕЛИТЬ НА НОЛЬ!");
        }
        return num1 / num2;
    }
}
