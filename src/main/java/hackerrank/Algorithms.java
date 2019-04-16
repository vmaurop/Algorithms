package hackerrank;

import java.math.BigInteger;

public class Algorithms {

    /**
     * https://www.hackerrank.com/challenges/grading/problem
     * @param grades
     * @return
     */
    public static int[] gradingStudents(int[] grades) {
        for(int j=0; j < grades.length; j++) {
            if(grades[j] >=38) {
                for(int i = grades[j]+1; i< grades[j]+5; i++){
                    if(i%5 == 0 && (i - grades[j]< 3)){
                        grades[j] = i;
                    }
                }
            }
        }
        return grades;
    }

    /**
     * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
     * @param n
     * @param k
     * @param ar
     * @return
     */
    public static int divisibleSumPairs(int n, int k, int[] ar) {
        int count =0;
        for(int i =0; i< n; i++){
            for(int j = i+1; j < n; j++){
                if((i<j) && ((ar[i]+ar[j])%k) == 0){
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * https://www.hackerrank.com/challenges/extra-long-factorials/problem
     * @param n
     */
    public static BigInteger extraLongFactorials(int n) {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++)
        {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }


}
