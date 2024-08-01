package hackerrank;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import static hackerrank.Strings.getSmallestAndLargest;

public class TestAlgorithms {

    @Test
    public void gradingStudents() {
        int[] arr = new int[] { 73, 67, 38, 33};
        int[] result = Algorithms.gradingStudents(arr);
        Assert.assertEquals(result,new int[]{75, 67, 40 ,33});
    }

    @Test
    public void divisibleSumPairs() {
        int n = 6;
        int k = 3;
        int[] array = new int[]{1, 3, 2, 6, 1, 2};
        int result = Algorithms.divisibleSumPairs(n, k, array);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void extraLongFactorials() {
        int n = 25;
        BigInteger bigInteger = Algorithms.extraLongFactorials(n);
        Assert.assertEquals(new BigInteger("15511210043330985984000000"), bigInteger);
    }

    @Test
    public void breakingRecords() {
        int[] result = new int[]{4,0};
        int[] input = new int[]{3,4,21,36,10,28,35,5,24,42};
        Assert.assertEquals(Algorithms.breakingRecords(input), result);
    }

    @Test
    public void beautifulDays() {
        Assert.assertEquals(Algorithms.beautifulDays(20, 23, 6), 2);
    }

    @Test
    public void testGetSmallestAndLargest() {
        String s = "welcometojava";
        int k = 3;
        String expectedSmallest = "ava";
        String expectedLargest = "wel";
        Assert.assertEquals(getSmallestAndLargest(s,k), expectedSmallest + "\n" + expectedLargest);
    }

    @Test
    public void reverseArray() {
        List<Integer> array = Arrays.asList(1,2,3,4);
        Assert.assertEquals(DataStructures.reverseArray(array), Arrays.asList(4,3,2,1));
    }


}
