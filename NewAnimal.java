class Animal
{
}
class Monkey extends Animal
{
}
class NewAnimal
{
public void m1(Animal a)
{
	System.out.println("Animal Version");
}
	public void m1(Monkey m)
{
	System.out.println("Monkey version");
}
	public static void main(String[] args)
{
	NewAnimal t = new NewAnimal();

	Animal a = new Animal();
	t.m1(a);
	
	Monkey m = new Monkey();
	t.m1(m);	

	Animal a1 = new Monkey();
	t.m1(a1);
}
}