import java.util.*;
public class program201{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("ENTER THE NUMBER:");
n=sc.nextInt();
if(n%2==0)
{
System.out.println("Even\n");
System.out.println(n+"is Even\n");
}
else
{
System.out.println("odd\n");
System.out.println(n+"is Odd\n");
}
}
}