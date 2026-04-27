
public class Soluzioni12_Funzioni {
	
	public static void main(String[] args) {
	}
	
	static int[] esercizioEnumerazioneInt(int n) {
		// Definite una funzione che genera un vettore con elementi
		// {0,1,2,3,...,n-1}.
		
		int[] v = new int[n];
		int i;
		
		for (i = 0 ; i < n ; i++) {
			v[i] = i;
		}
		
		return v;
	}
	
	static double[] esercizioEnumerazioneDouble(int n) {
		// Definite una funzione che genera un vettore con elementi
		// {0,1,2,3,...,n-1}.
		
		double[] v = new double[n];
		int i;
		
		for (i = 0 ; i < n ; i++) {
			v[i] = i;
		}
		
		return v;
	}
	
	static double esercizioMedia(double[] v) {
		// Dato un vettore, si calcoli il suo valore medio.
		
		double m = 0;
		int i;
		for (i = 0 ; i < v.length ; i++) {
			m = m + v[i];
		}
		m = m / v.length;
		
		return m;
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
		
		double m = esercizioMedia(v);
		// Creiamo il nuovo vettore.
		double[] w = new double[v.length];
		int i;
		for (i = 0 ; i < v.length ; i++) {
			w[i] = (v[i] - m) * (v[i] - m);
		}
		
		return esercizioMedia(w);
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
		
		double m = esercizioMedia(v);
		// Creiamo il nuovo vettore.
		double[] w = new double[v.length];
		int i;
		for (i = 0 ; i < v.length ; i++) {
			w[i] = v[i] * v[i];
		}
		double mq = esercizioMedia(w);
		
		return mq - m*m;
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
		
		int pos = -1;
		boolean trovato = false;
		int i;	
		for (i = 0 ; !trovato && i < v.length ; i++) {
			if (v[i] == x) {
				pos = i;
				trovato = true;
			}
		}
		
		return pos;
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
		
		// Consideriamo il sottovettore con posizioni [inizio, fine).
		// Si noti che v[fine] è *escluso*.
		int inizio = 0;
		int fine = v.length;
		int pos = -1;
		boolean finito = false;
		
		while (!finito) {
			if (fine <= inizio) {
				// Sottovettore vuoto.
				finito = true;
				pos = -1;
			} else if (fine == inizio + 1) {
				// Sottovettore con un solo elemento.
				finito = true;
				if (v[inizio] == x) {
					pos = inizio;
				}
			} else {
				// Almeno due elementi: calcoliamo la posizione di mezzo.
				int mezzo = (fine + inizio) / 2;
				//
				// Nota 1: Ora è garantito che inizio <= mezzo < fine
				//
				// Nota 2: alcuni preferiscono usare la formula
				//		mezzo = inizio + (fine - inizio) / 2
				// perché la somma fine+inizio potrebbe essere troppo grande
				// per stare in un int. Nella formula alternativa, il valore
				// fine-inizio non è mai troppo grande.
				
				if (v[mezzo] == x) {
					finito = true;
					pos = mezzo;
				} else if (v[mezzo] < x) {
					inizio = mezzo + 1;
					// Nota: questo aumenta inizio di almeno una posizione
				} else { // v[mezzo] > x
					fine = mezzo;
					// Nota: questo diminuisce fine di almeno una posizione
				}
			}
		}
		
		return pos;
	}
}
