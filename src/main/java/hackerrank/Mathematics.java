package hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Mathematics {
    /**
     * ref: https://www.hackerrank.com/challenges/easy-sum/problem
     */
    public static void easySum() {
        int length;
        ArrayList<BigInteger> sum = new ArrayList<>();
        BigInteger x = BigInteger.ZERO;
        Scanner in = new Scanner(System.in);
        length = in.nextInt();
        long[] longs = new long[length];
        long[] m = new long[length];
        for (int i = 0; i < length; i++) {
            longs[i] = in.nextLong();
            m[i] = in.nextLong();
        }
        for (int j = 0; j < length; j++) {
            for (int i = 1; i <= longs[j]; i++) {
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
