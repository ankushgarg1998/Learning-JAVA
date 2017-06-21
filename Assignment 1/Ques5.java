import java.util.Scanner;

class Ques5
  {
  public static void main(String... jerry)
    {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter 2 Numbers :");
    int x = scan.nextInt();
    int y = scan.nextInt();
    System.out.println(x+" + "+y+" = "+(x+y));
    System.out.println(x+" - "+y+" = "+(x-y));
    System.out.println(x+" * "+y+" = "+(x*y));
    System.out.println(x+" / "+y+" = "+(x/y));
    if (x>y)
      System.out.println("\n"+x+" > "+y);
    else if (x<y)
      System.out.println("\n"+x+" < "+y);
    else
      System.out.println("\n"+x+" = "+y);
    }
  }
