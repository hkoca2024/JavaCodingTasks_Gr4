package salih;

public class Task02_FinRa {
    public static void main(String[] args) {

        FinRa(9);
        FinRa(10);
        FinRa(45);
    }


    /**
     * if given number can be
     * multiple of 3, output is FIN
     * multiple of 5, output is RA
     * multiple of 3 & 5, output is FINRA
     *
     */
    public static void FinRa(int num) {

        if (num % 15 == 0) {
            System.out.println("FINRA");
        }
        else if (num % 5 == 0) {
            System.out.println("RA");
        }
        else if (num % 3 == 0) {
            System.out.println("FIN");
        }
    }

}
