import java.util.*;
class  Solution
{
    static int solve(int n, int[] ar, int d, int m){
    int c=0;
        for(int i = 0; i<ar.length-(m-1); i++)
        {
            int sum=0;
            for(int j=i;j<i+m;j++)
            {
                sum=sum+ar[j];
            }
            if(sum==d)
            {
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        int result = solve(n, ar, d, m);
        System.out.println(result);

    }
}

