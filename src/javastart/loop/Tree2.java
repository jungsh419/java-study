package javastart.loop;

public class Tree2 {
        public static void main(String[] args) {

            int rows = 10;
            for (int i = rows; i >= 1; i--) {

                for (int j = rows; j >= i; j--) {
                    System.out.printf(" ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.printf("*");
                }
                System.out.println();

            }

        }
}
