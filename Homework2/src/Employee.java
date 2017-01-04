import java.util.Date;

public class Employee implements View{
	 double salary;
	 int holiday;
	 int years;
	 String lastName;
	 String firstName;
	 Date birthDate;
	public String getDataView(){
		return firstName + " " + lastName + "," + birthDate + "," + salary + "," + holiday + "," + years;
		
	}
}
