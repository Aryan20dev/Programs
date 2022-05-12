/*Given a m * n matrix of distinct numbers, return all 
lucky numbers in the matrix in any order.
A lucky number is an element of the matrix such that it is the minimum 
element in its row and maximum in its column.*/
import java.util.Scanner;
public class LuckyNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array dimensions");
        int m,n,i,j;
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter the matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            a[i][j]=sc.nextInt();
        }
        int b[]=lucky(a,m,n);
        System.out.println("Lucky numbers are ");
        for(i=0;i<b.length;i++)
        {if(b[i]==0)
            break;
            else
        System.out.print(b[i]+" ");
    }}
    public static int[] lucky(int a[][],int m,int n)
    {
        int i,j,k,c=0,b[]=new int[m*n],q=0,p=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                p=a[i][j];
                for(k=0;k<m;k++)
                {
                    if(a[i][j]>a[k][j])
                    c++;
                }if(c==m-1)
                    p=1;c=0;
                for(k=0;k<m;k++)
                {
                    if(a[i][j]<a[i][k])
                    c++;
                }
                if(c==n-1)
                p=2;
                if(p==2)
                b[q]=a[i][j];
                    
                }
            }
            return b;
        
    }
}
