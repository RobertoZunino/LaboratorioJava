
public class Parte15_Record {

	public static void main(String[] args) {
		introduzione();
	}

	// Un "record" in Java è essenzialmente una ennupla di valori.
	//
	// I record possono essere usati per rappresentare i dati relativi a
	// molte cose. Per esempio i dati di una città potrebbero contenere
	// il suo nome, la sua popolazione, la sua altitudine, e le sue
	// coordinate geografiche. I dati di un'automobile potrebbero contenere
	// il numero di telaio, la targa, l'anno, e il proprietario.
	
	// Come esempio semplice, qui definiamo un record Persona, come coppia
	// contenente nome ed età.
	record Persona(String nome, int età) {}
	// Ora Persona è un nuovo tipo definito da noi. Possiamo definire
	// variabili di tipo Persona, vettori di tipo Persona e così via.
	
	static void introduzione() {
		// Una variabile di tipo Persona.
		Persona p;
		// Così come già visto per i vettori, questa variabile contiene un
		// *riferimento* a una ennupla-persona. Possiamo impostarla anche a
		// null (ma non è molto utile).
		p = null;
		// Per creare una ennupla nuova va usato "new", come per i vettori.
		p = new Persona("Luigi", 32);
		// Si può stampare tutta la ennupla semplicemente così:
		System.out.println(p);
		// Si può accedere alle componenti così:
		System.out.println(p.nome);
		System.out.println(p.età);
		// Le componenti sono immutabili, non si possono modificare
		// direttamente.
		//     p.nome = "Luigino"; // Errore!
		// Si possono però creare nuove ennuple.
		p = new Persona("Luigino", p.età);
		System.out.println(p);
		
		System.out.println("--------------");
		
		// Un vettore di persone
		Persona[] persone;
		persone = new Persona[5];
		persone[0] = new Persona("Mario", 25);
		persone[1] = new Persona("Giuseppe", 75);
		persone[2] = new Persona("Lucia", 23);
		persone[3] = new Persona("Silvia", 65);
		persone[4] = new Persona("Augusto", 45);
		
		// Lo stampiamo, usando la procedura sotto.
		stampaPersone(persone);
		
		// Calcoliamo il più giovane, usando la funzione sotto.		
		Persona giovane = piùGiovane(persone);
		System.out.println("Il più giovane: " + giovane);
	}
	
	// Questa è una funzione che trova la più giovane Persona dentro un
	// vettore (non vuoto) di Persona.
	static Persona piùGiovane(Persona[] persone) {
		Persona giovane;
		// Per ora la più giovane è la prima persona.
		giovane = persone[0];
		int i;
		for (i = 1 ; i < persone.length ; i++) {
			// Se troviamo una persona ancora più giovane...
			if (persone[i].età < giovane.età) {
				// ...impostiamo quella come la più giovane
				giovane = persone[i];
			}
		}
		return giovane;
	}
	
	// Una procedura per stampare un vettore di Persona.
	static void stampaPersone(Persona[] persone) {
		int i;
		for (i = 0 ; i < persone.length ; i++) {
			System.out.println(persone[i]);
		}
	}

	// ---------------------------------------------------------------------
	
	// Con i record, possiamo anche definire delle ennuple di "lunghezza 1".
	// Sotto, i tipi Metri e Secondi contengono solo un double al loro
	// interno.
	record Metri(double valore) {}
	record Secondi(double valore) {}
	// Il vantaggio nel fare ciò è quello di distinguere, a livello dei
	// tipi Java, i double che rappresentano lunghezze da quelli che
	// rappresentano tempi.
	// 
	// Java usa un sistema di tipi "nominale": 5.2 Metri sono distinti da
	// 5.2 Secondi, anche se le ennuple sono uguali.
	
	static void esempioUnitàDiMisura() {
		Metri m;
		m = new Metri(92.78);
		Secondi s;
		s = new Secondi(10.32);

		// Java ci impedisce di confondere per errore Metri e Secondi.
		// m = s; // Errore!
		
		// Possiamo anche definire due funzioni somma che non 
		// consentono di mischiare le unità di misura.
		m = somma(m,m); // Ok! Metri+Metri
		s = somma(s,s); // Ok! Secondi+Secondi
		// somma(m,s);  // Errore! 
		                // Non è stata definita la funzione Metri+Secondi!
	}	
	
