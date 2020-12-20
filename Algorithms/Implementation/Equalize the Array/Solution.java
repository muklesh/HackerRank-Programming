import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int equalizeArray(int[] arr) {
    int br[] = new int[100];
    for (int i = 0; i < arr.length; i++) { br[arr[i] - 1]++; }
    int max = 0;
    for (int i = 0; i < br.length; i++) {
      max = Math.max(max, br[i]);
    }

    return arr.length - max;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int arr_i = 0; arr_i < n; arr_i++){
      arr[arr_i] = in.nextInt();
    }
    int result = equalizeArray(arr);
    System.out.println(result);
    in.close();
  }
}
