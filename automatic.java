class automatic
{
 public static void main(String args[])
  {
   int num=234,copy=num;
   int square=(int)Math.pow(num,2);
   int count=0;
   while(num!=0)
   {
   count++;
   num/=10;
   }
   int result=square % (int)Math.pow(10,count);
   if(copy==result)
   System.out.println("automatic number");
   else
   System.out.println("not automatic number");
  }
}
