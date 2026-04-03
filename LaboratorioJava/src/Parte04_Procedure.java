
public class Parte04_Procedure {

	public static void main(String[] args) {
		// Il codice di un programma non deve essere scritto per forza
		// dentro il main().
		//
		// È possibile suddividerlo in varie parti, chiamate *procedure* (ma
		// anche a volte *funzioni* o *metodi*). Le procedure si possono
		// definire a fianco al main(), e poi richiamare dentro il main per
		// eseguirle.
		
		uno(); // Chiama la procedura uno(), eseguendola.
		due(); // Analoga
		tre(); // Analoga
		uno(); // Chiama la uno() una seconda volta, rieseguendola.
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
	
	// Per ora omettiamo alcuni aspetti avanzati delle procedure e funzioni
	// come il passaggio dei parametri e il valore di ritorno.
	// Ci torneremo in futuro.
}
