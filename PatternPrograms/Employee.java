class Employee 
{
	static String cname="Infosys";
	public static void work()
	{
		System.out.println("Iam working for "+cname);
	}
	String ename;
	int eid;
	double esal;
	public void displayEmployeeInfo()
	{
		System.out.println("Ename= "+this.ename+" Eid= "+this.eid+" Esal= "+this.esal);
	}
	public Employee(String ename,int eid,double esal)
	{
		this.ename=ename;
		this.eid=eid;
		this.esal=esal;
	}

	public static void main(String[] args) 
	{
		Employee e1=new Employee("Rani",214,600000);
		Employee e2=new Employee("Nadia",215,400000);
		Employee e3=new Employee("prag",216,450000);
		e1.displayEmployeeInfo();
		e1.work();
		System.out.println("----------------------------------");
		e2.displayEmployeeInfo();
		e2.work();
		System.out.println("----------------------------------");
		e3.displayEmployeeInfo();
		e3.work();
		
	}
}
