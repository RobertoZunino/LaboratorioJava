
public class Parte05_CicloWhile {

	public static void main(String[] args) {
		sintassiWhile();
		// potenzeDiDue();
	}
	
	static void sintassiWhile() {
		// Vediamo ora il comando while.
		// Il comando while è un "ciclo", che esegue un blocco di comandi
		// ripetutamente, fintanto che un espressione booleana guardia 
		// rimane vera.
		//
		// La sua sintassi è
		//     while (guardia) {
		//         <<comandi da eseguire finché la guardia è vera>>
		//     }
		//
		int i = 0;
		System.out.println("Inizio ciclo while!");
		while (i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("Fine ciclo while!");
		
		// Il ciclo sopra stampa i numeri da 0 (incluso) a 10 (incluso).
	}
		
	static void esercizioGuardiaFalsa() {
		// Verificate che, se la guardia è falsa fin dall'inizio
		// il while non esegue nemmeno un'iterazione.
	}

	static void esercizioAltreGuardie() {
		// Nel ciclo di sotto, cosa succede se come guardia usiamo (i < 10)?
		//
		// E se usiamo (i != 10)?
		
		int i = 0;
		System.out.println("Inizio ciclo while!");
		while (i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("Fine ciclo while!");
	}

	static void esercizioQuadrati() {
		// Modificate il ciclo while di sopra per stampare i primi 10
		// quadrati invece che i primi 10 naturali.
	}
	
	static void esercizioNonTerminazione() {
		// Osservate che il while sottostante non termina mai.
		// La guardia è sempre vera, quindi non si esce mai dal ciclo.
		//
		// In Eclipse, potete premere nel tab Console il pulsante rosso 
		// quadrato "Terminate" per interrompere il programma.
		
		int i = 0;
		System.out.println("Inizio ciclo while!");
		while (i != i + 1) {  // guardia sempre vera!
			i++;
		}
		System.out.println("Fine ciclo while!");
	}
		
	static void potenzeDiDue() {
		// Usiamo un ciclo while per stampare le prime potenze di 2.
		// Calcoliamo le potenze continuando a moltiplicare x per 2 ad ogni
		// iterazione.
		int x = 1;
		int i = 0;

		while (i < 20) {
			System.out.println("2 elevato alla " + i + "-esima potenza è " + x);
			i++;
			x = x*2;
		}
		
		// Nota tecnica:
		// se aumentate la soglia a 31, noterete una potenza 
		// di 2 ... negativa! Il problema qui è che il tipo int di Java
		// rappresenta solo valori da -2^31 a +2^31-1. Il numero
		// 2^31 è quindi troppo grande per un int.		
	}
	
	static void esercizioPolinomio() {
		// Dati a, b con a<b, stampare tutti i valori del polinomio
		// 	   10 x^2 - 5 x + 7
		// per a<=x<=b.
		int a = 0;
		int b = 10;
		
		System.out.println("Valori di p(x) con " + a + " <= x <= " + b);
		
		// int x;
		// int y;
	}		

	static void esercizioPolinomioSoglia() {
		// Nell'esercizio precedente aggiungete un if in modo da
		// stampare solo i valori del polinomio sopra una data soglia.
		
		// int soglia = 5;
	}
}
