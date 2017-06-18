class Emp
	{
	String name;
	int salary;
	static String companyName = "Google";
	void get(String s, int i)
		{
		name = s;
		salary = i;
		}
	void show()
		{
		System.out.println(name);
		System.out.println(salary);
		System.out.println(companyName);
		}
	static void compChange(String c)
		{
		companyName = c;
		}
	public static void main(String ankush[])
		{
		//System.out.println(new Emp());
		//new Emp().get("Ankush", 100);

		Emp e = new Emp();
		e.get("Ankush", 100);
		System.out.println(e);
		e.show();

		// System.out.println(e.name);
		// System.out.println(e.salary);
		// System.out.println(e.companyName);

		// System.out.print(companyName);
		// System.out.print(Emp.companyName);

		Emp e1 = new Emp();
		e1.get("Nikita", 200);
		System.out.println(e1.companyName);
		// e.compChange("Microsoft");
		compChange("Microsoft");
		System.out.println(e.companyName);
		System.out.println(e1.companyName);


		}
	}
