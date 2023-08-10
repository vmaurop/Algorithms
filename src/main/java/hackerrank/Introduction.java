package hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
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

    public static void currencyFormatter() {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    public static void outputFormatting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            String xAsString = String.valueOf(x);
            StringBuilder result = new StringBuilder();
            //Complete this line

            int stringCount = s1.length();
            int digitCount = String.valueOf(x).length();

            if(stringCount < 15){
                for( int k =0; k < 15 - stringCount; k++){
                    s1+=" ";
                }
            }

            if(digitCount < 3){
                for( int k =0; k < 3 - digitCount; k++){
                    result.append('0');
                }
            }

            result.append(xAsString);
            String formattedNumber = result.toString();
            System.out.println(s1 + "" + formattedNumber);

        }
        System.out.println("================================");
    }
























}

