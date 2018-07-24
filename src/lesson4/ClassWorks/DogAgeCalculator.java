package lesson4.ClassWorks;

public class DogAgeCalculator {

    int age;

    public int toHumanAge (int dogAge) {
        if (dogAge == 1) {
            age = 15;
            return age;}
        if (dogAge == 2) {
            age = 15+9;
            return age;}
        else {
            age = 4 + this.toHumanAge(dogAge-1);
            return age;
        }

    }

    public int toDogAge (int humanAge) {
        if (humanAge <=15) {
            age = 1;
            return age;
        }
        if (humanAge>15 && humanAge<= 24) {
            age = 2;
            return age;
        }
        else {
            age = 1 + this.toDogAge(humanAge - 4);
            return age;
        }
    }

}
