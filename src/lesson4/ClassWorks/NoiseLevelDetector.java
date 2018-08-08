package lesson4.ClassWorks;

public class NoiseLevelDetector {

    int level;


    public String detect(int level) {
        if (level >= 130) {
            return "Jackhammer";
        }
        if (70 <= level && level < 130) {
            return "Gas lawnmower";
        }
        if (40 <= level && level < 70) {
            return "Alarm clock";
        }
        else {
            return "Quiet room";
        }
    }
}