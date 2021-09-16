package org.bori;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            String printable = "";
            String fezz = "Fezz";
            String fizz = "Fizz";
            String buzz = "Buzz";
            String bang = "Bang";
            if (i % 3 == 0) {
                printable += fizz;
            }
            if (i % 13 == 0) {
                printable += fezz;
            }
            if (i % 5 == 0) {
                printable += buzz;
            }
            if (i % 7 == 0) {
                printable += bang;
            }
            if (i % 11 == 0) {
                printable = "Bong";
            }

            System.out.println(printable.isEmpty() ? i : printable);

        }

    }
}
