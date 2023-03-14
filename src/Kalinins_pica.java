import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Kalinins_pica {
	
	
	
	
	static void Account(){
		String Name, Surname, adress, pNumber;
		
		Name =  JOptionPane.showInputDialog(null, "Ievadiet jusu Vardu",
				"Account", JOptionPane.QUESTION_MESSAGE);
		Surname =  JOptionPane.showInputDialog(null, "Ievadiet jusu uzvardu",
				"Account", JOptionPane.QUESTION_MESSAGE);
		adress =  JOptionPane.showInputDialog(null, "Ievadiet jusu adresi",
				"Account", JOptionPane.QUESTION_MESSAGE);
		pNumber =  JOptionPane.showInputDialog(null, "Ievadiet jusu telefona numuru",
				"Account", JOptionPane.QUESTION_MESSAGE);
	}
	static void PizzaOrdering(){
String[] picasIzvele = {"pica Margarita", "Studentu pica", "Mafia", "Hawaian", "atpakal uz menu"};
		
		String izvele = (String) JOptionPane.showInputDialog(null, "Izvelies Picu!", "Picas Izvele",
				JOptionPane.QUESTION_MESSAGE, null, picasIzvele, picasIzvele[0]);
		
		switch(izvele){
		case "Margarita": 
			Margarita();
			
			break;
			
		case "Studentu":
			StudentuPica();
			break;
			
		case "Mafia":
			Mafia();
			break;
			
		case "Hawaian":
			Hawaian();
			break;
			
			
		case "atpakal uz menu":
			JOptionPane.showMessageDialog(null, "xxx", "Pizza Ordering",JOptionPane.INFORMATION_MESSAGE);
			break;
			
			
			
		}while(!izvele.equals("atpakal uz menu"));
	}

	static void Margarita(){
		String[] margaritaVeidas = {"30cm - 9.00€", "40cm - 12.00€", "50cm - 15.00"};
		 String MargaritasIzvele;
		 MargaritasIzvele = (String) JOptionPane.showInputDialog(null, "izvelies izmeru!", "Margaritas izvele", JOptionPane.QUESTION_MESSAGE,
				null, margaritaVeidas, margaritaVeidas[0] );
		 ArrayList<String> picalist = new ArrayList<String>();
		 switch(MargaritasIzvele){
		 
		 case "30cm - 9.00€":
			 picalist.add("30cm - 9.00€");
			 break;
			 
		 case "40cm - 12.00€":
			 break;
			 
		 case "50cm - 15.00":
			 break;
			 
		 }
		
		
	}
	static void StudentuPica(){
		String[] margaritaVeidas = {"30cm - 9.00€", "40cm - 12.00€", "50cm - 15.00"};
		 String MargaritasIzvele;
		 MargaritasIzvele = (String) JOptionPane.showInputDialog(null, "izvelies izmeru!", "Margaritas izvele", JOptionPane.QUESTION_MESSAGE,
				null, margaritaVeidas, margaritaVeidas[0] );
		 switch(MargaritasIzvele){
		 
		 case "30cm - 8.00€":
			 break;
			 
		 case "40cm - 10.50€":
			 break;
			 
		 case "50cm - 13.00":
			 break;
			 
		 }
	}
			 
	static void Mafia(){
		String[] MafiaVeidas = {"30cm - 12.00€", "40cm - 15.00€", "50cm - 18€"};
		
		String MafiaIzvele = (String) JOptionPane.showInputDialog(null, "Izvelies Mafia picas izmeru",
				"Mafia", JOptionPane.QUESTION_MESSAGE, null, MafiaVeidas, MafiaVeidas[0]);
		switch(MafiaIzvele){
		
		case "30cm - 12.00€":
			break;
			
		case "40cm - 15.00€":
			break;
			
		case "50cm - 18€":
		}
	
			
	}
	static void Hawaian(){
		String[] HawaianVeidi = {"30 cm - 11.00€", "40cm - 13.00€", "50cm - 15€"};
		//String HawaianIzvele = (String)JOptionPane.showMessageDialog(null, "Izvelies Hawaian picas izmeru", );
	}
	
	
	public static void main(String[] args) {
		
		String[] MainMenu = {"Igadadat picas", "jusu konts", "izveletas picas", "apturet programmu"};
		
		String MenuIzvele = (String) JOptionPane.showInputDialog(null, "Izvelejies darbibu", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, MainMenu, MainMenu[0]);
		
		
		switch(MenuIzvele){
		case "Igadadat picas":
			PizzaOrdering();
			break;
			
		case "jusu konts":
		break;
		
		case"izveletas picas":
		break;
		
		case "apturet programmu":
		}while(!MenuIzvele.equals("apturet programmu"));
	


	}

}
