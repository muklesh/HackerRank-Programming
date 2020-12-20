import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            String str = sc.next();
            System.out.println(subsequenceExists(str) ? "YES" : "NO");
        }
        sc.close();
    }
    
    private static boolean subsequenceExists(String str) {
        String compare = "hackerrank";
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == compare.charAt(index)) {
                index++;
            }
            if (index == compare.length()) {
                return true;
            }
        }
        return false;
    }
}
