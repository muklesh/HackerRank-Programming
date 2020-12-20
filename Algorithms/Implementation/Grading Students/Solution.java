import java.io.*;
import java.util.*;

  

public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner scan=new Scanner(System.in);
       int size=scan.nextInt();
       int ar[]=new int[size];
       for(int i=0;i<ar.length;i++){
           ar[i]=scan.nextInt();

       } 
    for (int i = 0; i<ar.length; i++) {
            if (ar[i] >= 38) {
                int n= 5 - (ar[i] % 5) + ar[i];
                if (n - ar[i] < 3) {
                    ar[i] = n;
                }
            }
        }

       for(int data:ar){
     System.out.println(data);
       }
       
    }
}
