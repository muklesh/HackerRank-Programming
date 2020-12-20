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
        int n = sc.nextInt();
        int[] occur = new int[100];
        for(int i = 0; i < n; i++)
        {
            int num = sc.nextInt();
            occur[num] = occur[num] + 1;
        }
        
        for(int i = 0; i < occur.length; i++)
        {
            System.out.print(occur[i]+" ");
        }
    }
}
