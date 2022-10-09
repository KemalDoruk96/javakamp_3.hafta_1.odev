package homework1;

public class customerManager {
  
	private Customer _customer;
	private ICreditManager _creditManager;
	
	public  customerManager(Customer customer,ICreditManager creditManager) {
		_customer=customer;
		_creditManager=creditManager;
	}
	
	public void Save() {
		System.out.println("Müşteri Eklendi" + _customer.getId());
		
	}

	public void Delete() {
		System.out.println("Müşteri Silindi" + _customer.getId());
		
	}
	
	public void GiveCredit() {
		
		_creditManager.Calculete();
		System.out.println("Kredi verildi");
		
	}


	
	
	
	  
 }
	
	

