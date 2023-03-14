
public class Pica {
	String nosaukums;
	double cena;
	int diametrs;
	boolean biezums;
	boolean siers;
	boolean tomati;
	boolean pipari;
	boolean gala;
	
	public Pica(String nosaukums, double cena, int diametrs, boolean biezums, boolean siers, 
			    boolean tomati, boolean pipari, boolean gala){
		this.nosaukums = nosaukums;
		this.cena = cena;
		this.diametrs = diametrs;
		this.biezums = biezums;
		this.siers = siers;
		this.tomati = tomati;
		this.pipari = pipari;
		this.gala = gala;
	}
		
	public String Izdruka(){
		String rez = nosaukums + "  " + diametrs + " cm - " + cena + " EUR" ;
		return rez;
	}

}
