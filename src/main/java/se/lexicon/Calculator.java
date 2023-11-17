package se.lexicon;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int operator;
            double n1,n2;
            System.out.println("1-Add \n 2 - Subtract \n 3 -Multiply \n4 -Divide \n0-Exit");
            System.out.println("Choose Operator (0 to exit):");
            operator = sc.nextInt();
            //Exit the lopp if the user chooses 0
            if (operator == 0) {
                System.out.println("Exiting the Calculator.Goodbye!");
                break;

            }

            System.out.println("Enter first number :");
            n1 = sc.nextFloat();
            System.out.println("Enter second number :");
            n2 = sc.nextFloat();

            double result = 0;
            switch (operator) {
                case 1:
                    result = n1 + n2;
                    break;
                case 2:
                    result = n1 - n2;
                    break;
                case 3:
                    result = n1 * n2;
                    break;
                case 4:
                    //check division by zero
                    if (n2 != 0) {
                        result = (double) n1 / n2;
                    } else {
                        System.out.println("Can not divide by Zero");
                        continue;  // restart the loop without performing the calculator
                    }

                    break;
                default:
                    System.out.println("Invalid operator");
                    continue;  // restart the loop without performing the calculator
            }
            System.out.println("Result is : " + result);
        }
        sc.close();

    }
}