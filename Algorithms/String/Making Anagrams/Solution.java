import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static int numberNeeded(String first, String second) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int deletions = 0;
        
        for(int i = 0; i < first.length(); i++)
         //Increment frequency1 of char at i
            freq1[first.charAt(i)-'a'] = freq1[first.charAt(i)-'a'] + 1;
        for(int i = 0; i < second.length(); i++)
            //Increment frequency2 of char at i
            freq2[second.charAt(i)-'a'] = freq2[second.charAt(i)-'a'] + 1;
        
        for(int i = 0; i < 26; i++)
        deletions += Math.abs(freq1[i] - freq2[i]); //Track the total deletions needed
        
        return deletions;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
