import javax.swing.JOptionPane;

public class Kalinins_pica {

	static void Margarita(){
		String[] margaritaVeidas = {"30cm - 9.00€", "40cm - 12.00€", "50cm - 15.00"};
		 String MargaritasIzvele;
		 MargaritasIzvele = (String) JOptionPane.showInputDialog(null, "izvelies izmeru!", "Margaritas izvele", JOptionPane.QUESTION_MESSAGE,
				null, margaritaVeidas, margaritaVeidas[0] );
		 switch(MargaritasIzvele){
		 
		 case "30cm - 9.00€":
			 break;
			 
		 case "40cm - 12.00€":
			 break;
			 
		 case "50cm - 15.00":
			 break;
			 
		 }
		
		
	}
	
	
	
	public static void main(String[] args) {
		String[] picasIzvele = {"Margarita", "Studentu", "Mafia", "Hawaian", "Apturet programmu"};
		
		String izvele = (String) JOptionPane.showInputDialog(null, "Izvelies Picu!", "Picas Izvele",
				JOptionPane.QUESTION_MESSAGE, null, picasIzvele, picasIzvele[0]);
		
		switch(izvele){
		case "Margarita": 
			Margarita();
			break;
			
		case "Studentu":
			break;
			
		case "Mafia":
			break;
			
		case "Apturet programmu":
			JOptionPane.showMessageDialog(null, "Gaidisim jus atpakal", "Uzredzesanos",JOptionPane.INFORMATION_MESSAGE);
			break;
			
			
			
		}while(!izvele.equals("Apturet programmu"));
	


	}

}
