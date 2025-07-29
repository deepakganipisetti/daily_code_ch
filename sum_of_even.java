class main
{
 public static void main(String args[])
 {
 int a=283937483,temp=0,count=0,sum=0;
 while(a!=0)
 {
 temp=a%10;
 if(temp%2==0)
{
 count++;
 sum=sum+temp;
}
 a/=10;
 }
 System.out.println(count);
 System.out.println(sum);
 }
}
