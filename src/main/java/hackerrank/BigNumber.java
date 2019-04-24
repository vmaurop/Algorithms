package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {

    /**
     * ref https://www.hackerrank.com/challenges/java-biginteger/problem
     */
    public void bigInt() {
        BigInteger a, b, sum, multiply;
        Scanner in = new Scanner(System.in);
        a = in.nextBigInteger();  //input for BigInteger
        b = in.nextBigInteger();
        sum = a.add(b);  //sum = a+b
        multiply = a.multiply(b);//multiply = a*b
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
        boolean b = n.isProbablePrime(1000); //if it is prime return true!
        if (b)                                            //public boolean isProbablePrime(int certainty)
        {                                          // certainty − a measure of the uncertainty that the caller is willing to tolerate:
            System.out.println("prime");                                               // if the call returns true the probability that this BigInteger is prime exceeds (1 - 1/2certainty).
            // The execution time of this method is proportional to the value of this parameter
        } else {
            System.out.println("not prime");
        }
    }


}
