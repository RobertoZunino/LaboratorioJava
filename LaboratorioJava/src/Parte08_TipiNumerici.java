
public class Parte08_TipiNumerici {

	public static void main(String[] args) {
		// Fino ad ora abbiamo visto i tipi int e boolean.
		//
		// Vediamo sotto alcuni altri tipi numerici fondamentali.
		
		tipiInteri();
		// tipiVirgolaMobile();
	}
	
	static void tipiInteri() {
		// Una variabile int può contenere un valore da circa
		// "meno due miliardi" a "due miliardi".
		// Nel fare i conti, è importante rimanere dentro questi limiti,
		// o verranno prodotti risultati errati;
		//
		// I letterali (le costanti) numerici sono di default espressioni 
		// di tipo int.  
		int x = 1234567890;
		System.out.println("Variabile int x = " + x);
		
		x = x*x; // Troppo grande! Dà un risultato errato!
		System.out.println("Il suo quadrato (errato): " + x);
		
		// Se abbiamo bisogno di numeri più grandi, possiamo usare i long.
		// I valori long vanno da un minimo di
		// "meno nove miliardi di miliardi" a "nove miliardi di miliardi".
		//
		// I letterali long hanno una "L" in fondo.
		long y = 1234567890123456789L;
		System.out.println("Variabile long y = " + y);
		
		// Se si "mischiano" int e long in una espressione, come in "x+y",
		// il tipo int viene *promosso* a long, e l'espressione denota
		// un valore di tipo long.
		long somma = x + y;
		System.out.println("x + y = " + somma);
		
		// La promozione ha effetto anche durante l'assegnamento: possiamo
		// assegnare un valore int a una variabile long.
		y = 7;
		y = x;
		
		// È invece vietato mettere un long dentro un int.
		// x = y; // Errore! "Cannot convert long to int"
		
		// Se siamo *sicuri* che l'espressione long ha un risultato 
		// abbastanza piccolo da stare in un int, possiamo forzare
		// l'assegnamento con un cast:
		y = 1234L ;  // È un long, ma sta anche in un int
		x = (int) y; // Forza la conversione
	}
	
	static void tipiVirgolaMobile() {		
		// Le variabili in virgola mobile contengono numeri
		// "con la virgola", andando oltre i numeri interi.
		//
		// **IMPORTANTE**:
		// Si noti che solo un numero limitato di cifre vengono
		// effettivamente memorizzate in un numero in virgola mobile.
		// Pertanto, è buona norma ritenere questi valori come *stime*,
		// come valori *approssimati* e non come valori perfettamente
		// esatti. Questo li rende profondamente distinti da int e long.
		//
		// Il tipo float contiene numeri con una decina di cifre decimali.
		// I suoi letterali finiscono con la lettera "F".		
		float x = 123.456F;
		System.out.println("Float x = " + x);
		
		// Il tipo double contiene numeri col doppio delle cifre decimali
		// rispetto a un float. Si chiama double appunto per questo motivo.
		// I letterali hanno il punto decimale.
		double y = 123.0;
		System.out.println("Double y = " + y);
		
		// Nota: 123 è un letterale int, 123.0 è un double.
		
		// Tra espressioni di tipo in virgola mobile, l'operatore /
		// effettua ovviamente la divisione e non il quoziente come tra
		// interi.
		x = x / 3.73f;
		
		// Rimarchiamo ancora che le variabili in virgola mobile non
		// rappresentano perfettamente i numeri reali, come mostra il
		// seguente esempio:
		y = 1.0;		
		y = y / 49.0;
		System.out.println("y = " + y); // y = 0.02040816326530612
		y = y * 49.0;
		System.out.println("y = " + y); // y = 0.9999999999999999
		// Il risultato non è 1.0 perché le operazioni come 1.0/49.0
		// non sono esatte, ma calcolano solo una parte delle cifre.
		
		// Di conseguenza, è meglio non controllare mai i numeri in virgola
		// mobile con confronti "esatti" come y == 1 oppure y != 1.
		// Visto che ci può sempre essere un qualche errore di
		// arrotondamento, questi controlli possono dare un risultato
		// inaspettato!
		if (y == 1.0) {
			System.out.println("Questo non viene stampato!");
		}
		// Piuttosto, controllate che la differenza tra y e 1 sia piccola
		// in valore assoluto.
		if (Math.abs(y - 1.0) < 0.00001) {
			System.out.println("Questo invece viene stampato!");
		}
		
		// I float sono promossi a double.		
		y = x;
		
		// Anche gli int e long sono promossi a float e double.
		x = 123;  // Da int a float
		x = 123L; // Da long a float
		y = 123;  // Da int a double
		y = 123L; // Da long a double
		
		// Nota: durante la conversione si potrebbero perdere le cifre
		// meno significative.
		
		// Fate attenzione alla seguente trappola!
		int i = 1;
		y = i/2;   // Questo calcola il quoziente 1/2=0 e *poi* lo promuove!
		System.out.println("y = " + y);    // Stampa 0.0
		
		// Per evitare il problema, possiamo usare un cast e forzare la
		// promozione di i (e quindi di 2) a double *prima* della divisione.
		y = ((double) i) / 2;
		System.out.println("y = " + y);    // Stampa 0.5

		// Alternativamente, usando una costante double 2.0 invece di quella
		// intera 2, si forza comunque la promozione di i.
		y = i / 2.0;
		System.out.println("y = " + y);    // Stampa 0.5
	}
	
