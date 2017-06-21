class TheThis
  {
  int x=100;
  void show(int x)
    {
    System.out.println(x);
    System.out.println(this.x);
    }
  public static void main(String... jerry)
    {
    TheThis t = new TheThis();
    t.show(11);
    }
  }
