
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
	
	static int[] esercizioEnumerazioneInt(int n) {
		// Definite una funzione che genera un vettore con elementi
		// {0,1,2,3,...,n-1}.
		
		int[] v = new int[3];  // Bozza, da correggere
		
		// TODO
		
		return v;
	}
	
	static double[] esercizioEnumerazioneDouble(int n) {
		// Definite una funzione che genera un vettore con elementi
		// {0,1,2,3,...,n-1}.
		
		double[] v = new double[3];  // Bozza, da correggere
		
		// TODO
		
		return v;
	}
	
	static double esercizioMedia(double[] v) {
		// Dato un vettore, si calcoli il suo valore medio.
		
		// TODO
		
		return 0; // Bozza da correggere
	}

	static double esercizioVarianza1(double[] v) {
		// Dato un vettore, si calcoli la sua varianza.
		//
		// Un modo per calcolare la varianza è descritto sotto.
		//
		// Come prima cosa si calcola la media m del vettore.
		// Poi si considera il nuovo vettore definito come
		// ( (v[0]-m)^2, (v[1]-m)^2, (v[2]-m)^2, ... )
		// La varianza è quindi la media di questo nuovo vettore. 
		
		// TODO
		
		return 0; // Bozza da correggere
	}

	static double esercizioVarianza2(double[] v) {
		// Dato un vettore, si calcoli la sua varianza, ma in un modo 
		// diverso da quello descritto sopra.
		//
		// Un modo alternativo per calcolare la varianza è descritto sotto.
		//
		// Come prima cosa si calcola la media m del vettore.
		// Poi si considera il nuovo vettore definito come
		// ( v[0]^2, v[1]^2, v[2]^2, ... )
		// Sia quindi mq la media di questo nuovo vettore.
		// La varianza è quindi data da (mq - m^2).
		//
		// Verificate che entrambi i metodi danno valori uguali (a meno di
		// errori di arrotondamento dovuti ai calcoli in virgola mobile).
		
		// TODO
		
		return 0; // Bozza da correggere
	}
	
	static int esercizioRicercaLineare(int[] v, int x) {
		// Definite una funzione che, dato un vettore di interi v e un
		// intero x, cerca la posizione di x dentro v, e la restituisce
		// come risultato. Se x non è presente, ponete il risultato a -1.
		// (Se x è presente in più posizioni, basta che il risultato sia
		// una delle posizioni di x. Non ci importa quale.)
		//
		// Per fare la ricerca, scandite semplicemente tutte le posizioni
		// del vettore: v[0], v[1], v[2], ...
		//
		// In media, questo richiederà O(v.length) operazioni.
		
		// TODO
		
		return 0; // Bozza, da correggere
	}

	static int esercizioRicercaBinaria(int[] v, int x) {
		// (Impegnativo)
		// Ripetete l'esercizio sopra, ma questa volta assumendo che il
		// vettore v sia ordinato in modo debolmente crescente.
		//
		// Sotto questa ipotesi la ricerca si può rendere più veloce,
		// portandola da O(v.length) a O(log(v.length)) operazioni.
		//
		// Procedete così: calcolate la posizione "di mezzo" m del vettore.
		// Dopo, confrontate v[m] con x. Se sono uguali, abbiamo finito.
		// Se v[m] > x, allora la ricerca prosegue sul "sottovettore"
		// (v[0] ... v[m-1]). Se v[m] < x, allora la ricerca prosegue sul
		// "sottovettore" (v[m+1] ... v[v.length-1]).
		// Fatto ciò, trovare la posizione di mezzo del sottovettore e
		// iterate il procedimento, dimezzando quindi la lunghezza del
		// sottovettore osservato a ogni iterazione.
		// Prima o poi, o troviamo x, o ci riduciamo a un sottovettore di
		// lunghezza <= 1, che possiamo ispezionare banalmente.
		
		// TODO
		
		return 0; // Bozza, da correggere
	}
}
