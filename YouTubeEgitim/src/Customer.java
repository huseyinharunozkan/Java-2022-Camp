
public class Customer {
	int Id;
	String City;

	public Customer() {
		System.out.println("M��teri nesnesi ba�lat�ld�");
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
