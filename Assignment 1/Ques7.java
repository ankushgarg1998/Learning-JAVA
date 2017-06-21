import java.util.Scanner;

class Ques7
 	{
	public static void main(String... jerry)
		{
		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter 1st number : ");
		int a = scan.nextInt();
		System.out.print("\nEnter 2nd number : ");
		int b = scan.nextInt();
		System.out.print("\nEnter 3rd number : ");
		int c = scan.nextInt();

		if (a>=b)
			{
			if (a>=c)
				System.out.println(a+" is the largest");
			else
				System.out.println(c+" is the largest");
			}
		else
			{
			if (b>=c)
				System.out.println(b+" is the largest");
			else
				System.out.println(c+" is the largest");
			}
		}
	}
