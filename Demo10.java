class Demo10
{
  static int a;
  static double b;

  public static void main(String [] args)
  {
   System.out.println("Main Start");
   a=47;
   double b=61.92;
   System.out.println(Demo10.b);
   int a=63;
   a=78;
   System.out.println(a);
   System.out.println(Demo10.a);
   Demo10.b=36.11;
   System.out.println(b);
   System.out.println(Demo10.b);
   System.out.println("Main End");

  }

}