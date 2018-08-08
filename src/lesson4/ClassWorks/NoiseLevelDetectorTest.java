package lesson4.ClassWorks;

import java.util.Scanner;

public class NoiseLevelDetectorTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter DB level: ");

        int level = scanner.nextInt();

        NoiseLevelDetector detect = new NoiseLevelDetector();
        String detected = detect.detect(level);

        System.out.println("Noise level name = " + detected);

    }
}
