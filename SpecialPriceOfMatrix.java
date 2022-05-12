import java.util.Scanner;
public class SpecialPriceOfMatrix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter the array Elements");
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            a[i][j]=sc.nextInt();
        }
        sc.close();
        int sp=find(a,n);
        if(sp!=Integer.MIN_VALUE)
        System.out.println("Special Price is "+sp);
    }
    static int find(int a[][],int n)
    {
        int i,j,k=0,p;int rl=Integer.MAX_VALUE,c=0;
      for(i=0;i<n;i++)
      {c=0;rl=Integer.MAX_VALUE;
          for(j=0;j<n;j++)
          {
            if(a[i][j]<rl)
            {
                rl=a[i][j];
                k=j;
            }
        }
            for(p=0;p<n;p++)
            {
                if(a[p][k]<rl)
                c++;}
                if(c==n-1)
                 {
                     return rl;
                 }
                }
          
          System.out.println("Invalid Input");
          return Integer.MIN_VALUE;
      }
    }
