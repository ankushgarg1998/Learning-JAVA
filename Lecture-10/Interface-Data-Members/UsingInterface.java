interface Sky
  {
  int x = 10;
  }

class Coop
  {
  public static void main(String... jerry)
    {
    System.out.println(Sky.x);//Thus x is by-default Static
    }
  }

class Cooper implements Sky
  {
  public static void main(String... jerry)
    {
    //x+=10;//Thus x is by-defoult Static
    System.out.println(x);
    }
  }
