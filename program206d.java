import java.util.*;
public class program206d
{
public static void main(String[] args)
{char ch;
System.out.print("enter your name:");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println();
if(ch>='0'&&ch<='9')
System.out.println(ch+"is a digit");
else if(ch>='A'&&ch<='Z');
System.out.println(ch+"is a alphabet");
else
System.out.println(ch+"is a special character");
}
}