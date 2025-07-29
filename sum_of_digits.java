class sum
{
 public static void main(String args[])
 {
  int a=3733,temp=0,sum=0;
  while(a!=0)
  {
   temp=a%10;
  sum+=temp;
  a/=10;
  }
  System.out.println(sum);
 }
}
