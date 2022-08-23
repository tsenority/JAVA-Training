//How to call a method?
package Practice;

public class Method {
	static void Add() { //static means not creating an object.
	int a = 10;
	int	b = 20;
	int c = a+b;
	
	System.out.println(c);
	}
	

	public static void main(String[] args) {
		Method.Add();//Call with the classname.methodname

	}

}
