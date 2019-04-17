import hackerrank.Algorithms;
import org.testng.Assert;
import org.testng.annotations.Test;
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

}
