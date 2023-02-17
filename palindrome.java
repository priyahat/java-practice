import java.util.Scanner;
class Palindrome
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int num=sc.nextInt();
int a=num;
int sum=0;
while(a>0)
{
 int rem=a%10;
 sum=sum*10+rem;
 a=a/10;
}
if(sum==num)
{
 System.out.println("palindrome number");
 }
else
{
 System.out.println("is not palindrome number");
}
}
}
