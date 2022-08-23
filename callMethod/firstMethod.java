//Calling a method from first class in the second class.

package callMethod;

public class firstMethod{
	public int Add(int a, int b, int c) { //static means not creating an object.
	
	return a+b+c;
	}
	
public class secondMethod{

	public static void main(String[] args) {
		firstMethod m = new firstMethod();
		//Reference variable m created.
         int result = m.Add(5, 10, 15);
         //Data type has the same as in Add method.
         //Using Add method from first class.
         System.out.println("This is the result:" + ""   +result);
	}

}
}
//In complex data type, we don't declare a variable name.
//Example:m.Add(null); without any variable name assigned.
// we have to create a separate reference variable of a complex data type.


