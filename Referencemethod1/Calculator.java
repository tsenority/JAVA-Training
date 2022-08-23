package Referencemethod1;
//In Nestedmethodcalls, one method calls another method.
//To have no return, enter void in the method.
//When there is 2 variable of same name, 
//the variable in the local method gets the preference.

public class Calculator{
	int a= 100;
	int b= 200;
	public int add(int x, int y) {
	int a=150;
	this.a = 500;// calls global variable
	
		mul(x,y);
		return x;
		
		
		
		
	}		
		
 public void mul(int x, int y) {
	  div(x,y);

	  
	 
  }

public int div(int x, int y) {
	 return x/y;
	
}



public static void main(String[] args) {
	
	Calculator C = new Calculator();
	int simpleMethodcall = C.div(50,2);//25
	System.out.println(simpleMethodcall);
	int nestedmethodcall = C.add(50,2);
	System.out.println(nestedmethodcall);//50
	
	
}
}