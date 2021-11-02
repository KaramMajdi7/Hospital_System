

public class admin {
	
	private String name;
	private int ID;
	private String job;
	doctor docc;

	
	
	
	//Zero arg constr
	public admin() {
		super();
	}
	
	
	//Multi arg constr
	public admin(String name, int iD, String job) {
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
		return "Admin name : " +this.getName()+"\t ID = "+this.getID()+"\t Job : "+this.getJob();
	}
	
	
	
	

}
