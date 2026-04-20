// Questi "import" attivano le librerie standard di Java e consentono
// l'uso degli Scanner e dei File che servono per effettuare l'input.
import java.util.Scanner;
import java.io.*;

public class Parte13_Input {

	public static void main(String[] args) {
		introduzione();
		esempioLetturaDaTastiera();
		// esempioLetturaDaFile();
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
		
	static void esempioLetturaDaTastiera() {	
		// Ora lo scanner "tastiera" ci consente di chiedere dati
		// all'utente. Possiamo chiedere un intero come segue:
		System.out.println("Inserisci un numero intero x:");
		int x = tastiera.nextInt();
		
		System.out.println("Inserisci un numero intero y:");
		int y = tastiera.nextInt();
		
		if (x == y) {
			System.out.println("Hai inserito due volte " + x);
		} else if (x < y) {
			System.out.println("Il numero x=" + x + " è minore di y=" + y);
		} else {
			System.out.println("Il numero x=" + x + " è maggiore di y=" + y);
		}
		
		// Ci sono funzioni simili per gli altri tipi di dato:
		//
		// tastiera.nextLong();		// Legge un long
		// tastiera.nextFloat();	// Legge un float
		// tastiera.nextDouble();	// Legge un double
		// tastiera.nextLine();		// Legge una stringa (tutta la riga)
	}

	static int[] esercizioLeggiVettore() {
		// Chiedete all'utente un numero n.
		// Dopo, chiedete all'utente n interi, memorizzandoli tutti in un
		// vettore. Restituite il vettore come risultato.

		int[] v = null; // Bozza da correggere
		
		// TODO
		
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
		
		int[] v = null; // Bozza da correggere
		
		// TODO
		
		return v;
	}
	
	static void esempioLetturaDaFile() {
		// La lettura da file di testo è molto simile a quella da tastiera.
		// 
		// Si crea uno scanner collegato ad un file e si legge da lì.
		// Visto che il file è letto solo in questa procedura, lo scanner
		// può essere una variabile locale "file".
		
		// Visto che leggere da file può causare errori (file inesistente,
		// permessi insufficienti, ...) Java ci obbliga a gestirli.
		// Il modo consigliato è quello di usare un comando speciale
		// "try-with-resources" come segue.
		//
		// Come esempio, sotto leggiamo uno dei nostri file java.
		// (Per leggere un altro file di testo basta ovviamente cambiare il
		// nome.)
		try (Scanner file = new Scanner(new File("src/Parte01_Introduzione.java"))) {
			// Il file è stato aperto con successo.
			
			int numeroRighe = 0; // Contiamo le righe lette.
			
			// Con i file, oltre alle funzioni nextInt(), nextLong(), ...
			// dobbiamo anche usare le funzioni booleane hasNextInt(), ...
			// per controllare se c'è effettivamente o no ancora un dato da
			// leggere. Se non lo facciamo, le funzioni nextInt(), ...
			// possono dare errori quando il file è finito.
			
			// Fintanto che ci sono righe da leggere...
			while (file.hasNextLine()) { 
				// ... leggi la prossima riga.
				String riga = file.nextLine();
				numeroRighe++;
				
				// Stampiamo le prime 10 righe.
				if (numeroRighe <= 10) {
					System.out.println("Riga " + numeroRighe + ": " + riga);
				}
			}
			
			// Fine lettura
			System.out.println("Il file contiene " + numeroRighe + " righe.");
		} catch (IOException e) {
			// C'è stato un errore, stampiamolo
			System.out.println("Errore di IO su file: " + e);
		}
	}
	
	static int[] esercizioVettoreDaFile() {
		// Si assuma di avere un file di nome "vettore.txt" contenente una
		// sequenza di interi. Il file contiene una singola riga, con i
		// numeri separati da spazi. Ad esempio:
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
		
		int[] v = new int[] {};
		
		return v;
	}
}
