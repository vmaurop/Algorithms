package letcode;

public class LetCode {


    /**
     * https://leetcode.com/problems/implement-strstr/submissions/
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    /**
     * https://leetcode.com/problems/search-insert-position/
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
            index = i + 1;
        }
        return index;
    }

}
