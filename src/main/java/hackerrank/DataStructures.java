package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DataStructures {

    /**
     * https://www.hackerrank.com/challenges/java-1d-array-introduction/problem
     */
    public void oneDArray() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true
     *
     * @param a
     * @return
     */
    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> reversedArray = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            reversedArray.add(a.get((a.size() - 1) - i));
        }
        return reversedArray;

    }

    /**
     * https://www.hackerrank.com/challenges/array-left-rotation/problem
     * @param d
     * @param arr
     * @return
     */
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        Integer[] array = arr.stream().toArray(Integer[]::new);
        int temp;
        for(int i=0; i< d; i++){
            temp = array[0];
            for(int j=0; j< arr.size()-1; j++){
                array[j] = array[j+1];
            }
            array[arr.size() -1] = temp;
        }
        return Arrays.asList(array);
    }


}
