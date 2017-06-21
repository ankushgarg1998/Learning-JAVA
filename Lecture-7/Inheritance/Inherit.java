class Parent
  {
  int x, y;
  void show()
    {
    System.out.println(x);
    System.out.println(y);
    }
  }

class Child extends Parent
  {
  void get(int x, int y)
    {
    this.x = x;
    this.y = y;
    }

  public static void main(String... jerry)
    {
    Child c = new Child();
    c.get(2,3);
    c.show();
    }
  }
