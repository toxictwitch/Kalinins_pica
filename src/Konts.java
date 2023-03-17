
public class Konts {
	String vards;
	String uzvards;
	String adrese;
	String telefons;
	
	public Konts(String vards, String uzvards, String adrese, String telefons){
		this.vards = vards;
		this.uzvards = uzvards;
		this.adrese = adrese;
		this.telefons = telefons;
	}
	
	public String getVards(){
		return vards;
	}
	public String getUzvards(){
		return uzvards;
	}
	public String geAdrese(){
		return adrese;
	}
	public String getTel(){
		return telefons;
	}
}

