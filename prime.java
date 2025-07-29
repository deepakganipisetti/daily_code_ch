class prime
{
 public static void main(String args[])
 {
 int x,num=11,count=0;
 for(x=2;x<=num;x++)
 {
 if(num%2==0)
 count++; 
}
 System.out.println(count==0?("PRIME"):("NOT PRIME"));
 }
}
