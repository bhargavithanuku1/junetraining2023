class B
{
public static void main(){
System.out.println("main method without argument");
}
public static void main(String args[]){
System.out.println("bhargavi is typing");
main();
main(40);
}
public static void main(int x){
System.out.println("main method with argument"+x*3);
}
}