public class Address 
{
	private int houseNumber;
	private String street;
	private int apartNumber;
	private String city;
	private String state;
	private int postalCode;
	
	public Address(int houseNumber, String street, String city, String state, int postalCode)
	{
		this.houseNumber = houseNumber;
		this.street = street;
		this.apartNumber = 0;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	
	public Address(int houseNumber, String street, int apartNumber, String city, String state, int postalCode)
	{
		this.houseNumber = houseNumber;
		this.street = street;
		this.apartNumber = apartNumber;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	
	public void print()
	{
		System.out.println(street);
		System.out.printf("%s %s %d\n", city, state, postalCode);
	}
	
	public boolean comesBefore(Address other)
	{
		if (this.postalCode < other.postalCode) {return true;}
		else {return false;}
	}
}
