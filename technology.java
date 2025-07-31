class main
{
 public static void main(String args[])
 {
 int num=2025,copy=num,count=0;
 while(num!=0)
 {
 count++;
 num/=10;
 }
  int fhalf=copy / (int)Math.pow(10,count/2);
  int shalf=copy % (int)Math.pow(10,count/2);
  int sum=fhalf+shalf;
  int result=(int)Math.pow(sum,2);
  System.out.println(num==result?("techonology"):("not technology"));
}
}
