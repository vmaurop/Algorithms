import hackerrank.Algorithms;
import org.testng.Assert;
import org.testng.annotations.Test;
import projecteuler.Euler1;

import java.math.BigInteger;

public class TestAlgorithms {

    @Test
    public void gradingStudents() {
        int[] arr = new int[] { 73, 67, 38, 33};
        int[] result = Algorithms.gradingStudents(arr);
        Assert.assertEquals(new int[]{75, 67, 40 ,33}, result);
    }

    @Test
    public void divisibleSumPairs() {
        int n = 6;
        int k = 3;
        int[] array = new int[]{1, 3, 2, 6, 1, 2};
        int result = Algorithms.divisibleSumPairs(n, k, array);
        Assert.assertEquals(5, result);
    }

    @Test
    public void extraLongFactorials() {
        int n = 25;
        BigInteger bigInteger = Algorithms.extraLongFactorials(n);
        Assert.assertEquals(new BigInteger("15511210043330985984000000"), bigInteger);
    }

    @Test
    public void smallestMultiples(){
        int smallestMul = 233168;
        Assert.assertEquals(new Euler1().multiplesOf3And5(), smallestMul);
    }

    @Test
    public void evenFibonacciNumbers(){
        int evenFibonaci = 4613732;
        Assert.assertEquals(new Euler1().evenFibonacciNumbers(), evenFibonaci);
    }

}
