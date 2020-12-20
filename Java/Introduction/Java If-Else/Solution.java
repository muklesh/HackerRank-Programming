import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
        if(num%2==1||(num>=6&&num<=20))
        {
            System.out.println("Weird");
        }
        else
        {
            System.out.println("Not Weird");
        }
    }
}
