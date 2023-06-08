public class power1{
public static void main(String[] args){
import java.util.Scanner;
public class power1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int base;
int power;
int result = 1;
System.out.println("enter the base number:");
base=sc.nextInt();
System.out.println("enter the power:");
power=sc.nextInt();
for(int i=1;i<=power;i++)
{
result=result*base;
System.out.print("result: "+result);
}
}
}

