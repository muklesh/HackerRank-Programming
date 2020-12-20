package warmup;


import java.util.Arrays;
import java.util.*;
class Solution
{
public static void main(String[]args)
{
      Scanner scan = new Scanner(System.in);
      long ar[]=new long[5];
    for(int i=0;i<ar.length;i++)
    {
    ar[i]=scan.nextInt();
    }
    Arrays.sort(ar);
    long sum=0;
    for(int i=0;i<ar.length;i++)
    {
        sum=sum+ar[i];
    }
    long max=sum-ar[0];
    long min=sum-ar[ar.length-1];
    System.out.println(min+" "+max);
    scan.close();
}
}
