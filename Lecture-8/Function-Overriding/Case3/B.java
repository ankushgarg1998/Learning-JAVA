class B extends A
  {
  Child show()
    {
    System.out.println("B");
    //System.out.println(super.show());
    return new Child();
    }
  public static void main(String... Jerry)
    {
    B b = new B();
    b.show();
    // System.out.println(b);
    // System.out.println((A)b);
    }
  }
