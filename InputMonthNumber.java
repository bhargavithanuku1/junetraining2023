import java.util.Scanner;
class InputMonthNumber1{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int mn;
mn=scob.nextInt();
switch(mn){
case 0:System.out.println("january");break;
case 1:System.out.println("february");break;
case 2:System.out.println("march");break;
case 3:System.out.println("april");break;
case 4:System.out.println("may");break;
case 5:System.out.println("june");break;
case 6:System.out.println("july");break;
case 7:System.out.println("august");break;
case 8:System.out.println("september");break;
case 9:System.out.println("october");break;
case 10:System.out.println("november");break;
case 11:System.out.println("december");break;
default:System.out.println("INVALID");break;
}
}
}


