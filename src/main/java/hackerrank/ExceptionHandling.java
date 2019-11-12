package hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    /**
     * https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
     */
    public static void arithmeticException(){
        Scanner sc = new Scanner(System.in);
        try{
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y==0) {
                throw new ArithmeticException("/ by zero");
            }
            System.out.println(x/y);
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }

    /**
     * https://www.hackerrank.com/challenges/java-exception-handling/problem
     * @param n
     * @param p
     * @return
     * @throws Exception
     */
    public static long power(int n, int p) throws Exception {
        if(n == 0 && p ==0){
            throw new Exception("n and p should not be zero");
        }
        if(n <0 || p <0){
            throw new Exception("n or p should not be negative");
        }
        return (long) Math.pow(n,p);
    }
}
