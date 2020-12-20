import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        sc.close();
        int  negative_subarray=0;
        for(int m=1;m<=ar.length;m++)
        {
            for(int i=0;i<ar.length-m+1;i++)
            {
                int sum=0;
                for(int j=i;j<i+m;j++)
                {
                    sum=sum+ar[j];
                }
                if(sum<0)
                {
                    negative_subarray++;
                }
            }
        }
        System.out.println( negative_subarray);
    }
}

