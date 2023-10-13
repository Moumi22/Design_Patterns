package Task_3;

abstract class Calculator {
    public abstract double calculate(double num1, double num2);
}

class Addition extends Calculator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }
}

class Subtraction extends Calculator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 - num2;
    }
}

class Multiplication extends Calculator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 * num2;
    }
}

class CalculatorApp {
    public static void main(String[] args) {
        Calculator additionCalculator = new Addition();
        System.out.println("Addition : " + additionCalculator.calculate(6, 4));

        Calculator subtractionCalculator = new Subtraction();
        System.out.println("Subtraction : " + subtractionCalculator.calculate(14, 8));

        Calculator multiplicationCalculator = new Multiplication();
        System.out.println("Multiplication : " + multiplicationCalculator.calculate(4, 4));
    }
}