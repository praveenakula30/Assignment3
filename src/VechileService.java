class Vehicle
{
String company;
String color;
double price;
public Vehicle(String company, String color, double price) {
	super();
	this.company = company;
	this.color = color;
	this.price = price;
}
public Vehicle() {
	
}
@Override
public String toString() {
	return company+"     "+color+"    "+price+"   ";
}
	
}

public  class VechileService {
	public static void main(String[] args) {
	 Vehicle ob1 = new Vehicle("kia","red",50000.0);
	 System.out.println(ob1); 
	}
	
	}