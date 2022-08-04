public class quatro {

    public static void main(String []args) {

        int num = 1;
        System.out.println("*");
        for (int i = 1; i <= 100; i++) {


            num = num + 1;


            if (num % 2 == 0) {
                System.out.println("**");

            }

            if (num % 3 == 0) {
                System.out.println("***");
            }
            if (num % 4 == 0) {
                System.out.println("****");
            }
            if (num % 5 == 0) {
                System.out.println("*****");
            }
            if (num % 6 == 0) {
                System.out.println("***");
            }
            if (num % 7 == 0) {
                System.out.println("***");
            }
            if (num % 8 == 0) {
                System.out.println("***");
            }
            if (num % 9 == 0) {
                System.out.println("***");
            }

        }

    }}