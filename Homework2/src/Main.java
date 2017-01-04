import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> lst = new ArrayList<Employee>();
		
		
		Employee emp = new Employee();
		emp.firstName = "Bun";
		emp.lastName ="Samno";
		emp.birthDate = new Date("04/06/1990");
		emp.holiday = 8;
		emp.salary = 300;
		emp.years = 26;
		
		Developer dev = new Developer();
		dev.firstName = "Sok";
		dev.lastName = "Pheak";
		dev.comment = "Excelent";
		dev.salary = 500;
		
		TeamLeader  tml = new TeamLeader();
		tml.firstName = "Sem";
		tml.lastName = "Chenda";
		tml.projectNum = 5;
		
		lst.add(emp);
		lst.add(dev);
		lst.add(tml);
		
		String str = "";
		
		for(Employee val : lst) {
			System.out.println(val.getDataView());
			
		}
		
		
		
		
		
		
	}

}
