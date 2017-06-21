class GrandDad
  {
  int x = 10;
  }

class Dad extends GrandDad
  {
  int x = 20;
  }

class Kid extends Dad
  {
  int x = 30;
  void show()
    {
    System.out.println(x);
    System.out.println(super.x);
    //System.out.println(super);
    System.out.println(((GrandDad)this).x);
    }
  public static void main(String... jerry)
    {
    Kid c = new Kid();
    c.show();
    }
  }
