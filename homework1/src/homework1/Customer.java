package homework1;

public class Customer {

    public Customer() {
		
	}
    
    
	
	private int id;
	private String City;
	
	public Customer(int id,String City){
		this.id=id;
		this.City=City;
		
		
		
	}
	
	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
