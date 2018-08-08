package lesson4.ClassWorks;

public class DogAgeCalculatorTest {

    public static void main(String[] args) {
        DogAgeCalculator calculator = new DogAgeCalculator();
        int dogAge = calculator.toDogAge(28);
        System.out.println("If human age is 28 then dog age is " + dogAge);

        int humanAge = calculator.toHumanAge(4);
        System.out.println("If dog age is 4 then human age is " + humanAge);

    }
}
