
public class Parte01_Introduzione {

	public static void main(String[] args) {
		// Java è un linguaggio di programmazione imperativo.
		//
		// Un programma Java è formato da *comandi* che, quando eseguiti,
		// causano determinati *effetti* come ad esempio:
		// - stampare messaggi all'utente;
		// - modificare il contenuto della memoria interna del computer;
		// - leggere o scrivere su file;
		// - inviare o ricevere dati dalla rete;
		// - ... e molto altro.
		
		// Qui sotto, usiamo due comandi "println" per stampare due messaggi
		// all'utente. 
		System.out.println("Ciao!");
        System.out.println("Ecco un altro messaggio!");
        
        // Per eseguire il programma, in Eclipse basta:
        // o usare la voce del menu
        // 		Run -> Run (Ctrl-F11)
        // o premere, appunto, Ctrl-F11
        // o cliccare sul tasto Run della toolbar (assomiglia a un tasto
		//   "play" verde).
        
        // Alcune osservazioni:
        //         
		// - I messaggi stampati vengono mostrati in Eclipse nel tab
        //   "Console" sottostante.
        //
        // - I comandi vengono eseguiti in ordine, dal primo all'ultimo.
        //
        // - Ogni comando termina col carattere punto-e-virgola ";"
        //
        // - Nel comando println, ogni messaggio da stampare è racchiuso tra
        //   virgolette doppie.
        
        // Sopra abbiamo visto che il comando println(...) accetta come
        // argomento tra le parentesi un messaggio, racchiuso tra
        // virgolette.
        // Oltre ai messaggi, è possibile usare come argomento anche
        // valori numerici. Tali valori possono essere speficicati tramite
        // *espressioni* aritmetiche intere:
        
        System.out.println(1234);    // Banale costante
        System.out.println(12 + 67); // 79 --- Addizione
        System.out.println(12 - 7);  // 5  --- Sottrazione
        System.out.println(10 * 8);  // 80 --- Moltiplicazione
        System.out.println(10 / 3);  // 3  --- Quoziente (non divisione!)
        System.out.println(10 % 3);  // 1  --- Resto della divisione
        
        // Se avete bisogno di parentesi nelle espressioni, potete usare
        // le parentesi tonde. Se vi servono parentesi annidate, le une
        // dentro le altre, usate sempre e solo quelle tonde.
        System.out.println(3*(4 + 5*(2+1)));  // Espressione complessa
        
        // Esercizio 1:
        // Modificate il codice sopra, aggiungendo la stampa di un ulteriore
        // messaggio a vostra scelta.
        
        // Esercizio 2:
        // Provate a stampare il risultato di 1+2*3 e osservate che vengono
        // rispettate le comuni precedenze tra gli operatori aritmetici,
        // come se avessimo aggiunto le parentesi.        
	}
}
