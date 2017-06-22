class Coop extends Cooper
  {
  void show()
    {
    System.out.println(x);
    System.out.println(y);
    }
  void show1()
    {
    System.out.println("*" + x);
    System.out.println("*" + y);
    }
  public static void main(String[] args) {
    Coop c = new Coop();
    c.show1();
  }
  }
