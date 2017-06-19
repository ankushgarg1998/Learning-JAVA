class Initblock
  {
    {
    System.out.print("\n__init__ ");
    }
  Initblock()
    {
    System.out.print("Default");
    }
  Initblock(int x)
    {
    System.out.print("Parameterised");
    }

  public static void main(String... jerry)
    {
    new Initblock();
    new Initblock(19);
    }
  }
