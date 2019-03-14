class parent
{
	public void m1()
	{
		System.out.println("Parent");	
	}
}

class child
{
	public void m2()
	{
		System.out.println("Child");
	}
}

class Inher
{
	public static void main(String[] args)
{
	parent p = new parent();
	parent.m1();

	child c = new child();
	child.m1();
	child.m2();

	parent p1 = new child();
	p1.m1();
	p1.m2();

	child c1 = new parent();
}
}