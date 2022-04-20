package hackerrank;

import java.util.*;

public class Strings {

    public void camelCase() {
        /**
         * ref: https://www.hackerrank.com/challenges/camelcase/problem
         */
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {//check if a character is uppercase...
                count++;
            }
        }
        System.out.println(count);
    }

    /**
     * https://www.hackerrank.com/challenges/java-string-reverse/problem
     */
    public static void palindromic() {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        StringBuilder stringBuilder = new StringBuilder(first);
        String second = stringBuilder.reverse().toString();
        if (first.equals(second)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /**
     * https://www.hackerrank.com/challenges/java-strings-introduction/problem
     */
    public static void lexicographically() {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        System.out.println(first.length() + second.length());
        System.out.println((first.compareTo(second) > 0) ? "Yes" : "No");
        System.out.println(first.substring(0, 1).toUpperCase().concat(first.substring(1)) + " " + second.substring(0, 1).toUpperCase().concat(second.substring(1)));
    }


    /**
     * https://www.hackerrank.com/challenges/java-anagrams/
     * @param a
     * @param b
     * @return
     */
    public static boolean isAnagram(String a, String b) {
        List<String> first = Arrays.asList(a.toLowerCase().split(""));
        List<String> second = Arrays.asList(b.toLowerCase().split(""));
        Collections.sort(first);
        Collections.sort(second);
        return first.equals(second);
    }

    /**
     * https://www.hackerrank.com/challenges/java-string-tokens/problem?h_r=profile
     * @param input
     */
    public static void tokens(String input){
        input = input.replaceAll("[!,?._'@]"," ");
        List<String> tokensList = new ArrayList<>(Arrays.asList(input.split(" ")));
        tokensList.removeIf(String::isEmpty);
        System.out.println(tokensList.size());
        for(String element : tokensList){
            System.out.println(element);
        }
    }

}
