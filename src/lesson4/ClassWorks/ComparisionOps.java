package lesson4.ClassWorks;

public class ComparisionOps {

    private int a;
    private int b;

    public ComparisionOps (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean isGreater() {
        return a>b;
    }

    public boolean isLess() {
        return a<b;
    }

    public boolean isGreaterOrEqual() {
        return a>=b;
    }

    public boolean isEqual() {
        return a == b;
    }

    public boolean isLessOrEqual() {
        return a<=b;
    }

    public boolean isNotEqual () {
        return a!=b;
    }


    public static void main(String[] args) {
//        int a = 4;
//        int b = 5;
//        ComparisionOps comparision = new ComparisionOps(a,b);
//        System.out.println(comparision.isGreater());
//        System.out.println(comparision.isLess());
//        System.out.println(comparision.isEqual());
//        System.out.println(comparision.isGreaterOrEqual());
//        System.out.println(comparision.isLessOrEqual());
//        System.out.println(comparision.isNotEqual());

        int a = 5;
        int b = 4;

        ComparisionOps comparision = new ComparisionOps(a,b);
        System.out.println(comparision.isGreater());
        System.out.println(comparision.isLess());
        System.out.println(comparision.isEqual());
        System.out.println(comparision.isGreaterOrEqual());
        System.out.println(comparision.isLessOrEqual());
        System.out.println(comparision.isNotEqual());




    }
}
