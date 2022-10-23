
public class Customer {
	int Id;
	String City;

	public Customer() {
		System.out.println("Müþteri nesnesi baþlatýldý");
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		this.City = city;
	}

}
