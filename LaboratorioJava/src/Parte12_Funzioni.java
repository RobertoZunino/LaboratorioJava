
public class Parte12_Funzioni {

	public static void main(String[] args) {
		introduzione();
	}

	static void introduzione() {
		// Fino ad ora abbiamo visto le procedure: blocchi di codice che si
		// possono chiamare da altre parti.
		esempioProcedura();
		
		// Le procedure possono anche prendere uno o più parametri di vari
		// tipi. Questi valori vengono passati alla procedura tramite
		// apposite variabili specificate nella dichiarazione della
		// procedura.
		esempioParametri(42, "una stringa", true);
		
		// Le funzioni sono molto simili alle procedure. Anche queste sono
		// blocchi di codice che vengono chiamati altrove. Inoltre, come le
		// procedure, le funzioni possono prendere parametri.
		// A differenza delle procedure, le funzioni hanno un valore di
		// ritorno, e possono essere chiamate come espressioni.
		
		int risultato = esempioFunzione("poffarbacco!", 45) + 900;
		System.out.println("La funzione ha restituito " + risultato);
		
		// Infine, si noti che le funzioni possono anche restituire valori
		// diversi se chiamate ripetutamente con gli stessi parametri.
		// Abbiamo già visto Math.random() che dà sempre valori diversi
		int i;
		for (i = 0 ; i < 5 ; i++) {
			int n = esempioIncremento(123);
			System.out.println("esempioIncremento(123) è uguale a " + n);
		}
	}
	
	static void esempioProcedura() {
		System.out.println("Qui scrive esempioProcedura() !");
	}
	
	// Tre parametri: indichiamo i loro tipi e i loro nomi.
	static void esempioParametri(int a, String s, boolean b) {
		System.out.println("Qui scrive esempioParametri() !");
		System.out.println("I miei parametri sono"
				+ ": a = " + a
				+ ", s = " + s
				+ ", b = " + b);
	}
	
	// Le funzioni si dichiarano come
	//		static <<tipo risultato>> nomeFunzione(<<parametri>>)
	// Nelle procedure, il tipo risultato è "void", ma qui possiamo
	// usare qualunque tipo.
	static int esempioFunzione(String s, int a) {
		System.out.println("Qui scrive esempioFunzione() !");
		System.out.println("I miei parametri sono"
				+ ": s = " + s
				+ ", a = " + a);
		// Qui possiamo eseguire tutti i comandi che vogliamo.
		int r = s.length();
		r = r + 1000*a;
		// Il comando return definisce il risultato della funzione.
		// Nelle funzioni è obbligatorio usarlo prima della fine.
		return r;
		
		// r = 4; // Errore: sotto il return non si può più eseguire nulla. 
	}
	
	// Una funzione con tipo risultato stringa. 
	static String raddoppiaParola(String s) {
		return s+s;
	}
	
	// È possibile dichiarare variabili "globali", fuori da procedure e
	// funzioni. Queste variabili sono dichiarate come "static", esistono
	// per tutta la durata del programma, e sono visibili in tutte le 
	// procedure/funzioni.
	//
	// In genere è meglio evitare le variabili globali dove possibile.
	static int baseIncremento = 0;
	
	// Questa funzione dà valori diversi se richiamata più volte di seguito.
	static int esempioIncremento(int i) {
		baseIncremento++;
		return i + baseIncremento;
	}
}
