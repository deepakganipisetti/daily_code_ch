class palidrone
{
 public static void main(String args[])
 {
 int a=383,rev=0,temp=0;
 int copy=a;
 while(a!=0)
 {
 temp=a%10;
 rev=rev*10+(temp%10);
 a/=10;
 }
 System.out.println(copy==rev?("palidrone"):("not palidrone")); 
 }
}
