// one to one association


class Account 
{
	String accNo;
	String accName;
	String accType;
	Account(String accNo,String accName,String accType)
{
	this.accNo = accNo;
	this.accName = accName;
	this.accType = accType;
}
}
	class Employee
{
	String eid;
	String ename;
	String eaddr;
	Account acc;
	Employee(String eid,String ename,String eaddr,Account acc)
{
	this.eid = eid;
	this.ename = ename;
	this.eaddr = eaddr;
	this.acc = acc;
}
	public void getEmployee()
{
	System.out.println("Employee Details");
	System.out.println("----------------");
	System.out.println("Employee Id:"+eid);
	System.out.println("Employee Name:"+ename);
	System.out.println("Employee Address:"+eaddr);
	System.out.println();

	System.out.println("Address Details");
	System.out.println("----------------");
	System.out.println("Account Number:"+acc.accNo);
	System.out.println("Account Name:"+acc.accName);
	System.out.println(" Address:"+acc.accType);
}
}

	class OneToOne
{
	public static void main(String[] args)
{
	Account acc = new Account("abc123","Durga N","Saving");
	Employee emp = new Employee("E-111","Durga","Hyd",acc);
	emp.getEmployee();
}
}