	class Amazon
	{
	String name;
	long mobileNum;
	String email;
	String password;
	public Amazon(String name, long mobileNum, String email, String password) {
		this.name = name;
		this.mobileNum = mobileNum;
		this.email = email;
		this.password = password;
	}
	public  Amazon(){
		
	}
	@Override
	public String toString() {
		return name+"  "+mobileNum+"  "+email+"   "+password;
	}
	}

	public class Ecommerce{
		public static void main (String[] args) {
			Amazon ob1 = new Amazon ("SaiRam",776667776l,"SaiRam@","code@123");
			System.out.println(ob1);
			Amazon  ob2 = new Amazon ("Venu",776667776l,"Venu@","venu@123");
			System.out.println(ob2);
			Amazon  ob3 = new Amazon ("Saketh",776667776l,"Saketh@","python@123");
			System.out.println(ob3);
		
		
		}
			
		}
   
	
	