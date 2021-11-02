
public class patient {
	private String name;
	
	private String problem;
	
	
	//Zero arg constr
	public patient() {
		super();
	}
	
	
	//Multi arg constr
	public patient(String name, String problem) {
		super();
		this.name = name;
	
		this.problem = problem;
	}
	
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getproblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	
	
	//toString method to return the info of this class
	@Override
	public String toString() {
		return "Patient name : " +this.getName()+"\t Patient problem : "+this.getproblem();
	}
	
	
	



}
