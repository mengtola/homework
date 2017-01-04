
public class TeamLeader extends Employee implements View{
	int projectNum;
	public String getDataView(){
		
		return new StringBuffer(firstName + " " + lastName).toString().toUpperCase() + "," + projectNum;
	}
}
