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
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        HashMap<Long,Integer> hs = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
            hs.put(arr[i],i);
        }
        Arrays.sort(arr);
         long min=Long.MAX_VALUE;
        for(int i=n-1;i>0;i--)
        {
            if(arr[i]-arr[i-1]<min)
            {
                if(hs.get(arr[i]) < hs.get(arr[i-1]))
                min=arr[i]-arr[i-1];
            }
        }
            System.out.println(min);

    }
}
