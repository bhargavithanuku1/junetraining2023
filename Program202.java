import java.util.*;
public class Program202{
public static boolean isEven(int n)
{
return ((n/2)*2==n);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter the number");
n=sc.nextInt();
if(n/2*2==n)
System.out.print("Even\n");
else
System.out.print("odd\n");
}
}