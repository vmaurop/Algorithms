package projecteuler;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static hackerrank.Algorithms.extraLongFactorials;


public class Euler2 {

    /**
     * https://projecteuler.net/problem=52
     * @return
     */
    public int permutedMultiples(){
        List<String> list1, list2, list3, list4, list5, list6;
        int num = 1;
        do {
            list1 = Arrays.asList(String.valueOf(num).split("(?<=.)"));
            list2 = Arrays.asList(String.valueOf(2*num).split("(?<=.)"));
            list3 = Arrays.asList(String.valueOf(3*num).split("(?<=.)"));
            list4 = Arrays.asList(String.valueOf(4*num).split("(?<=.)"));
            list5 = Arrays.asList(String.valueOf(5*num).split("(?<=.)"));
            list6 = Arrays.asList(String.valueOf(6*num).split("(?<=.)"));
            Collections.sort(list1);
            Collections.sort(list2);
            Collections.sort(list3);
            Collections.sort(list4);
            Collections.sort(list5);
            Collections.sort(list6);
            if (list1.equals(list2) && list2.equals(list3) && list3.equals(list4) && list4.equals(list5) && list5.equals(list6)) {
                return num;
            }
            num++;
        } while (num < Integer.MAX_VALUE);
        throw new RuntimeException("There is such an integer to fulfilled those criteria");
    }

    /**
     * https://projecteuler.net/problem=53
     * @return
     */
    public static int combinatoricSelections() {
        int count = 0;
        for (int n = 100; n >= 1 ; n--) {
            for (int r = 1; r <= n; r++) {
                if (extraLongFactorials(n).divide(extraLongFactorials(r).multiply(extraLongFactorials(n - r))).compareTo(new BigInteger("1000000")) > 0) {
                    count++;
                }
            }
        }
        return count;
    }

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
