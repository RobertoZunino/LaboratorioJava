
public class Soluzioni15_Record {
	
	public static void main(String[] args) {
	}
	
	record Metri(double valore) {}
	record Secondi(double valore) {}
	
	// La somma di Metri
	static Metri somma(Metri x, Metri y) {
		return new Metri(x.valore + y.valore);
	}
	
	// La somma di Secondi
	static Secondi somma(Secondi x, Secondi y) {
		return new Secondi(x.valore + y.valore);
	}
	
	record MetriAlSecondo(double valore) {}
	
	static MetriAlSecondo somma(MetriAlSecondo x, MetriAlSecondo y) {
		return new MetriAlSecondo(x.valore + y.valore);
	}
	
	static Metri prodotto(MetriAlSecondo x, Secondi y) {
		return new Metri(x.valore * y.valore);
	}
	
	static Metri prodotto(Secondi x, MetriAlSecondo y) {
		return new Metri(x.valore * y.valore);
	}
	
	static MetriAlSecondo divisione(Metri x, Secondi y) {
		return new MetriAlSecondo(x.valore / y.valore);
	}
	
	static void esercizioVelocità() {
		// Aggiungete un record Velocità che rappresenta metri al secondo.
		// Create opportune operazioni per consentire somme, prodotti
		// e divisioni dove ha senso farlo (e non dove non avrebbe senso).
		// Fate qualche test per le vostre nuove funzioni.
		
		MetriAlSecondo v1 = divisione(new Metri(4), new Secondi(10));
		MetriAlSecondo v2 = divisione(new Metri(6), new Secondi(5));
		MetriAlSecondo v3 = somma(v1, v2);
		Metri m = prodotto(v3, new Secondi(123));
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(m);
	}
}
