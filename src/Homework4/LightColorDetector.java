package Homework4;

public class LightColorDetector {

    public String detect (int wavelight) {

        if (wavelight>=380 && wavelight <450) {
            return "Violet";
        }
        if (wavelight>=450 && wavelight<495) {
            return "Blue";
        }
        if (wavelight>=495 && wavelight<570) {
            return "Green";
        }
        if (wavelight >=570 && wavelight<590) {
            return "Yellow";
        }
        if (wavelight >= 590 && wavelight<620) {
            return "Orange";
        }
        if (wavelight>=620 && wavelight<750) {
            return "Red";
        }

        return "Light is not visible";


    }
}
