public class Scope{
public static void main(String[] args){
int i;
i=100;
System.out.println("value of i is here i:"+i);
{
int i;
i=50;
int j;
j=55;
i=i*j;
System.out.println(i);
System.out.println(j);
}
System.out.print(i);

}
}