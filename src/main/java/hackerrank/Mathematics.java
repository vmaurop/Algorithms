package hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Mathematics {
    /**
     * ref: https://www.hackerrank.com/challenges/easy-sum/problem
     */
    public static void easySum() {
        int T;
        // BigInteger sum = new BigInteger("0");
        ArrayList<BigInteger> sum = new ArrayList<>();
        BigInteger x = new BigInteger("0");
        Scanner in = new Scanner(System.in);
        T = in.nextInt();
        long[] N = new long[T];
        long[] m = new long[T];
        for (int i = 0; i < T; i++) {
            N[i] = in.nextLong();
            m[i] = in.nextLong();
        }
        for (int j = 0; j < T; j++) {
            for (int i = 1; i <= N[j]; i++) {
                x = x.add(BigInteger.valueOf(i % m[j]));

            }
            sum.add(x);
            x = BigInteger.valueOf(0);
        }
        for (BigInteger r : sum) {
            System.out.println(r);
        }
    }

}
