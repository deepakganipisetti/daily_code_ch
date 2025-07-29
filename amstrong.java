class amstrong
{
 public static void main(String args[])
 {
 int a=153,count=0,temp=0;
 double sum=0;
 int copy=a;
 while(a!=0)  //153!=0
 {
 count++; 
 a/=10;    //0
 }
 while(a!=0)
 {
 temp=a%10;
 double d=Math.pow(temp,count);
sum=sum*d;
 a/=10;
 }
 System.out.println(copy==sum?("amstrong"):("not amstrong"));
}
 }
