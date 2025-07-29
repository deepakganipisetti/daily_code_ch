class reverse
{
 public static void main(String args[])
 {
  int a=12345,rev=0,temp=0;
  while(a!=0)
  {
   temp=a%10;
   rev=rev*10+(temp%10);
   a/=10;
}
 System.out.println(rev);
 }
}
