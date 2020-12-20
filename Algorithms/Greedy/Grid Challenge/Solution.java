import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static boolean checkgrid(char grid[][]){
        for(int i=0;i<grid.length-1;i++)
        {
            for(int j=1;j<grid.length;j++)
            {
                if(grid[j][i] < grid[j-1][i])
                    return false;
            }
        }
        return true;
        }        

public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T= sc.nextInt();
        StringBuilder  output = new StringBuilder("");
        for(int t = 0; t < T; t++){
            int n = sc.nextInt();sc.nextLine();
            char[][] grid = new char[n][n];
            //Read in rows of grid and sort
            for(int i = 0; i < n; i++){
                grid[i] = sc.nextLine().toCharArray();
                Arrays.sort(grid[i]);
            }
            if(checkgrid(grid))
                output.append("YES\n");
            else
                output.append("NO\n");
        }
        System.out.print(output);
    }
}
