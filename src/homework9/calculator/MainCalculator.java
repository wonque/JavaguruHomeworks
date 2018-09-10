package homework9.calculator;

public class MainCalculator {

    public static void main(String[] args) {
        CalcForm calcForm = new CalcForm();
        double num1 = calcForm.getNumber();
        char op = calcForm.getOperation();
        double num2 = calcForm.getNumber();
        calcForm.performOperation(num1, num2, op);

    }
}
