package lesson4.ClassWorks;

public class OrAnd {
    int a;
    int b;
    int c;

    public OrAnd (int a, int b) {
        this.a = a;
        this.b = b;
        this.c = a-b;
    }

    public boolean resultOr () {
        return (c==a) || (c == b) || (c==0);
    }

    public boolean resultAnd () {
        return (a>=0) && (b>=0) && (c>=0);
    }

    public static void main(String[] args) {
        OrAnd or1 = new OrAnd(10, 5);
        System.out.println(or1.resultOr());

        OrAnd or2 = new OrAnd(-1, -1);
        System.out.println(or2.resultOr());

        OrAnd or3 = new OrAnd(20, 0);
        System.out.println(or3.resultOr());

        OrAnd or4 = new OrAnd(100, 20);
        System.out.println(or4.resultOr());

        System.out.println("====AND RESULT====");

        OrAnd and1 = new OrAnd(10, 5);
        System.out.println(and1.resultAnd());

        OrAnd and2 = new OrAnd(20, 0);
        System.out.println(and2.resultAnd());

        OrAnd and3 = new OrAnd(50, 50);
        System.out.println(and3.resultAnd());

        OrAnd and4 = new OrAnd(10, 20);
        System.out.println(and4.resultAnd());

        OrAnd and5 = new OrAnd(30, -40);
        System.out.println(and5.resultAnd());


    }
}
