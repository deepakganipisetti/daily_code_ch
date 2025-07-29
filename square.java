class squar 
{
 public static void main(String args[])
 {
  int a=246,square=0,temp=0;
  while(a!=0)
  {
  temp=a%10;
  square=temp*temp;
  System.out.println(square);
  a/=10;
}
 
  }
}
