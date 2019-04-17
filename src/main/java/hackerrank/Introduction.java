package hackerrank;

import java.util.Scanner;

public class Introduction {

    /**
     * https://www.hackerrank.com/challenges/java-end-of-file/problem
     */
    public static void endOfFile() {
        Scanner scanner = new Scanner(System.in);
        int line=1;
        while (scanner.hasNext()) {
            String s=scanner.nextLine();
            System.out.println(line + " " + s);
            line++;
        }
    }

}
