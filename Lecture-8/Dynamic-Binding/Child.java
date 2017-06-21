class Child extends Base
  {
  int x = 40;
  void show()
    {
    System.out.println("Child");
    }
  void display()
    {
    System.out.println("Display");
    }
  public static void main(String... jerry)
    {
    Base b = new Child();
    b.show();
    //b.display();//Rule:- The unique existence of the function is always checked in the class whose reference variable is holding the refered id of the object.
    System.out.println(b.x); //Data Members cannot be overridden.
    }
  }
