class A{
	int x = m1();
	int m1();
{
	System.out.println("A Non Static variable");
	return 10;
}
{
	System.out.println("A Non Static Block");
}
	A(){
		System.out.println("A Constructor");
}
}

class B extends A{
		int y = m2();
		int m2(){
			System.out.println("Non Static variable");
			return 20;
}
{
		System.out.println("B Non Static Block");
}
	B(){
		System.out.println("B Constructor");
	}	
	public static void main(String[] args){
	System.out.println(" B main");

	B b = new B();
	System.out.println("\n B main x:"+b.x);
	System.out.println("\n B main y:"+b.y);
}
}