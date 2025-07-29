class fab 
{
 public static void main(String args[])
 {
  int x,f=2,s=4,t=0,n=20;
  for(x=1;x<=n;x++)
 {
 t=f+s;
 f=s;
 s=t;
}
System.out.println(f);
 }
}
