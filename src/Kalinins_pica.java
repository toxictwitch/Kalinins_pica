import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Kalinins_pica {
	

	
	public static ArrayList<Pica> picaList = new ArrayList<Pica>();
	
	
	
	static void JaunaPica(){
		String[] picasIzvele = {"Pica Margarita", "Studentu pica", "Mafia", "Hawaian", "atpakal uz menu"};
				
		String izvele = (String) JOptionPane.showInputDialog(null, "Izvelies Picu!", "Izv�lies picu!",
						JOptionPane.QUESTION_MESSAGE, null, picasIzvele, picasIzvele[0]);
		
		String[] picasIzmers = {"20cm", "30cm", "50cm"};
		
		String izmers = (String) JOptionPane.showInputDialog(null, "Izvelies Picas izm�ru!", "Izv�lies picu!",
						JOptionPane.QUESTION_MESSAGE, null, picasIzmers, picasIzvele[1]);
		
		
		int izm = 0;
		double cena = 0;
		Pica jauna;
		switch(izvele){
			case "Pica Margarita":
				switch(izmers){
				case "20cm": izm=20; cena=6.00;  break;		
				case "30cm": izm=30; cena=8.00; break;	
				case "50cm": izm=50; cena=10.00; 
			}
				jauna = new Pica("Pica Margarita", cena, izm, true, true, false, false, false);
				picaList.add(jauna);
				
			break;
					
			case "Studentu":
				
				switch(izmers){
				case "20cm": izm=20; cena=8.0;  break;		
				case "30cm": izm=30; cena=10.0; break;	
				case "50cm": izm=50; cena=12.0; 	
				
				jauna = new Pica("Studentu pica", cena, izm, true, true, false, false, false);
				picaList.add(jauna);
			}
			
			break;
					
				case "Mafia":
					switch(izmers){
					case "20cm": izm=20; cena=11.0;  break;		
					case "30cm": izm=30; cena=13.0; break;	
					case "50cm": izm=50; cena=15.0; 
				}
					jauna = new Pica("Mafia", cena, izm, true, true, true, false, true);
					picaList.add(jauna);
					break;
					
				case "Hawaian":
					switch(izmers){
					case "20cm": izm=20; cena=10.0;  break;		
					case "30cm": izm=30; cena=12.0; break;	
					case "50cm": izm=50; cena=14.0; 
				}
					jauna = new Pica("Mafia", cena, izm, true, true, true, false, true);
					picaList.add(jauna);
					break;	
					
		}
	}
	
	static void VisasPicas(){
		
		String str = "";
		
		for(int i=0; i<picaList.size(); i++){
			str+= picaList.get(i).getNos()+" "+picaList.get(i).getDiam()+"cm "+picaList.get(i).getCena()+"0�\n";
		}
		JOptionPane.showMessageDialog(null, str, "txt \n", JOptionPane.INFORMATION_MESSAGE);
	}
	
	static void konts() {
	    Person person = new Person();
	    String var;
	    String[] darbibas = {"Apskatit savu kontu", "izveidot kontu"};
	    var = (String) JOptionPane.showInputDialog(null,"izvelies opciju" ,"Konts", JOptionPane.QUESTION_MESSAGE,
	            null, darbibas, darbibas[0]);
	    if (var.equals("izveidot kontu")) {
	       person.setName((String) JOptionPane.showInputDialog(
	                null, "Ievadi savu v�rdu", "V�rds", JOptionPane.QUESTION_MESSAGE));
	        person.setSurname((String) JOptionPane.showInputDialog(
	                null, "Ievadi savu uzv�rdu", "Uzv�rds", JOptionPane.QUESTION_MESSAGE));
	        person.setAddress((String) JOptionPane.showInputDialog(
	                null, "Ievadi savu adresi", "Adrese", JOptionPane.QUESTION_MESSAGE));
	        person.setPhoneNumber((String) JOptionPane.showInputDialog(
	                null, "Ievadi savu telefonu", "Telefons", JOptionPane.QUESTION_MESSAGE));
	    }
	    JOptionPane.showMessageDialog(null,
	            "J�su konts:\n" +
	                    "V�rds: " + person.getName() + "\n" +
	                    "Uzv�rds: " + person.getSurname() + "\n" +
	                    "Adrese: " + person.getAddress() + "\n" +
	                    "Telefons: " + person.getPhoneNumber(),
	            "Konts", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void main(String[] args) {
		boolean q=true;
		String[] MainMenu = {"Pasutit picas", "Jusu konts", "Izveletas picas", "Apturet programmu"};
		
		
		String MenuIzvele;
		do{
			MenuIzvele = (String) JOptionPane.showInputDialog(null, "Izvelejies darbibu", "Menu",
					JOptionPane.QUESTION_MESSAGE, null, MainMenu, MainMenu[0]);
				
		switch(MenuIzvele){
			case "Pasutit picas":
				JaunaPica();
			break;
			
			case "Jusu konts":
			konts();
			break;
		
			case"Izveletas picas":
				VisasPicas();
			break;
		
			case "Apturet programmu":
				q=false;
				break;
		}
		
		}while(q==true);
	


	}

}
