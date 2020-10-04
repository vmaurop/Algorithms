package hackerrank;

import java.util.Scanner;

public class Strings {

    public void camelCase() {
        /**
         * ref: https://www.hackerrank.com/challenges/camelcase/problem
         */
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {//check if a character is uppercase...
                count++;
            }
        }
        System.out.println(count);
    }

    /**
     * https://www.hackerrank.com/challenges/java-string-reverse/problem
     */
    public static void palindromic() {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        StringBuilder stringBuilder = new StringBuilder(first);
        String second = stringBuilder.reverse().toString();
        if (first.equals(second)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /**
     * https://www.hackerrank.com/challenges/java-strings-introduction/problem
     */
    public static void lexicographically() {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        System.out.println(first.length() + second.length());
        System.out.println((first.compareTo(second) > 0) ? "Yes" : "No");
        System.out.println(first.substring(0, 1).toUpperCase().concat(first.substring(1)) + " " + second.substring(0, 1).toUpperCase().concat(second.substring(1)));
    }
}
