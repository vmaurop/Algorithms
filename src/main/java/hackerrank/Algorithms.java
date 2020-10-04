package hackerrank;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

public class Algorithms {

    /**
     * https://www.hackerrank.com/challenges/grading/problem
     *
     * @param grades
     * @return
     */
    public static int[] gradingStudents(int[] grades) {
        for (int j = 0; j < grades.length; j++) {
            if (grades[j] >= 38) {
                for (int i = grades[j] + 1; i < grades[j] + 5; i++) {
                    if (i % 5 == 0 && (i - grades[j] < 3)) {
                        grades[j] = i;
                    }
                }
            }
        }
        return grades;
    }

    /**
     * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
     *
     * @param n
     * @param k
     * @param ar
     * @return
     */
    public static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((i < j) && ((ar[i] + ar[j]) % k) == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * https://www.hackerrank.com/challenges/extra-long-factorials/problem
     *
     * @param n
     */
    public static BigInteger extraLongFactorials(int n) {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    /**
     * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
     *
     * @param scores
     * @return
     */
    public static int[] breakingRecords(int[] scores) {
        int countBreakMaxRecord = 0;
        int countBreakMinRecord = 0;
        int[] results = new int[2];
        int max = scores[0];
        int min = scores[0];
        for (int score : scores) {
            if (score > max) {
                results[0] = ++countBreakMaxRecord;
                max = score;
            }
            if (score < min) {
                results[1] = ++countBreakMinRecord;
                min = score;
            }
        }
        return results;
    }

    /**
     * https://www.hackerrank.com/challenges/migratory-birds/problem
     *
     * @param arr
     * @return
     */
    public int migratoryBirds(List<Integer> arr) {
        int[] counter = new int[arr.size()];
        //we sort the list so we get the  the lower number that occurs at the highest frequency
        Collections.sort(arr);

        //Get frequency of each element in list
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))) {
                    counter[j] = counter[j] + 1;
                }
            }
        }
        //Get max frequency of already sorted list
        int max = counter[0];
        int index = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > max) {
                max = counter[i];
                index = i;
            }
        }
        return arr.get(index);

    }

    /**
     * https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
     *
     * @param i
     * @param j
     * @param k
     * @return
     */
    public static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int index = i; index <= j; index++) {
            if ((index - Integer.parseInt(String.valueOf(new StringBuilder(String.valueOf(index)).reverse()))) % k == 0) {
                count++;
            }
        }
        return count;

    }


}
