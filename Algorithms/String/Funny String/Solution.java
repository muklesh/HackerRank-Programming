import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        
        tests:
        for(int i = 0; i < n; i++)
        {
            String s = sc.nextLine();
            for(int j = 1; j < (s.length()/2)+1; j++)
            {
                int left = Math.abs(s.charAt(j) - s.charAt(j-1));
                int right = Math.abs(s.charAt(s.length()-1-j) - s.charAt(s.length()-j));
                if( left != right)
                {
                    System.out.println("Not Funny");
                    continue tests;
                }
            }
            System.out.println("Funny");
        }
}
}
