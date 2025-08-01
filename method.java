class main
{
 public static void main(String args[])
  {
   demo demo1=new demo();
   demo1.modelOne();
   demo1.modelOne();
   System.out.println(demo1.modelTwo());
   System.out.println(demo1.modelThree());
   System.out.println(demo1.modelFour());
  }

}
class demo
{
  void modelOne()
   {
   System.out.println("hello");
   }
  char modelTwo()
  {
   return 'y';
  }
  String modelThree()
  {
   return "hi";
  }
  double modelFour()
  {
  return 203.20;
  }
}
