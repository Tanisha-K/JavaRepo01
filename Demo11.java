class Demo11
{
  static char a;
  static int b=97;

  public static void main(String [] args)
  {
    System.out.println("Main Start");
    System.out.println(a);
    int a=41;
    b=22;
    a=28;
    System.out.println(a);
    Demo11.b=38;
    int b=36;
    Demo11.a='z';
    b=69;
    System.out.println(b);
    System.out.println(Demo11.a);
    System.out.println(Demo11.b);
    System.out.println("Main End");

  }

}