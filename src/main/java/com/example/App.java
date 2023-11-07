package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int operator;
        Double number1, number2, result;

        System.out.println("Choose an operation (Press Integer):\n"+
                            "1) Addition\n"+
                            "2) Subtraction\n"+
                            "3) Multiplication\n"+
                            "4) Division\n"+
                            "5) Exit\n");

        Scanner input = new Scanner(System.in);
        operator = input.nextInt();

        if(operator==5)
        {
            System.exit(0);
        }

        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) 
        {

          case 1:
            result = add(number1,number2);
            System.out.println(number1 + " + " + number2 + " = " + result);
            break;

          case 2:
            result = sub(number1,number2);
            System.out.println(number1 + " - " + number2 + " = " + result);
            break;

          case 3:
            result = mul(number1,number2);
            System.out.println(number1 + " * " + number2 + " = " + result);
            break;

          case 4:
            result = div(number1,number2);
            System.out.println(number1 + " / " + number2 + " = " + result);
            break;

          default:
            System.out.println("Invalid operator!");
            break;
        }
    }   

    public static double add(double a, double b)
    {
        return a+b;
    }
    public static double sub(double a,double b)
    {
        return a-b;
    }
    public static double mul(double a, double b)
    {
        return a*b;
    }
    public static double div(double a, double b)
    {
        return a/b;
    }
}