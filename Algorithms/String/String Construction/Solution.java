import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String s=sc.next();
          Set<Character> unique=new HashSet<>();
          for(char c:s.toCharArray())
            {
              unique.add(c);
            }
            System.out.println(unique.size());
        }
    }
}
