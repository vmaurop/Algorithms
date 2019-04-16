import hackerrank.Warmup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAlgorithms {

    @Test
    public void gradingStudents(){

    }

    @Test
    public void birthdayCakeCandles(){
        int[] arr = new int[] { 3, 2, 1, 3 };
        int result = Warmup.birthdayCakeCandles(arr);
        Assert.assertEquals(2, result);
    }
}
