class ConsChain
  {
    ConsChain()
      {
      this(20);
      System.out.println("Default Constructor");
      }
    ConsChain(int x)
      {
      this(20, 20);
      System.out.println("Parameterised Constructor");
      }
    ConsChain(int x, int y)
      {
      System.out.println("Parameterised Constructor 2");
      }


  public static void main(String... jerry)
    {
    new ConsChain();
    }
  }
