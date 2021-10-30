/**
 * 
 */
package CompanyModel;

/**
 * @author Waleed
 *
 */
public class Company {
	
	private String companyName;
	
	private Employee[] myEmployees;
	
	public Company(String name) {
		this.companyName = name;
		myEmployees = new Employee[5];
		
	}
	
	public int numberOfEmployees() {
		return myEmployees.length;
	}
	
	public String toString() {
		
		return companyName;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company myCompany = new Company("Waleed's Company");
		
		System.out.println("New company: " + myCompany);
		System.out.println("Number of Employees: " + myCompany.numberOfEmployees());
		
	}

}
