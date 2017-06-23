interface First
  {
  void show();
  void show1();
  }
interface Second
  {
  void show();
  void show2();
  }

interface Third extends First, Second
  {
  void show3();
  }

class UsingInterface implements Third
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
  public void show3()
    {
    System.out.println("SHOW 3");
    }

  public static void main(String[] args)
    {
    First a = new UsingInterface();
    Second b = new UsingInterface();

    a.show();
    b.show();
    a.show1();
    b.show2();

    Third c = new UsingInterface();
    c.show();
    c.show1();
    c.show2();
    c.show3();
    }
  }
