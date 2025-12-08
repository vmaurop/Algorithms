package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges
 */
public class PrepKit {



    public static boolean isNonTrivialRotation(String s1, String s2) {

        if (s1 == null || s2 == null || s1.length() != s2.length() || s1.equals(s2)) {
            return false;
        }
        // Check rotation
        String doubled = s1 + s1;
        return doubled.contains(s2);


    }

    public static List<Integer> findTwoSum(List<Integer> nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    return Arrays.asList(i, j);
                }
            }
        }
        return Arrays.asList(-1, -1); // no pair found
    }


    public static List<Integer> findTwoSum1(List<Integer> nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums.get(i);
            if (seen.containsKey(complement)) {
                return Arrays.asList(seen.get(complement), i);
            }
            seen.put(nums.get(i), i);
        }

        return Arrays.asList(-1, -1); // no pair found
    }



    public static int findFirstOccurrence(List<Integer> nums, int target) {
        for( int i=0; i < nums.size(); i++){
            if(nums.get(i) == target){
                return i;
            }
        }
        return -1;
    }


    public static boolean isAlphabeticPalindrome(String code) {
        code = code.replaceAll("[^A-Za-z]", "").toLowerCase();
        String reversed = new StringBuilder(code).reverse().toString();
        return code.equals(reversed);
    }


    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        int count = 0;
        long sum = 0;

        for (int i = 0; i < responseTimes.size(); i++) {
            if (i > 0) {
                double avg = (double) sum / i; // fractional average
                if (responseTimes.get(i) > avg) {
                    count++;
                }
            }
            sum += responseTimes.get(i);
        }
        return count;
    }





}
