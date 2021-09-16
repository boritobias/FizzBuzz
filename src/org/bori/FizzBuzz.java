package org.bori;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner newScan = new Scanner(System.in);
        System.out.println("Enter a number");
        int numByUser = newScan.nextInt();

        for (int i = 1; i <= numByUser; i++) {
            String fezz = "Fezz";
            String fizz = "Fizz";
            String buzz = "Buzz";
            String bang = "Bang";
            String bong = "Bong";

            List<String> rules = new ArrayList<String>();

            if (i % 3 == 0) {
                rules.add(fizz);
            }
            if (i % 13 == 0) {
                rules.add(fezz);
            }
            if (i % 5 == 0) {
                rules.add(buzz);
            }
            if (i % 7 == 0) {
                rules.add(bang);
            }
            if (i % 11 == 0 && i % 13 == 0) {
                rules.add(bong);
            } else if (i % 11 == 0) {
                rules = new ArrayList<String>();
                rules.add(bong);
            }
            if (i % 17 == 0) {
                Collections.reverse(rules);
            }

            System.out.println(rules.isEmpty() ? i : String.join("", rules));

        }

    }
}
