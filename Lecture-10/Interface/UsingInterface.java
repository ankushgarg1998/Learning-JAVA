class UsingInterface implements First, Second
  {
  public void show()
    {
    System.out.println("SHOW");
    }
  public void show1()
    {
    System.out.println("SHOW 1");
    }
  public void show2()
    {
    System.out.println("SHOW 2");
    }

  public static void main(String[] args)
    {
    First a = new UsingInterface();
    Second b = new UsingInterface();

    a.show();
    b.show();
    a.show1();
    b.show2();
    }
  }
