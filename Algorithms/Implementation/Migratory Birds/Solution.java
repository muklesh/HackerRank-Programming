import java.util.*;

class  Solution
{
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int  br[]=new int[6];
        int max=0;
        int maxcount=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int data:ar)
        {
            br[data]++;
        }
        for(int i=0;i<br.length;i++)
        {
            if(br[i]>max)
            {
                max=br[i];
                maxcount=i;
            }
        }
        System.out.println(maxcount);
    }
}

