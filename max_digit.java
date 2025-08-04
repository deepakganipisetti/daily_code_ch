class main
{
 public static void main(String args[])
 {
  int n=592929,max=0,rem=0;
 while(n!=0)
 {
 rem=n%10;   //9
 if(rem > max)
  max=rem;
  n/=10;
 }
 System.out.println(max);
 

 }
}
