package elif;

public class Task01_OddorEven {
        public static void main(String[] args) {
            oddOrEven(3);
            oddOrEven(4);
            oddOrEven(5);

        }

        /**
         * returns the gıven number ıf ıt ıs odd or even
         * @param number
         */
        public static void oddOrEven(int number) {
            if (number % 2 == 0) {
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }
    }


