public class StringJoin{
public static void main(String args[]){
String s1=new String("Hello");
String s2=new String("world");
String s3=new String("java");
String s=String.join(",",s1,s2,s3);
System.out.println(s.toString());
}
}