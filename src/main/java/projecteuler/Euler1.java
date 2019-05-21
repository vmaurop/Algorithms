package projecteuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Euler1 {

    /**
     * https://projecteuler.net/problem=1
     * @return
     */
    public int multiplesOf3And5() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;

            }
        }
        return sum;
    }

    /**
     * https://projecteuler.net/problem=2
     * @return
     */
    public long evenFibonacciNumbers()
    {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        int sum=0;
        fibonacci.add(1);
        fibonacci.add(2);
        while(sum<4000000)
        {

            sum = fibonacci.get(fibonacci.size()-1)+fibonacci.get(fibonacci.size()-2);
            fibonacci.add(sum);

        }
        long sum1=0L;
        for(int i=0;i<fibonacci.size()-1;i++)
        {
            if(fibonacci.get(i)%2==0)
            {
                sum1=sum1+fibonacci.get(i);
            }

        }
        return sum1;
    }

    /**
     * https://projecteuler.net/problem=3
     * @return
     */
    public static Long largestPrimeFactors() {
        List<Long> primeFactors = new ArrayList();
        Long n = 600851475143l;
        for (long i = 2l; i <= n; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        Collections.sort(primeFactors);
        return primeFactors.get(primeFactors.size() - 1);
    }


    /**
     * https://projecteuler.net/problem=5
     * @return
     */
    public int smallestMultiple()
    {
        int max;
        int counter1 = 0;
        int sm_mul;
        int [] num = new int[20];
        for (int i=0;i<20;i++)
        {
            num[i]=i+1;
        }
        Arrays.sort(num);
        max = num[19];


        while(counter1<20)
        {
            counter1=0;
            for (int j=0;j<20;j++)
            {
                if (max%num[j]==0)
                {
                    counter1=counter1+1;
                }

            }
            if (counter1!=20)
            {
                max=max+1;
            }
        }
        sm_mul=max;
       return sm_mul;

    }

    /**
     * https://projecteuler.net/problem=6
     */
    public static int sumSquareDiff() {
        int sum1 = 0;
        for (int i = 1; i < 101; i++) {
            sum1 = (int) (sum1 + Math.pow(i, 2));
        }
        int sum2 = 0;
        for (int k = 1; k < 101; k++) {
            sum2 = sum2 + k;
        }
        int diff;
        diff = ((int) Math.pow(sum2, 2) - sum1);
        return diff;
    }

    /**
     * https://projecteuler.net/problem=9
     */
    public static long specialPythagoreanTriplet() {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001; j++) {
                for (int k = 0; k < 1001; k++) {
                    if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2) && i + j + k == 1000 && i < j && j < k) {
                        a = i;
                        b = j;
                        c = k;

                    }
                }
            }
        }
        return a * b * c;
    }


}