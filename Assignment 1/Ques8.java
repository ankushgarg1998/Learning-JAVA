import java.util.Scanner;

class Ques8
 	{
	public static void main(String... jerry)
		{
		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter a number : ");
		int a = scan.nextInt();
		switch(a)
			{
			case 1:	System.out.println("Sunday");
				break;
			case 2:	System.out.println("Monday");
				break;
			case 3:	System.out.println("Tuesday");
				break;
			case 4:	System.out.println("Wednesday");
				break;
			case 5:	System.out.println("Thursday");
				break;
			case 6:	System.out.println("Friday");
				break;
			case 7:	System.out.println("Saturday");
				break;
			default:System.out.println("Error");
			}
		}
	}
