import java.util.Scanner;
public class Test3{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int inc=sc.nextInt();
String str="";
for(int i=0;i<=num;i=i+inc)
{
str=str+i+",";
}
for(int i=0;i<str.length()-1;i++)System.out.print(str.charAt(i));
}
}


