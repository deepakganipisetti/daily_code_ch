class power
{
 public static void main(String args[])
 {
  int num=123,sum=0,pro=1;
  while(num!=0)
  {
   int rem=num%10;
   sum=sum+rem;
   pro=pro*rem;
   num/=10;
  }
if(sum==pro)
  System.out.println("power number");
else
  System.out.println("not power number");
 }
}
