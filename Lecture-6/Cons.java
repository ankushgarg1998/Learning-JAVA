class Cons
  {
  int x;
  String s;

  void show()
    {
    System.out.println(x);
    System.out.println(s);
    }

  Cons()
    {
    System.out.println("Default Constructor Running");
    x = 1;
    s = "default";
    this.show();
    }

  Cons(int x)
    {
    System.out.println("\nParameterised Constructor 1 Running");
    this.x = x;
    s = "default";
    this.show();
    }

  Cons(String s)
    {
    System.out.println("\nParameterised Constructor 2 Running");
    x = 1;
    this.s = s;
    this.show();
    }

  Cons(Cons obj)
    {
    System.out.println("\nCopy Constructor Running");
    x = obj.x;
    s = obj.s;
    this.show();
    }


  public static void main(String... jerry)
    {
    Cons c = new Cons();
    Cons c1 = new Cons(10);
    Cons c2 = new Cons("Passed");
    Cons c3 = new Cons(c1);
    System.out.println("\nProgram Ends\n");
    }
  }
