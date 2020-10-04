package hackerrank;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Warmup {

    /**
     * ref:https://www.hackerrank.com/challenges/simple-array-sum/problem
     */
    public void sumArray() {
        int sum = 0;
        try {
            int n;
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            for (int j : array) {
                sum = sum + j;
            }
            System.out.println(sum);

        } catch (Exception e) {
            System.out.println("please insert integers");
            sumArray();

        }
    }

    /**
     * https://www.hackerrank.com/challenges/java-loops-i/problem
     */
    public void firstTenMulti() {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(n + "X" + i + "=" + n * i);
        }

    }

    /**
     * https://www.hackerrank.com/challenges/java-date-and-time/problem
     *
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static String getDay(int year, int month, int day) {
        LocalDate dt = LocalDate.of(year, month, day);
        return dt.getDayOfWeek().name();
    }

    /**
     * https://www.hackerrank.com/challenges/compare-the-triplets/problem
     *
     * @param array1
     * @param array2
     * @return
     */
    public static List<Integer> compareTriplets(List<Integer> array1, List<Integer> array2) {
        List<Integer> compare = new ArrayList<>();
        int player1 = 0;
        int player2 = 0;
        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i) > array2.get(i)) {
                player1++;
            }
            if (array1.get(i) < array2.get(i)) {
                player2++;
            }
        }
        compare.add(player1);
        compare.add(player2);
        return compare;
    }

    /**
     * https://www.hackerrank.com/challenges/diagonal-difference/problem
     *
     * @param array
     * @return
     */
    public static int diagonalDifference(int[][] array) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum1 += array[i][j];
                }
                if (i == array.length - j - 1) {
                    sum2 += array[i][j];
                }
            }
        }
        return Math.abs(sum1 - sum2);

    }

    /**
     * https://www.hackerrank.com/challenges/staircase/problem
     *
     * @param n
     */
    public static void staircase(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = " ";
        }
        for (int i = n - 1; i > -1; i--) {
            array[i] = "#";
            for (int j = 0; j < n; j++) {
                System.out.print(array[j]);
            }
            System.out.println();
        }
    }

    /**
     * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
     *
     * @param ar
     * @return
     */
    public static int birthdayCakeCandles(int[] ar) {
        int max = ar[0];
        for (int j : ar) {
            if (j > max) {
                max = j;
            }
        }
        int count = 0;
        for (int i : ar) {
            if (max == i) {
                count++;
            }
        }
        return count;
    }

    /**
     * https://www.hackerrank.com/challenges/time-conversion/problem
     *
     * @param s
     * @return
     */
    public static String timeConversion(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        s = stringBuilder.insert(8, " ").toString();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a", Locale.getDefault());
        return LocalTime.parse(s, dateTimeFormatter)
                .format(DateTimeFormatter.ofPattern("HH:mm:ss")); //to string
    }

    /**
     * https://www.hackerrank.com/challenges/mini-max-sum/problem
     *
     * @param arr
     */
    public static void miniMaxSum(int[] arr) {
        List<Integer> array = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(array);
        long minSum = 0;
        long maxSum = 0;
        for (int i = 1; i < array.size(); i++) {
            maxSum += array.get(i);
        }
        for (int i = 0; i < array.size() - 1; i++) {
            minSum += array.get(i);
        }
        System.out.println(minSum + " " + maxSum);

    }
}
