class Temp
  {
  static Demo d;
  static
    {
    int z;
    try {
      z = System.in.read();
      d = new Demo(z);
    } catch(Exception e) {}
    }
  }
