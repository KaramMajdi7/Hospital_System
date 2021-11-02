import java.util.ArrayList;

public class doctor {
	private String name;
	private int ID;
	private String job;
	public patient pp1 = new patient();
	
	ArrayList<patient>ppp = new ArrayList<>();
	
	public void bb(patient pp1) {
		ppp.add(pp1);
	}
	
	
	//Zero arg constr
	public doctor() {
		super();
	}
	
	
	//Multi arg constr
	public doctor(String name, int iD, String job) {
		super();
		this.name = name;
		ID = iD;
		this.job = job;
	}
	
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	//toString method to return the info of this class
	@Override
	public String toString() {
		for(patient pp2 : ppp) {
		return "Doctor name : " +this.getName()+"\t ID = "+this.getID()+"\t Job : "+this.getJob()+"\n"+pp2.toString();
		}
		return "a";
	}
	
	
	
	

}
