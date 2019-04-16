package hackerrank;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Warmup {

    /**
     * ref:https://www.hackerrank.com/challenges/simple-array-sum/problem
     */
    public void sumArray()
    {

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

        } catch (Exception e)
        {
            System.out.println("please insert integers");
            sumArray();

        }
    }

    /**
     * https://www.hackerrank.com/challenges/java-loops-i/problem
     */
    public void firstTenMulti()
    {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(int i=1;i<11;i++)
        {
            System.out.println(n+"X"+i+"="+n*i);
        }

    }


    /**
     * ref: https://www.hackerrank.com/challenges/java-if-else/problem
     */
    public static void ifElse()
    {
        String ans= "";
        Scanner sc=new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if(n>100 || n <=0)
            {
                throw new ArithmeticException();//constraints 1<=n<=100 It goes to catch....
            }

            if (n % 2 == 1) {
                ans = "Weird";
            } else {

                if ((n >= 2 && n <= 5) || n > 20) {
                    ans = "Not Weird";
                } else {
                    ans = "Weird";
                }


            }
        }
        catch (Exception e)
        {
            System.out.println("Only integers and n should be within [1,100]");
            // ifElse(); if we want recursion
        }
        System.out.println(ans);
    }


    /**
     * https://www.hackerrank.com/challenges/java-date-and-time/problem
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static String getDay(int year, int month, int day)
    {
       /* Calendar ca1 = new GregorianCalendar();
        ca1.set(year,month,day);   //we set the date
        int Day_of_week=ca1.get(Calendar.DAY_OF_WEEK);  //for some curiosity, the days begin on Saturday!So 1 is Saturday,2 is Sunday...
        LocalDate dt = LocalDate.of(year,month,day);
        System.out.print(dt.getDayOfWeek());

        switch (Day_of_week)
        {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                 return "Wednesday";
            case 5:
                 return "Thursday";
            case 6:
                 return "Friday";
            case 7:
                 return "Saturday";
            default:
                return "Something gone wrong..."; //nothing has gone wrong..:))
        }*/
        /*int x = 1;
        Integer.toString(x);
        System.out.println(x);*/
        LocalDate dt = LocalDate.of(year,month,day);
        return String.valueOf(dt.getDayOfWeek());  //returns the enums day of week so casting to string

    }

    /**
     * https://www.hackerrank.com/challenges/compare-the-triplets/problem
     * @param array1
     * @param array2
     * @return
     */
    public static List<Integer> compareTriplets(List<Integer> array1, List<Integer> array2) {
        List<Integer> compare = new ArrayList<>();
        int player1 = 0;
        int player2 = 0;
        for(int i =0; i<array1.size();i++){
            if(array1.get(i) > array2.get(i)){
                player1++;
            }
            if(array1.get(i) < array2.get(i)){
                player2++;
            }
        }
        compare.add(player1);
        compare.add(player2);
        return compare;
    }

    /**
     * https://www.hackerrank.com/challenges/diagonal-difference/problem
     * @param array
     * @return
     */
    public static int diagonalDifference(int[][] array) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum1 +=array[i][j];
                }

                if (i == array.length - j - 1) {
                    sum2 += array[i][j];
                }
            }
        }
        return Math.abs(sum1 - sum2);

    }

    /**
     *  https://www.hackerrank.com/challenges/staircase/problem
     * @param n
     */
    public static void staircase(int n) {
        String[] array = new String[n];
        for(int i =0; i<n; i++){
            array[i] = " ";
        }
        for(int i = n-1; i>-1; i--){
            array[i] = "#";
            for(int j=0; j<n; j++){
                System.out.print(array[j]);
            }
            System.out.println();
        }
    }

    /**
     * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
     * @param ar
     * @return
     */
    public static int birthdayCakeCandles(int[] ar) {
        int max = ar[0];
        for(int i=0; i< ar.length; i++){
            if(ar[i] > max){
                max = ar[i];
            }
        }
        int count =0;
        for(int j=0; j< ar.length; j++){
            if( max == ar[j]){
                count++;
            }
        }
        return count;
    }

    /**
     * https://www.hackerrank.com/challenges/time-conversion/problem
     * @param s
     * @return
     */
   public static String timeConversion(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        s =  stringBuilder.insert(8, " ").toString() ;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a" , Locale.getDefault());
        String expectedTime =  LocalTime.parse(s ,dateTimeFormatter)
                .format( DateTimeFormatter.ofPattern("HH:mm:ss")); //to string

        return expectedTime;

    }
}
