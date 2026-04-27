// Questi "import" attivano le librerie standard di Java e consentono
// l'uso degli Scanner e dei File che servono per effettuare l'input.
import java.util.Scanner;
import java.io.*;

public class Soluzioni13_Input {

	public static void main(String[] args) {
		// La tastiera va inizializzata prima di eseguire gli esercizi che
		// leggono da tastiera.
		introduzione();
	}
	
	// Una variabile globale per rappresentare l'input da tastiera.
	static Scanner tastiera;
	
	static void introduzione() {
		// Fino ad ora abbiamo scritto programmi che operavano su dati
		// contenuti all'interno del programma stesso. Ora vediamo come
		// ricevere dati dall'esterno.
		
		// Il modo più semplice per leggere dati da tastiera è quello di
		// usare un "oggetto Scanner". Visto che ha senso rendere la
		// tastiera visibile in tutte le procedure, questo è uno dei rari
		// casi dove è meglio usare una variabile globale. 
		// Va inizializzata così:
		tastiera = new Scanner(System.in);
	}
	
	static void stampaVettore(int[] v) {
		int i;
		for (i = 0 ; i < v.length ; i++) {
			System.out.print(v[i] + "   ");
		}
		System.out.println();  // Vai a capo
	}
	
	static int[] esercizioLeggiVettore() {
		// Chiedete all'utente un numero n.
		// Dopo, chiedete all'utente n interi, memorizzandoli tutti in un
		// vettore. Restituite il vettore come risultato.
		
		System.out.println("Quanti numeri vuoi inserire nel vettore?");
		int n = tastiera.nextInt();
		
		int[] v = new int[n];
		
		int i;
		for (i = 0 ; i < v.length ; i++) {
			System.out.println("Inserisci la componente v[" + i + "]");
			v[i] = tastiera.nextInt();
		}
		
		return v;
	}

	static int[] esercizioLeggiVettoreBis() {
		//
		// (Impegnativo)
		//
		// Chiedete all'utente di inserire una sequenza di interi non nulli,
		// seguita da uno zero.
		// Memorizzate tutta la sequenza (senza lo zero) in un vettore e
		// restituitelo come risultato.
		//
		// Importante: non allocate quantità "arbitrarie" di memoria, come
		// si farebbe con "new int[1000]", ma allocate la memoria passo
		// passo, non appena scoprite che vi serve davvero.
		//
		// Una strategia semplice è quella di allocare a ogni passo un
		// nuovo vettore di lunghezza uguale a quella vecchia più uno, e
		// trasferire lì i dati vecchi.
		// (Costo: O(N^2) operazioni)
		//
		// Un'altra strategia è quella di allocare vettori raddoppiandone
		// la lunghezza ogni volta che scopriamo non sono sufficienti.
		// Teniamo quindi un vettore "parzialmente" occupato dai dati: la
		// sua prima parte (>=50%) contiene i dati effettivamente letti fino
		// a questo momento, mentre la sua seconda parte è libera per i
		// dati ancora da leggere. Quando la seconda parte si esaurisce,
		// si crea un nuovo vettore (di lunghezza doppia) e si trasferiscono
		// i dati dal vettore vecchio.
		// (Costo: O(N * log_2 N) operazioni)
		//
		// Usate la strategia che preferite.
		//
		// Bonus: restituite il vettore senza dati "in eccesso" in coda.
		
		// Soluzione:
		//
		// Proviamo la strategia "col raddoppio".
		//
		int[] v = new int[1];
		int occupati = 0; // Quanti dati ci sono davvero dentro v
		
		System.out.println("Inserisci un vettore di interi non nulli (0 per terminare)");
		boolean terminato = false;
		
		while (! terminato) {
			System.out.println("Inserisci un intero v[" + occupati + "]");
			int n = tastiera.nextInt();
			if (n == 0) {
				terminato = true;
			} else {
				// Inseriamo n nel vettore
				// Prima, assicuriamoci ci sia posto libero nel vettore.
				if (occupati == v.length) {
					// Vettore pieno: bisogna travasare i dati in un vettore
					// più grande. Raddoppiamo la lunghezza.
					int[] w = new int[v.length * 2];
					int i;
					for (i = 0 ; i < v.length ; i++) {
						w[i] = v[i];
					}
					v = w;
					// Ora v ha spazio libero in fondo.
				}
				v[occupati] = n;
				occupati++;
			}
		}
		
		// Cancelliamo i dati in eccesso in coda al vettore, trasferendo i
		// dati in un vettore nuovo.
		int[] w = new int[occupati];
		int i;
		for (i = 0 ; i < w.length ; i++) {
			w[i] = v[i];
		}
		
		return w;
	}
	
	static int[] esercizioVettoreDaFile() {
		// Si assuma di avere un file contenente una sequenza di interi.
		// Il file contiene una singola riga, con i numeri separati da
		// spazi. Ad esempio:
		//		10 34 -56 7 0 356
		//
		// Si legga quindi dal file un vettore di interi corrispondente.
		//
		// Per fare ciò, si usino le seguenti funzioni:
		//
		//   s.split(" ");
		//   	Separa la stringa s in un vettore di stringhe.
		//
		//   n = Integer.parseInt(s);
		//		Converte una stringa in un intero, se la stringa contiene
		//      le cifre decimali di un intero. (Altrimenti causa un crash).
		
		try (Scanner file = new Scanner(new File("vettore.txt"))) {
			// File aperto in lettura.
			String riga = file.nextLine();
			
			String[] numeri = riga.split(" "); 
			
			int[] v = new int[numeri.length];
			int i;
			for (i = 0 ; i < v.length ; i++) {
				v[i] = Integer.parseInt(numeri[i]);
			}
			
			return v;			
		} catch (IOException e) {
			// C'è stato un errore, stampiamolo
			System.out.println("Errore di IO su file: " + e);
			
			return null; // Come risultato, diamo un vettore invalido.
		}
	}
}
