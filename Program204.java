import java.util.*;
public class Program204{
static int diff(int a, int b){return a-b;}
static int product(int a, int b){return a*b;}
static int smallest(int a,int b){
if(a<b) return a;
if(b<a) return b;
return 0;}
static int largest(int a, int b){
if(a>b) return a;
if(b>a) return b;
return 0;}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num1,num2,result;
System.out.println("enter the number:");
num1=sc.nextInt();
System.out.println("enter the number:");
num2=sc.nextInt();
result=diff(num1,num2);
System.out.println("difference is"+result);
result=product(num1,num2);
System.out.println("product is"+result);
result=smallest(num1,num2);
System.out.println("smallest is"+result);
result=largest(num1,num2);
System.out.println("largest is"+result);
}
}





