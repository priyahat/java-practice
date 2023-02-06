import java.util.Scanner;
public class Facebook
{
private int id;
private String name;
private int pswd;
Facebook(int i1,String s1,int p1)
{
id=i1;
name=s1;
pswd=p1;
}
public int getid()
{
return id;
}
public void setid(int i1)
{
 id=i1;
}
public String getName()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter pswd");
int ps=sc.nextInt();
if(ps==pswd)
{
return name;
}
else
return null;
}
public void setName(String s1)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter pswd");
int ps=sc.nextInt();
if(ps==pswd)
{
name=s1;
}
else
{
 System.out.println("pswd incorrect");
}
}
}
