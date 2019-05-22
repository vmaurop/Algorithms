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
            if (Character.isUpperCase(s.charAt(i)))  //check if a character is uppercase...
            {
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
        String A = sc.next();
        StringBuilder stringBuilder = new StringBuilder(A);
        String B = stringBuilder.reverse().toString();
        if (A.equals(B)) {
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
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        System.out.println((A.compareTo(B) > 0) ? "Yes" : "No");
        System.out.println(A.substring(0, 1).toUpperCase().concat(A.substring(1)) + " " + B.substring(0, 1).toUpperCase().concat(B.substring(1)));
    }
}
