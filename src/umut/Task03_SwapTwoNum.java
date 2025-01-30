package umut;

public class Task03_SwapTwoNum {

    public static void main(String[] args) {

        //1. way
        int a = 5;
        int b = 6;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        //2. way
        int d=11;
        int e=13;

        System.out.println("d = " + d);
        System.out.println("e = " + e);

        d=d+e;
        e=d-e;
        d=d-e;

        System.out.println("d = " + d);
        System.out.println("e = " + e);

    }
}
