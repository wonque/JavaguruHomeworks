package homework9.calculator;

public class Power implements Calculator {

    public double execute(double argument1, double power) {
        if (power == 0) {
            return 1;
        } else if (power == 1) {
            return argument1;
        } else if (power == -1) {
            return 1 / power;
        } else {
            return argument1 * (execute(argument1, power - 1));
        }
    }
}
