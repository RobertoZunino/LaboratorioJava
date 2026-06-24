
public class Parte02_VariabiliIntere {

	public static void main(String[] args) {
		// I comandi possono anche modificare lo stato interno della memoria
		// del computer tramite le variabili.
		
		// La dichiarazione sotto crea una variabile chiamata x, di tipo
		// int, ovvero in grado di contenere valori interi.
		int x;
		
		// Il comando di assegnamento ha come effetto di modificare il
		// valore di una variabile.		
		x = 1234;  // Assegno un valore alla variabile
		
		// Dopo avere eseguito l'assegnamento, la variabile x assume il
		// valore 1234. Possiamo verificarlo stampandone il valore.
		System.out.println("Valore di x = " + x);  // Stampa 1234
		
		// Nota: sopra abbiamo "sommato" il messaggio "Valore di x" con il
		// valore della variabile x. In Java, tale somma trasforma il valore
		// intero 1234 nella sua sequenza di cifre decimali e le concatena
		// al messaggio precedente, formando così il messaggio
		//    "Valore di x = 1234"
		
		// Il comando di assegnamento può quindi essere riusato su x per
		// modificarne nuovamente il valore, dimenticandone il valore
		// precedente.
		x = 10; // Assegno un altro valore, sovrascrivendo il valore vecchio
		
		// Possiamo di nuovo verificarlo:		
		System.out.println("Valore di x = " + x); // Ora stampa 10
		
		// Alle variabili è possibile assegnare non solo valori costanti, ma
		// valori che sono il risultato della valutazione di espressioni.
		// Inoltre, le espressioni possono fare riferimento ai valori
		// correnti delle variabili.
		x = 10;
		x = x + 100;
		// All'inizio x è impostato a 10. Poi viene calcolato x+100, con
		// risultato 110, e questo nuovo valore viene assegnato a x.
		
		// Esercizio 1.
		// Verificate che ora x vale davvero 110, stampandola.
		
		// Si possono dichiarare quante variabili si desidera.
		int y;
		int z;
		y = 10;
		z = 20;
		System.out.println("y = " + y + ", z = " + z);
		
		// Nella dichiarazione è anche possibile definire un valore iniziale
		// della variabile.
		int a = 10;
		int b = 20;
		System.out.println("a = " + a + ", b = " + b);
		
		// Esercizio 2.
		// Provate anche gli altri operatori aritmetici: + - * /
		// Eseguite degli assegnamenti usando delle espressioni a vostra
		// scelta.
		
		// Esercizio 3.
		// Il comando
		x++;
		// è equivalente a x=x+1, ovvero incrementa di uno x. 
		// Verificatelo.
		
		// Esercizio 4.
		// Provate a stampare il valore del polinomio
		//   10 x^2 - 5 x + 7
		// per x = 1, 7, 9
		// Nota: in Java non c'è l'operatore potenza x^2, ma potete usare
		// l'espressione x*x per il quadrato di x.
		
		// Esercizio 5.
		// Provate a dividere per zero e vedere cosa succede.		
	}
}
