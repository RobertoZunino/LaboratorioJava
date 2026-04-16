
public class Parte03_CondizionaleIf {

	public static void main(String[] args) {
		// Precedentemente abbiamo visto variabili ed espressioni intere.
		// Java consente anche l'uso di variabili ed espressioni booleane,
		// che possono avere solo due valori: true e false.
		
		boolean b = true;
		b = false;
		
		// Ci sono anche vari operatori aritmetico-logici che producono
		// un valore booleano a partire da due valori numerici:
		//
		// ==         uguale a
		// !=         diverso da
		// < , <=     minore   (o uguale)
		// > , >=     maggiore (o uguale)
		//
		// Nota bene: il confronto tra due valori si fa con == e non con =.
		// Infatti, "x = 5" vuol dire "modifica x assegnandogli 5" mentre
		// "x == 5" vuol dire "confronta x e 5, senza modificare nulla".

		int x = 1;
		b = (x < 5);  // true
		b = (x == 5); // false
		b = (x != 7); // true
		b = (x*x - 5*x + 7 > 10); // false
		
		// I valori booleani possono essere combinati con i connettivi
		// logici:
		//
		//  &&   AND, congiunzione
		//  ||   OR, disgiunzione
		//  !    NOT, negazione
		
		x = 7;
		b = (x > 0) && (x < 10); // true
		b = (x > 0) || (x <= 4); // true
		b = !b; // false
		
		System.out.println("b = " + b);
		
		// ****************************************************
		// Il comando condizionale if esegue un dato blocco di comandi se 
		// un'espressione booleana (detta "guardia") è vera, e un altro dato
		// blocco di comandi se invece la guardia è falsa.
		//
		// La sua sintassi è:
		//
		// if (<<espressione booleana "guardia">>) {
		//    <<comandi da eseguire se la guardia è vera>>
		// } else {
		//    <<comandi da eseguire se la guardia è falsa>>
		// }
		
		x = 10;
	
		if (x > 5) {
			System.out.println("x è maggiore di 5");
		} else {
			System.out.println("Questa print NON viene eseguita!");
		}
		
		if (x > 25) {
			System.out.println("Questa print NON viene eseguita!");
		} else {
			System.out.println("x NON è maggiore di 25");
		}

		// Si noti l'indentazione del codice sopra.
		//
		// In Java, è prassi consolidata indentare il codice, spostandolo
		// verso destra, di un numero di spazi proporzionale al numero di
		// parentesi graffe annidate. Il tasto TAB aiuta a mantenere
		// l'indentazione corretta.
		
		// Esercizio 1.
		// Controllate con un if se 10 < x < 50.
		// Per farlo, dovete usare un AND.

		// Se nel caso "else" non volete eseguire nessun comando, potete 
		// semplicemente ometterlo.
		x = 1;
		if ( x+x != 2 ) {
			// Non viene eseguito.
			System.out.println("Houston, abbiamo un problema!");
		}
		// Niente "else".

		
		// Esercizio 2.
		// Dati x,y,z controllate se sono ordinati in modo debolmente
		// crescente o no.
		x = 5;
		int y = 5;
		int z = 10;
		
		// TODO
		
		System.out.println("I numeri " + x + ", " + y + ", " + z + " sono / NON sono ordinati");
		
		// Esercizio 3.
		// Dati tre interi x, y, z calcolate il minimo tra loro.
		x = 30;
		y = 5;
		z = 7;
		int minimo = -10000;
		
		// TODO
		
		System.out.println("Il minimo tra " + x + ", " + y + ", " + z + " è " + minimo);
		
	}
}
