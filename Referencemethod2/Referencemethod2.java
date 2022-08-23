package Referencemethod2;

public class Referencemethod2 {
	
	public void method1(Person p1) {
		p1.name="Jane";
		method2(p1);
}

public void method2(Person p2) {
	Person p22=new Person();//p22 object created.
	p22.name = "Andy";
	p2.name = p22.name;//p2 name changes to Andy
	method3(p2);
}

public void method3(Person p3) {
	
	p3.name = "mike";
	p3 = new Person();//constructor, not a reference variable.
}


public static void main(String[] args) {
	Referencemethod2 rmd = new Referencemethod2();
	Person p = new Person();
	System.out.println(p.name);//John
	rmd.method1(p);//runs method3.
	System.out.println(p.name);//mike
	
}


}
