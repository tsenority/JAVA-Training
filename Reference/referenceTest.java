package Reference;

public class referenceTest {
	
	public static void main(String[] args) {
			person p = new person();
			// object p is created from person.  
			//class. p is also known as the reference variable.
			//connecting two classes.
			person q = new person();// object q is created.
		
			p.age = 35;// value changed
			q.age = 30;//new value assigned to q.
			q.name = "Tsering";
			q.weight =150.05f;
			p=q;
		
			
			System.out.println(p.age);//35
			System.out.println(q.age);//30
			System.out.println(q.name);//Tsering
			System.out.println(q.weight);//150.05
			System.out.println(p);// value changed

}
}
