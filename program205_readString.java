import java.util.*;
public class program205_readString
{
public static void main(String[] args)
{
System.out.print("enter your name:");
Scanner sc=new Scanner(System.in);
String n=sc.next();
char ch=n.charAt(0);
System.out.print("welcome"+n+ch);
}
}