package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {

    /**
     * ref https://www.hackerrank.com/challenges/java-biginteger/problem
     */
    public void bigInt() {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();  //input for BigInteger
        BigInteger b = in.nextBigInteger();
        BigInteger sum = a.add(b);  //sum = a+b
        BigInteger multiply = a.multiply(b);//multiply = a*b
        System.out.println(sum);
        System.out.println(multiply);
    }

    /**
     * https://www.hackerrank.com/challenges/java-primality-test/problem
     */
    public void primalityTest() {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close(); //optional we close scanner
        System.out.println(n.isProbablePrime(1000) ? "prime" : "not prime");
    }


}
