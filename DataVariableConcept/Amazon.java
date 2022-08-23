package DataVariableConcept;

public class Amazon {
	public static void main(String[] args) {
	boolean loggedIn;
	MembershipDetails	primeMembers;// is in MembershipDetails class.

	AddressDetails	address;// combination of string and  numbers.
	//Because, address variable has more than one data type.
	// We have to create a separate class.
	//is in separate AddressDetails class.
	CreditcardDetails creditCard;
	ShoppingcartDetails shoppingCart;
	InventoryDetails inventory;
	}
	
	/*Method Declaration:
	public output data type method name(Input data type);

`*/
 public boolean signedIn(String Username,String password){
	 
	 return true;
	 
 }
 
 public int inventoryBalance(int quantity) {
 
 return 100;//output data type
 }
public class customerDetails{// create a separate class for more than 
	//1 data type for both input and output.
	String name;
	int id;
	AddressDetails address;
}       //complex                          //complex
public MembershipDetails memberInfo(int customerDetails) {
	return null;
}
}






