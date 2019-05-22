package projecteuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Euler2 {


    /**
     * https://projecteuler.net/problem=56
     *
     * @return
     */
    public long powerfulDigitSum() {
        List<Integer> results1 = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < 100; j++) {
                BigInteger x = BigInteger.valueOf(i).pow(j);
                String y = x.toString();
                char arr[] = y.toCharArray();
                int[] num = new int[arr.length];
                int sum = 0;
                for (int k = 0; k < arr.length; k++) {
                    num[k] = Integer.parseInt(String.valueOf(arr[k]));
                    sum = sum + num[k];
                }
                results1.add(sum);
            }
        }
        Collections.sort(results1);
        return results1.get(results1.size() - 1);
    }

    /**
     * https://projecteuler.net/problem=97
     *
     * @return
     */
    public BigInteger largeNonMersennePrime() {
        BigInteger bigInteger = BigInteger.valueOf(28433).multiply(BigInteger.valueOf(2).pow(7830457)).add(BigInteger.valueOf(1));
        String x = bigInteger.toString();
        return new BigInteger(x.substring(x.length() - 10));
    }
}
