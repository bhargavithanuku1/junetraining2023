class Caluclation{
void fact(int n){
int fact=1;
for(int i=1;i<=n;i++){
fact=fact*i;
}
System.out.print("factorial is"+fact);
}
public static void main(String[] args){
new Caluclation().fact(5);
}
}
