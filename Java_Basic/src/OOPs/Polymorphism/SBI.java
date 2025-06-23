package OOPs.Polymorphism;

public class SBI extends Bank {

	 static User userDetails ;

	SBI(User userDetails) {
		
		// User details filling..
		userDetails.name = "Sapna Shobhit Lohkare";
		userDetails.DOB = "05/05/1992";
		userDetails.address = "Sawangi meghe wardha- 442001";
		userDetails.accountType = "Saving";

		userDetails.balance = 300000;
		userDetails.userId = 9867;
		userDetails.accountNo = 3869085;

		// Bank details filling...
		this.name = "State Bank Of India";
		this.address = "Shashtri chawk wardha - 442001";
		this.IFSC_Code = "SBIN095334F";
		

	}	



	public SBI() 
	{
		this(userDetails);
	}



	public String displayDetails(User userDetails)
	{
		return userDetails.name +" ,"+userDetails.DOB +" , "+userDetails.address+" , "
	           +userDetails.accountType+" , "+userDetails.balance+" , "+"\n"+userDetails.userId+" , "
			   +userDetails.accountNo+" , "+ this.name+" , "+this.address+" , "+this.IFSC_Code;
	}

	// method Overriding
	public void open() {
		System.out.println("SBI Account Opened..");
	}
	
	// if try to write same open method then its compile time error -compile time Polymorphism-  
	public void open(String joint) {
		System.out.println("SBI "+joint+" opened..");
	}
	
	public void close() {
		System.out.println("SBI Account closed..");
	}

	public void deposite() {
		System.out.println("SBI Amount deposited..");
	}

	public void withdraw() {
		System.out.println("SBI Amount withdrawal..");
	}

	public void transfer() {
		System.out.println("SBI Amount transfered..");
	}

	public static void main(String[] args) 
	{
		userDetails = new User();
		SBI sbi_Object =  new SBI(userDetails);
		
		System.out.println("------method overloading-----------");
		//method overloading
		sbi_Object.open();
		sbi_Object.open("Joint Account");
		
		System.out.println();
		
		System.out.println("------method overriding-----------");
		
		Bank bank_Object;
		
		//1)application
		bank_Object = new SBI();
		
		//method overriding--- shows parent class while compiling but calls child class method
		bank_Object.deposite();
		bank_Object.transfer();
		bank_Object.withdraw();
		bank_Object.close();
		
		System.out.println();
		System.out.println("---SBI Account Details-----");
		System.out.println(sbi_Object.displayDetails(userDetails));
		
		System.out.println();
		System.out.println("---Different Behavior of Same Object-----");
		
		//2)application
		bank_Object = new BOB();
		
		bank_Object.open();
		bank_Object.deposite();
		bank_Object.withdraw();
		bank_Object.transfer();
		bank_Object.close();
		
		BOB bob_Object = new BOB();
		bob_Object.open("Joint Account");
		
		
	}

}
