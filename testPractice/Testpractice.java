package testPractice;

public class Testpractice {
	int age =10;

	int $sample = 50;//only $ and _ at the begining allowed.
	String name = "Norbu";
	float weight = 100.05f;
	
	
	public void method1(int x, int y) {
		int a= 50;
		int b= 100;
		method2(a,b);
		
		
	}
	
	public int method2(int x, int y) {
		int a = 10;
		int b = 20;
		int z =  a*b;
		System.out.println(z);
		return z;
		
	}
	
	//output data type, method name, input type
	// void in output when no return required.
	
	public static void main(String[] args) {	
	Testpractice R =new Testpractice();//Reference Variable created.
	R.name ="Tsering";
	R.age =36;
	System.out.println(R.name);
	System.out.println(R.age);
	 R.method1(10,5);//calls method1 which is a*b
				// need same amount of input as argument in method.
	            //200
	 
	
	}
	}

