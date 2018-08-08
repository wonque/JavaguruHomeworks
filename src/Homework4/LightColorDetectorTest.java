package Homework4;


public class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest tests = new LightColorDetectorTest();
        tests.notVisibleTest();
        tests.blueTest();
        tests.greenTest();
        tests.orangeTest();
        tests.violetTest();
        tests.yellowTest();
        tests.redTest();

    }

    public void notVisibleTest() {
        LightColorDetector notVisible = new LightColorDetector();
        String notVisibleTest1 = notVisible.detect(-1);
        String notVisibleTest2 = notVisible.detect(379);
        if (notVisibleTest1.equals("Light is not visible") && notVisibleTest2.equals("Light is not visible")) {
            System.out.println(notVisibleTest1);
            System.out.println(notVisibleTest2);
            System.out.println("====Light is not visible is passed!====" + "\n");
        } else {
            System.out.println("SOMETHING WENT WRONG!");
        }
    }

    public void violetTest() {
        LightColorDetector violet = new LightColorDetector();
        String violetTest1 = violet.detect(380);
        String violetTest2 = violet.detect(449);
        String violetTest3 = violet.detect(399);
        if (violetTest1.equals("Violet") && violetTest2.equals("Violet") && violetTest3.equals("Violet")) {
            System.out.println(violetTest1);
            System.out.println(violetTest2);
            System.out.println(violetTest3);
            System.out.println("====Violet test is passed!====" + "\n");

        } else {
            System.out.println("SOMETHING WENT WRONG!");

        }
    }

    public void blueTest() {
        LightColorDetector blue = new LightColorDetector();
        String blueTest1 = blue.detect(450);
        String blueTest2 = blue.detect(494);
        String blueTest3 = blue.detect(468);
        if (blueTest1.equals("Blue") && blueTest2.equals("Blue") && blueTest3.equals("Blue")) {
            System.out.println(blueTest1);
            System.out.println(blueTest2);
            System.out.println(blueTest3);
            System.out.println("====Blue test is passed!====" + "\n");
        } else {
            System.out.println("SOMETHING WENT WRONG!");

        }
    }

    public void greenTest() {

        LightColorDetector green = new LightColorDetector();
        String greenTest1 = green.detect(495);
        String greenTest2 = green.detect(569);
        String greenTest3 = green.detect(550);
        if (greenTest1.equals("Green") && greenTest2.equals("Green") && greenTest3.equals("Green")) {
            System.out.println(greenTest1);
            System.out.println(greenTest2);
            System.out.println(greenTest3);
            System.out.println("====Green test is passed!====" + "\n");
        } else {
            System.out.println("SOMETHING WENT WRONG!");

        }
    }

    public void yellowTest() {
        LightColorDetector yellow = new LightColorDetector();
        String yellowTest1 = yellow.detect(570);
        String yellowTest2 = yellow.detect(589);
        String yellowTest3 = yellow.detect(580);
        if (yellowTest1.equals("Yellow") && yellowTest2.equals("Yellow") && yellowTest3.equals("Yellow")) {
            System.out.println(yellowTest1);
            System.out.println(yellowTest2);
            System.out.println(yellowTest3);
            System.out.println("====Yellow test is passed!====" + "\n");
        } else {
            System.out.println("SOMETHING WENT WRONG!");

        }
    }

    public void orangeTest() {
        LightColorDetector orange = new LightColorDetector();
        String orangeTest1 = orange.detect(590);
        String orangeTest2 = orange.detect(619);
        String orangeTest3 = orange.detect(600);
        if (orangeTest1.equals("Orange") && orangeTest2.equals("Orange") && orangeTest3.equals("Orange")) {
            System.out.println(orangeTest1);
            System.out.println(orangeTest2);
            System.out.println(orangeTest3);
            System.out.println("====Orange test is passed!====" + "\n");
        } else {
            System.out.println("SOMETHING WENT WRONG!");

        }
    }

    public void redTest() {
        LightColorDetector red = new LightColorDetector();
        String redTest1 = red.detect(620);
        String redTest2 = red.detect(749);
        String redTest3 = red.detect(730);
        if (redTest1.equals("Red") && redTest2.equals("Red") && redTest3.equals("Red")) {
            System.out.println(redTest1);
            System.out.println(redTest2);
            System.out.println(redTest3);
            System.out.println("====Red test is passed!====" + "\n");
        } else {
            System.out.println("SOMETHING WENT WRONG!");
        }
    }
}
