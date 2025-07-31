class main
{
 public static void main(String args[])
 {
 int num=45,sum=0;
 int result=(int)Math.pow(num,2);
 while(result!=0)
 {
 sum=sum+(result%10);
 result/=10;
 }
 if(num==sum)
System.out.println("evil number");
else
 System.out.println("not evil number");
 }
}