	// In Java è possibile definire procedure e funzioni con lo stesso nome
	// (somma), ma che prendono parametri di tipi diversi. Al momento della
	// chiamata, Java guarda i tipi degli argomenti passati per capire quale
	// chiamare effettivamente. Se nessuna definizione va bene, allora
	// segnala un errore.
	//
	// Questo meccanismo è noto come "overloading".
	
	// La somma di Metri
	static Metri somma(Metri x, Metri y) {
		return new Metri(x.valore + y.valore);
	}

	// La somma di Secondi
	static Secondi somma(Secondi x, Secondi y) {
		return new Secondi(x.valore + y.valore);
	}
	
	static void esercizioVelocità() {
		// Aggiungete un record Velocità che rappresenta metri al secondo.
		// Create opportune operazioni per consentire somme, prodotti
		// e divisioni dove ha senso farlo (e non dove non avrebbe senso).
		// Fate qualche test per le vostre nuove funzioni.
	}
	
	// ---------------------------------------------------------------------
	
	// Quello sotto è un esempio *avanzato*, che illustra alcune
	// caratteristiche di Java recentemente aggiunte al linguaggio.
	
	// Nella parte di teoria di questo corso abbiamo visto la definizione
	// induttiva di un semplice linguaggio imperativo (IMP), sfruttando le
	// regole di inferenza.
	//
	// In Java è possibile definire, con opportuni tipi, la sintassi del
	// linguaggio IMP. Qui sotto, come esempio, proviamo a rappresentare la
	// sintassi delle espressioni (Exp) di IMP, limitandoci per semplicità
	// alle espressioni senza variabili. 
	//
	// Le seguenti dichiarazioni definiscono il tipo Java espressioni di
	// IMP, chiamato Exp. Le espressioni di questo tipo possono assumere
	// solo le forme elencate sotto: letterali, addizioni, sottrazioni e
	// moltiplicazioni.
	//
	sealed interface Exp {}
	record Lit(int i) implements Exp {}
	record Add(Exp e1, Exp e2) implements Exp {}
	record Sub(Exp e1, Exp e2) implements Exp {}
	record Mul(Exp e1, Exp e2) implements Exp {}

	static void esempioExp() {
		// Per creare un'espressione basta usare new ripetutamente.
		
		// Creiamo l'espressione "42", e stampiamola. 
		Exp e = new Lit(42);
		System.out.println("e = " + e);
		
		// Ora proviamo l'espressione "10 + 5". 
		e = new Add(new Lit(10), new Lit(5));
		System.out.println("e = " + e);
		
		// Ora proviamo l'espressione "5 * (7 + 4)". 
		e = new Mul(
				new Lit(5), 
				new Add(
						new Lit(7),
						new Lit(4)));
		System.out.println("e = " + e);
	}
	
	static int semExp(Exp e) {
		// Definiamo ora la semantica di Exp, cioè il risultato della
		// valutazione di un'espressione.
		
		// Il costrutto switch/case ci consente di esaminare tutte le forme
		// che può avere un'espressione. È simile a una sequenza di "if" a
		// cascata:
		//		se e è un Lit allora ...
		//      altrimenti, se è una Add allora ...
		//      altrimenti, se è una Sub allora ...
		//      altrimenti è una Mul e allora ...
		//
		// Al contrario dell'if, lo switch/case fornisce anche l'accesso
		// alle componenti delle varie forme. In altre parole, nel caso Lit
		// definisce una variabile i con la costante intera relativa, nel
		// caso Add definisce due variabili e1 ed e2 per le sottoespressioni
		// e così via per gli altri casi.
		switch (e) {
		case Lit(var i):
			return i;
		case Add(var e1, var e2):
			return semExp(e1) + semExp(e2);
		case Sub(var e1, var e2):
			return semExp(e1) - semExp(e2);
		case Mul(var e1, var e2):
			return semExp(e1) * semExp(e2);
		}
	}
	
	static void esempioSemanticaExp() {
		// Proviamo la semantica delle espressioni.
		// Valutiamo l'espressione 10 * (1 + 7).
		Exp e =	new Mul(
					new Lit(10),
					new Add(
							new Lit(1),
							new Lit(7)
					)
				);
		
		System.out.println("La semantica di " + e 
				+ " è il valore " + semExp(e));
	}
}
