class student 
{
	String sname;
	int regno;
	String branch;
	public student(String sname,int regno,String branch)
	{
		this.sname=sname;
		this.regno=regno;
		this.branch=branch;
	}
	public static void main(String[] args) 
	{
		student s1=new student("Rani",214,"MCA");
		student s2=new student("Nadia",215,"CSE");
		student s3=new student("Prag",216,"Civil");
		System.out.println(s1.sname+","+s1.regno+","+s1.branch);
		System.out.println(s2.sname+","+s2.regno+","+s2.branch);
		System.out.println(s3.sname+","+s3.regno+","+s3.branch);
	}
}
