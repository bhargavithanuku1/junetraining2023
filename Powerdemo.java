import java.util.Scanner;
public class Sumdigits{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n;
int sd=0;
System.out.println("enter positiv number:");
n=sc.nextInt();
while(n>0){
sd=sd+n%10;
n=n/10;
}
System.out.print(sd);

}
}


