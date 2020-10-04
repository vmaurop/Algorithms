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

    /**
     * https://www.hackerrank.com/challenges/java-stdin-stdout/problem
     */
    public static void stdinAndStdout() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    /**
     * https://www.hackerrank.com/challenges/java-datatypes/problem
     */
    public static void dataTypes() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127)
                    System.out.println("* byte");
                if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
                    System.out.println("* short");
                if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
                    System.out.println("* int");
                if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}

