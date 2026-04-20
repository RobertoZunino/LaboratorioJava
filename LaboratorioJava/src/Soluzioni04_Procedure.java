
public class Soluzioni04_Procedure {

	public static void main(String[] args) {
		esercizio();
	}

	// In Java le procedure si dichiarano come "static void", così:
	static void uno() {
		System.out.println("Questa è la procedura uno() !");
	}
	
	static void due() {
		System.out.println("Questa è la procedura due() !");
	}

	static void tre() {
		System.out.println("Questa è la procedura tre() !");
	}
		
	// Esercizio.
	//
	// Verificate che qualunque procedura può fare chiamate a qualunque
	// procedura. Per esempio, definite sotto una procedura "esercizio" che
	// chiami le procedure uno/due/tre viste sopra. Dopo, modificate il main
	// per chiamare la vostra nuova procedura esercizio:
	//
	//		main -> esercizio -> uno/due/tre
	
	static void esercizio() {
		uno();
		due();
		tre();
	}
}
