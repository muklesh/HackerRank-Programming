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
        
        //We can intialize to day 1 values since 1<= n <= 50
        int peopleReached = 2, peopleSharing = 2;
        for(int i = 1; i < n; i++)
        {
            peopleReached += (peopleSharing * 3) / 2;
            peopleSharing = (peopleSharing * 3) / 2;
        }
        System.out.println(peopleReached);
    }
}
