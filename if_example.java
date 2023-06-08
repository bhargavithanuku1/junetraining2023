import java.util.Scanner;
public class if_example{
public static void main(String[] args){
Scanner scob=new Scanner(System.in);
System.out.println("enter value of i:");
int i;
i=scob.nextInt();
System.out.print("enter the value of j:");
int j;
j=scob.nextInt();
if(i>j)
{
System.out.println(i+ "is maximum");
}
else
{
System.out.println(j+ "is minimum");
}
}
}