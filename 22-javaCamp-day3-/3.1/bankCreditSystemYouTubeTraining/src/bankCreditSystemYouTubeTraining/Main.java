package bankCreditSystemYouTubeTraining;

public class Main {

	public static void main(String[] args) {
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.calculate();
		creditManager.save();
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setCity("İzmit");
		
		
		CustomerManager customerManager = new CustomerManager(new Company(),new TeacherCreditManager());
		customerManager.save();
		customerManager.delete();
		
		Company company = new Company();
		company.setCompanyName("Arçelik");
		company.setTaxNumber("123456789");
		company.setId(100);
		
		CustomerManager customerManager2 = new CustomerManager(new Person(), new CarCreditManager());
	
		Person person = new Person();
		person.setFirstName("Ertuğrul");
		person.setLastName("Tekin");
		person.setNationalIdentity("123456");
		person.setCity("İzmit");
		
		
		
		
	}

}