	static void numeriCasuali() {
		// La funzione Math.random() genera un double casuale tra 0 e 1,
		// in modo "uniforme".
		int i;
		for (i = 0 ; i < 10 ; i++) {
			double y = Math.random();
			System.out.println("Numero casuale: " + y);
		}
	}
	
	static void esercizioQuadrato() {
		// Dato n>=0, generate n punti casuali (a,b) dentro un quadrato di
		// lato unitario.
		// Contate quanti di questi hanno entrambe le coordinate <= 0.5,
		// cioè cadono nel quarto del quadrato che tocca l'origine.
		// Intuitivamente, in media, quanti punti siffatti dovremmo contare?
		// Stampate il numero di punti siffatti rapportati al numero totale
		// per diversi valori di n, e osservate a quanto converge il
		// rapporto.
		//
		// Questo metodo per stimare l'area di un insieme generando punti
		// casuali viene chiamato metodo Monte Carlo.
		
		int n = 1000*1000;
		double area = 42; // Bozza, da correggere

		// TODO
		
		System.out.println("Stima dell'area (con " + n + "punti): " + area);
	}
	
	static void esercizioCerchio() {
		// Ripetete l'esercizio di prima contando invece i punti che distano
		// dal centro del quadrato al più 0.5 unità.
		// Intuitivamente, in media, quanti punti siffatti dovremmo contare?
		//
		// Se vi serve, potete usare Math.sqrt() per calcolare la radice
		// quadrata, ma è possibile fare a meno di usare tale funzione.
	
		int n = 1000*1000;
		double area = 42; // Bozza, da correggere

		// TODO
		
		System.out.println("Stima dell'area (con " + n + "punti): " + area);
	}
	
	static void esercizioIntegrale() {
		// Provate ad usare lo stesso metodo per stimare l'integrale della 
		// funzione seno (Math.sin) tra 0 e pi greco (Math.PI).
		//
		// Sfruttate il fatto che il grafico del seno è incluso nel
		// rettangolo di base [0, pi greco] e altezza [0,1]. 
		// Generate n punti nel rettangolo e contate quanti cadono sotto
		// la curva.		
		
		int n = 1000*1000;
		double area = 42; // Bozza, da correggere

		// TODO
		
		System.out.println("Stima dell'area (con " + n + "punti): " + area);
	}
}
