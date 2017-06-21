class FunctionOverloading
  {
  void show()
    {
    System.out.println("First");
    }
  void show(int x)
    {
    System.out.println("Second");
    }
  void show(char a, int x)
    {
    System.out.println("Third");
    }
  public static void main(String... jerry)
    {
    FunctionOverloading f = new FunctionOverloading();
    f.show();
    f.show(10);
    f.show('a',10);
    }
  }
