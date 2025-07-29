class count
{
 public static void main(String args[])
 {
  int a=67373,count=0,temp=0;
  while(a!=0)
  {
  temp=a%10;
  count++;
  a/=10;
}
 System.out.println(count);
 }
}
