
class Customer
{
	int id;
	String name;
	String address;
	long mobileNo;
	double payBill;
	public Customer()
	{
		id=123;
		name="ravi";
		address="eluru";
		mobileNo=6302885345l;
		payBill=3999;


	}

	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(mobileNo);
		System.out.println(payBill);
	}
}


public  class TestCustomer{

	public static void main (String[] args) {
		Customer ob1=new Customer();
		ob1.display();

	}
}


