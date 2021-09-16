package org.bori;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            String printable = "";
            String fizz = "Fizz";
            String buzz = "Buzz";
            if (i % 3 == 0) {
                printable += fizz;
            }
            if (i % 5 == 0) {
                printable += buzz;
            }

            System.out.println(printable.isEmpty() ? i : printable);

        }

    }
}
