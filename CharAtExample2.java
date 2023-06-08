public class CharAtExample2 {
public static void main(String[] args)
{
String str="welcome to java traning";
for(int i=0;i<=str.length()-1;i++){
if(i%2==0){
System.out.println("character at"+i+"place"+str.charAt(i));
}
}
}
}