import java.util.Scanner;
 class angularmind
 {
   public static void main(String[]args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println(" enter a row value");
     for(int i=5;i>=1;i--)
    {
        for(int k=i-1;k>=1;k--)
       {
        System.out.print("");
       }
        for(int j=i;j<=5;j++)
        {
         System.out.print(j+"  ");
        }
        System.out.println();
        }
        }
 }
