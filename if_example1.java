import java.util.Scanner;
public class if_example1{
public static void main(String[] args){
Scanner scob=new Scanner(System.in);
System.out.println("enter value of i:");
int i;
i=scob.nextInt();
System.out.print("enter the value of j:");
int j;
j=scob.nextInt();
if(j==0)
{
System.out.println("division by error");
}
else
{
System.out.println(i+" divided by "+j+" is "+(i/j));
i=i+j;
}
}
}