package homework9.calculator;

import java.util.Scanner;

public class CalcForm {

    public double getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        double number;
        if (sc.hasNextDouble()) {
            number = sc.nextDouble();
        } else {
            System.out.println("Wrong input. Try again");
            sc.next();
            number = getNumber();
        }
        return number;
    }

    public char getOperation() {
        Scanner sc = new Scanner(System.in);
        char operation;
        System.out.println("Enter operation: ");
        operation = sc.next().charAt(0);
        if (isOperationValid(operation)) {
            return operation;
        } else {
            System.out.println("Not a valid operation");
            showValidOperation();
            operation = getOperation();
        }
        return operation;
    }

    private boolean isOperationValid(char operation) {
        return operation == '+' || operation == '*'
                || operation == '/' || operation == 'p' ||
                operation == '-';
    }

    private void showValidOperation() {
        System.out.println("\nSum: +");
        System.out.println("Subtraction: -");
        System.out.println("Multiplication: *");
        System.out.println("Division: /");
        System.out.println("Power: p\n");
    }

    public void performOperation(double num1, double num2, char operation) {
        double result;
        if (operation == '+') {
            Sum sum = new Sum();
            result = sum.execute(num1, num2);
            System.out.println("Your result: " + result);
        } else if (operation == '/' && num2 != 0) {
            Divide divide = new Divide();
            result = divide.execute(num1, num2);
            System.out.println("Your result: " + result);
        } else if (operation == '-') {
            Subtraction subtraction = new Subtraction();
            result = subtraction.execute(num1, num2);
            System.out.println("Your result: " + result);

        } else if (operation == '*') {
            Multiply multiply = new Multiply();
            result = multiply.execute(num1, num2);
            System.out.println("Your result: " + result);
        } else if (operation == 'p') {
            Power power = new Power();
            result = power.execute(num1, num2);
            System.out.println("Your result: " + result);
        }

    }
}
