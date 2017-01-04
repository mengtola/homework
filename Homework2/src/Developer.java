import java.util.Date;

public class Developer extends Employee{
	String comment;
	public Developer(){}
	public Developer(String firstName,String lastName,Date birthDate,double salary,int holiday,int years,String comment) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.salary = salary;
		this.holiday = holiday;
		this.years = years;
		this.comment = comment;
	}
	
	public String getDataView(){
		return firstName + " " + lastName + "," + comment + "," + salary;
		
		
	}
	
}
