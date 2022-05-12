
public class LengthOfArray 
{
 public static void main(String[] args)
 {
     int a[]=new int[50];
     int b[][]={
         {1,2,3,4},
         {5,6,7,8,9},
         {10,11,12,13,14}
        };
        System.out.println("Length of array a is"+a.length);
        int i=0;
        for(i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.print(b[i][j]+",");
            }
            System.out.println();
        }
 }   
}


