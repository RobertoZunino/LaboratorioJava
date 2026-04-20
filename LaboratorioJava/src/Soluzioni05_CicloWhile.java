
public class Soluzioni05_CicloWhile {

	public static void main(String[] args) {
	}
		
	static void esercizioGuardiaFalsa() {
		// Verificate che, se la guardia è falsa fin dall'inizio
		// il while non esegue nemmeno un'iterazione.
		int x = 5;

		System.out.println("Inizio ciclo while!");
		while (x > 10) {
			System.out.println("Questo non viene stampato!");
		}
		System.out.println("Fine ciclo while!");
	}

	static void esercizioAltreGuardie() {
		// Nel ciclo di sotto, cosa succede se come guardia usiamo (i < 10)?
		//
		// E se usiamo (i != 10)?
		
		int i = 0;
		System.out.println("Inizio ciclo while!");
		 // Stampa fino a 10 *escluso*. Lo stesso vale per i != 10.
		while (i < 10) { 
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("Fine ciclo while!");
	}

	static void esercizioQuadrati() {
		// Modificate il ciclo while di sopra per stampare i primi 10
		// quadrati invece che i primi 10 naturali.
		int i = 0;
		System.out.println("Inizio ciclo while!");
		while (i < 10) { 
			System.out.println("i = " + (i*i));
			i++;
		}
		System.out.println("Fine ciclo while!");
	}
	
	static void esercizioNonTerminazione() {
		// Osservate che il while sottostante non termina mai.
		// La guardia è sempre vera, quindi non si esce mai dal ciclo.
		//
		// In Eclipse, potete premere nel tab Console il pulsante rosso 
		// quadrato "Terminate" per interrompere il programma.
		
		// (Qui non c'è codice da scrivere, è solo un test da svolgere.)
		
		int i = 0;
		System.out.println("Inizio ciclo while!");
		while (i != i + 1) {  // guardia sempre vera!
			i++;
		}
		System.out.println("Fine ciclo while!");
	}	
	
	static void esercizioPolinomio() {
		// Dati a, b con a<b, stampare tutti i valori del polinomio
		// 	   10 x^2 - 5 x + 7
		// per a<=x<=b.
		int a = -10;
		int b = 10;
		
		System.out.println("Valori di p(x) con " + a + " <= x <= " + b);
		
		int x = a;
		int y;
		while (x <= b) {
			y = 10*x*x - 5*x + 7;
			System.out.println("p(" + x + ") = " + y);
			x++;
		}
	}		
	
	static void esercizioPolinomioSoglia() {
		// Nell'esercizio precedente aggiungete un if in modo da
		// stampare solo i valori del polinomio sopra una data soglia.
		
		int soglia = 100;
		int a = -10;
		int b = 10;
		
		System.out.println("Valori di p(x) con " + a + " <= x <= " + b);
		
		int x = a;
		int y;
		while (x <= b) {
			y = 10*x*x - 5*x + 7;
			if (y > soglia) {
				System.out.println("p(" + x + ") = " + y);
			}
			x++;
		}
	}
}
