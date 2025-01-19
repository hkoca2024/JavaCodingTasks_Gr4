import java.sql.SQLOutput;

public class FINRA {
    public static void main(String[] args) {
        //finra(25);
        finra(26);
    }

    /**
     *
     * @param num
     */

    public static void finra(int num) {
        if (num > 30 || num < 1) {
            System.out.println("The number can not be less than 1 or grater than 30");
        } else {

                if (num % 15 == 0) { // 15 is multiple of 3 and 5 so written 15 .
                    System.out.println("FINRA");
                } else if (num % 3 == 0) {
                    System.out.println("FIN");
                } else if (num % 5 == 0) {
                        System.out.println("RA");
                    }else{
                    System.out.println("This number can not be divided by 3, 5 or 15");
                }

        }
    }
}
