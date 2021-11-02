import java.util.ArrayList;

public class main {
	
	ArrayList<admin>ad2 = new ArrayList<>();
	private String placeName;
	
	
	public main() {
		super();
	}


	public void mainAdd(admin aa) {
		ad2.add(aa);
		
	}
	
	public String brint() {
		for(admin aa2  : ad2) {
			System.out.println(aa2+"\tLocation : "+getPlaceName());
		}
		return placeName;
	}
	
	
	
	public main( String placeName) {
		super();
		
		this.placeName = placeName;
	}


	public ArrayList<admin> getAd2() {
		return ad2;
	}


	public void setAd2(ArrayList<admin> ad2) {
		this.ad2 = ad2;
	}


	public String getPlaceName() {
		return placeName;
	}


	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	
	

}
