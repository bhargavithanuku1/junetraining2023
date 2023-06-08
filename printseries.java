import java.util.Scanner;
public class printseries{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n;
int sum=0;
int num=sc.nextInt();
for(int i=1;i<=num;i++)
{
System.out.print(sum+"+");
sum=sum+i;
}
}
}
