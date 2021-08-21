package letcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAlgorithms {


    @Test
    public void strStr() {
        Assert.assertEquals(LetCode.strStr("hello", "ll"), 2);
    }

    @Test
    public void searchInsert() {
        int[] nums = new int[]{1, 3, 5, 6};
        Assert.assertEquals(LetCode.searchInsert(nums, 2), 1);
    }
}
