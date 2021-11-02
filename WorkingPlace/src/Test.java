

public class Test {

	public static void main(String[] args) {
		
		patient pp = new patient("Name","Problem");
		
		
		doctor doc =  new doctor("Name",271788,"Job");
		doc.bb(pp);
		System.out.println(doc.toString());
		
		admin am = new admin("Name",820109,"Job");
		
		main mm = new main("Country");
		mm.mainAdd(am);
		mm.brint();
		
	}

}
