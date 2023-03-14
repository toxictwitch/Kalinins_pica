import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Kalinins_pica {
	
//	static void Account(){
//		String Name, Surname, adress, pNumber;
//		
//		Name =  JOptionPane.showInputDialog(null, "Ievadiet jusu Vardu",
//				"Account", JOptionPane.QUESTION_MESSAGE);
//		Surname =  JOptionPane.showInputDialog(null, "Ievadiet jusu uzvardu",
//				"Account", JOptionPane.QUESTION_MESSAGE);
//		adress =  JOptionPane.showInputDialog(null, "Ievadiet jusu adresi",
//				"Account", JOptionPane.QUESTION_MESSAGE);
//		pNumber =  JOptionPane.showInputDialog(null, "Ievadiet jusu telefona numuru",
//				"Account", JOptionPane.QUESTION_MESSAGE);
//	}
//	static void PizzaOrdering(){
//String[] picasIzvele = {"pica Margarita", "Studentu pica", "Mafia", "Hawaian", "atpakal uz menu"};
//		
//		String izvele = (String) JOptionPane.showInputDialog(null, "Izvelies Picu!", "Picas Izvele",
//				JOptionPane.QUESTION_MESSAGE, null, picasIzvele, picasIzvele[0]);
//		
//		switch(izvele){
//		case "Margarita": 
//			Margarita();
//			
//			break;
//			
//		case "Studentu":
//			StudentuPica();
//			break;
//			
//		case "Mafia":
//			Mafia();
//			break;
//			
//		case "Hawaian":
//			Hawaian();
//			break;
//			
//			
//		case "atpakal uz menu":
//			JOptionPane.showMessageDialog(null, "xxx", "Pizza Ordering",JOptionPane.INFORMATION_MESSAGE);
//			break;
//			
//			
//			
//		}while(!izvele.equals("atpakal uz menu"));
//	}
//
//	static void Margarita(){
//		String[] margaritaVeidas = {"30cm - 9.00€", "40cm - 12.00€", "50cm - 15.00"};
//		 String MargaritasIzvele;
//		 MargaritasIzvele = (String) JOptionPane.showInputDialog(null, "izvelies izmeru!", "Margaritas izvele", JOptionPane.QUESTION_MESSAGE,
//				null, margaritaVeidas, margaritaVeidas[0] );
//		 ArrayList<String> picalist = new ArrayList<String>();
//		 switch(MargaritasIzvele){
//		 
//		 case "30cm - 9.00€":
//			 picalist.add("30cm - 9.00€");
//			 break;
//			 
//		 case "40cm - 12.00€":
//			 break;
//			 
//		 case "50cm - 15.00":
//			 break;
//			 
//		 }
//		
//		
//	}
//	static void StudentuPica(){
//		String[] margaritaVeidas = {"30cm - 9.00€", "40cm - 12.00€", "50cm - 15.00"};
//		 String MargaritasIzvele;
//		 MargaritasIzvele = (String) JOptionPane.showInputDialog(null, "izvelies izmeru!", "Margaritas izvele", JOptionPane.QUESTION_MESSAGE,
//				null, margaritaVeidas, margaritaVeidas[0] );
//		 switch(MargaritasIzvele){
//		 
//		 case "30cm - 8.00€":
//			 break;
//			 
//		 case "40cm - 10.50€":
//			 break;
//			 
//		 case "50cm - 13.00":
//			 break;
//			 
//		 }
//	}
//			 
//	static void Mafia(){
//		String[] MafiaVeidas = {"30cm - 12.00€", "40cm - 15.00€", "50cm - 18€"};
//		
//		String MafiaIzvele = (String) JOptionPane.showInputDialog(null, "Izvelies Mafia picas izmeru",
//				"Mafia", JOptionPane.QUESTION_MESSAGE, null, MafiaVeidas, MafiaVeidas[0]);
//		switch(MafiaIzvele){
//		
//		case "30cm - 12.00€":
//			break;
//			
//		case "40cm - 15.00€":
//			break;
//			
//		case "50cm - 18€":
//		}
//	
//			
//	}
//	static void Hawaian(){
//		String[] HawaianVeidi = {"30 cm - 11.00€", "40cm - 13.00€", "50cm - 15€"};
//		//String HawaianIzvele = (String)JOptionPane.showMessageDialog(null, "Izvelies Hawaian picas izmeru", );
//	}
//	
	
	public static ArrayList<Pica> picaList = new ArrayList<Pica>();
	
	static void JaunaPica(){
		String[] picasIzvele = {"Pica Margarita", "Studentu pica", "Mafia", "Hawaian", "atpakal uz menu"};
				
		String izvele = (String) JOptionPane.showInputDialog(null, "Izvelies Picu!", "Izvçlies picu!",
						JOptionPane.QUESTION_MESSAGE, null, picasIzvele, picasIzvele[0]);
		
		String[] picasIzmers = {"20cm", "30cm", "50cm"};
		
		String izmers = (String) JOptionPane.showInputDialog(null, "Izvelies Picas izmçru!", "Izvçlies picu!",
						JOptionPane.QUESTION_MESSAGE, null, picasIzmers, picasIzvele[1]);
		int izm;
		switch(izmers){
			case "20cm": izm=20; break;
			case "50cm": izm=50; break;
			default: izm=30;
		}
			
		Pica jauna;
		switch(izvele){
			case "Pica Margarita":
			
				jauna = new Pica("Pica Margarita", 6.00, izm, true, true, false, false, false);
				picaList.add(jauna);
				System.out.println(jauna.Izdruka());
			break;
					
			case "Studentu":
				jauna = new Pica("Studentu pica", 8.00, izm, true, true, true, false, true);
				picaList.add(jauna);
			break;
					
				case "Mafia":
					
					break;
					
				case "Hawaian":
					
					break;	
					
		}
	}
	
	static void VisasPicas(){
		System.out.println(picaList.get(0).Izdruka());
	}
	
	public static void main(String[] args) {
		boolean q=true;
		String[] MainMenu = {"Igadadat picas", "jusu konts", "izveletas picas", "apturet programmu"};
		
		
		String MenuIzvele;
		do{
			MenuIzvele = (String) JOptionPane.showInputDialog(null, "Izvelejies darbibu", "Menu",
					JOptionPane.QUESTION_MESSAGE, null, MainMenu, MainMenu[0]);
				
		switch(MenuIzvele){
			case "Igadadat picas":
				JaunaPica();
			break;
			
			case "jusu konts":
			break;
		
			case"izveletas picas":
				VisasPicas();
			break;
		
			case "apturet programmu":
				q=false;
				break;
		}
		
		}while(q==true);
	


	}

}
