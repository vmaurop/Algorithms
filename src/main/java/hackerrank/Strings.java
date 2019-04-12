package hackerrank;

import java.util.Scanner;

public class Strings {

    public void camelCase()
    {
        /**
         * ref: https://www.hackerrank.com/challenges/camelcase/problem
         */
        Scanner in =new Scanner(System.in);
        String s = in.next();

        int count = 1;
        for(int i=0;i<s.length();i++)
        {

            if(Character.isUpperCase(s.charAt(i)))  //check if a character is uppercase...
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
