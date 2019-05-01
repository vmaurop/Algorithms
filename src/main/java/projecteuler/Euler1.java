package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;

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

}