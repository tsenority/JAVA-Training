package Practice;

public class Variable {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		int c= (a+b);
		int d=b;
		b=100;
		int x=a;
		int y=b;
		int z=(a*c);//300
		
		System.out.println(a);//10
		System.out.println(b);//100
		System.out.println(c);//30
		System.out.println(d);//20
		System.out.println(y);//100
		System.out.println(z);//300

	}

}
//It has to be a same data type to replace value.