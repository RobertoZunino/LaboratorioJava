
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
	
	// Si noti come le variabili siano visibili solo all'interno della
	// funzione dove vengono dichiarate:
	static void dichiaraVariabileX() {
		int x = 123;
		System.out.println("x = " + x);
	}
	
	static void dichiaraVariabileY() {
		int y = 123;
		System.out.println("y = " + y);
		// System.out.println("x = " + x); // Errore! x non visibile qui!
	}
	
	// Più precisamente, la visibilità (o lo "scope") di una variabile
	// parte dalla sua dichiarazione e termina alla fine del blocco
	// dove è stata dichiarata, cioè alla "chiusa graffa".
	static void visibilità() {
		int a = 123;
		
		// Qui solo a è visibile ("in scope").
		
		if (a > 100) {
			int b = a * 12;
			// Qui a e b sono visibili.
			System.out.println("a = " + a);
			System.out.println("b = " + b);			
		}

		// Qui solo a è visibile.		
		System.out.println("a = " + a);
		
		// È pure possibile aprire graffe senza if, solo per delimitare
		// la visibilità di una variabile:
		{
			int c = a + 10000;
			// Qui a e c sono visibili.
			System.out.println("a = " + a);
			System.out.println("c = " + c);			
		}

		// Qui solo a è visibile.		
		System.out.println("a = " + a);
	}
	
	static void scambioVariabili() {
		// Per scambiare i valori di due variabili, non possiamo scrivere
		// 		x = y;
		//		y = x;
		// perché dopo "x = y" il valore originale di x viene sovrascritto.
		
		// Possiamo però usare una variabile "di appoggio":
		int a = 5;
		int b = 10;
		int tmp; // "appoggio"
		
		tmp = a;	// Copiamo il valore originale di a
		a = b;		// Sovrascriviamo a col valore di b
		b = tmp;	// Mettiamo in b il valore originale di a

		System.out.println("a = " + a); // 10
		System.out.println("b = " + b); // 5
	}
	
	// Esercizio.
	//
	// Verificate che qualunque procedura può fare chiamate a qualunque
	// procedura. Per esempio, definite sotto una procedura "esercizio" che
	// chiami le procedure uno/due/tre viste sopra. Dopo, modificate il main
	// per chiamare la vostra nuova procedura esercizio:
	//
	//		main -> esercizio -> uno/due/tre
	
	// TODO
}