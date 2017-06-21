class B extends A
  {
  public void show()
  // protected void show()
  // default void show()
  // private void show()
    {
    System.out.println("B");
    //super.show();
    }
  public static void main(String... Jerry)
    {
    B b = new B();
    b.show();
    }
  }
