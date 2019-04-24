package hackerrank;

import java.util.Scanner;

public class Introduction {

    /**
     * https://www.hackerrank.com/challenges/java-end-of-file/problem
     */
    public static void endOfFile() {
        Scanner scanner = new Scanner(System.in);
        int line = 1;
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            System.out.println(line + " " + s);
            line++;
        }
    }

    /**
     * ref: https://www.hackerrank.com/challenges/java-if-else/problem
     */
    public static void ifElse() {
        String ans = "";
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n > 100 || n <= 0) {
                throw new ArithmeticException();//constraints 1<=n<=100 It goes to catch....
            }
            if (n % 2 == 1) {
                ans = "Weird";
            } else {
                if ((n >= 2 && n <= 5) || n > 20) {
                    ans = "Not Weird";
                } else {
                    ans = "Weird";
                }


            }
        } catch (Exception e) {
            System.out.println("Only integers and n should be within [1,100]");
            // ifElse(); if we want recursion
        }
        System.out.println(ans);
    }

}
