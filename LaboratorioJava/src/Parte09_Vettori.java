
public class Parte09_Vettori {

	public static void main(String[] args) {
		introduzione();
	}
	
	static void introduzione() {
		// Fino ad ora abbiamo visto variabili in grado di contenere un
		// singolo dato, per esempio un numero.
		//
		// Java supporta anche variabili di tipo vettore (o "array"), in
		// grado di contenere una sequenza / ennupla di valori.
		// I tipi vettore di scrivono come
		//		int[]
		//		double[]
		// e così via.
		//
		// Vediamo un esempio:
		int[] v = new int[] { 60, 89, -43, 8 };
		
		// Ora v è un vettore con quattro interi dentro.
		// Possiamo accedere alle sue componenti con la sintassi
		//		v[indice]
		// dove indice è un'espressione int.
		//
		// ATTENZIONE: gli indici partono da ZERO (incluso) e vanno fino
		// alla lunghezza del vettore (ESCLUSA). Quindi in questo caso
		// le componenti si scrivono come
		//		v[0], v[1], v[2], v[3] 
		
		// La lunghezza di un vettore v si scrive anche come v.length
		System.out.println("La lunghezza di v è " + v.length);
		
		// Stampiamo tutti gli elementi di un vettore:
		int i;
		for (i = 0 ; i < v.length ; i++) {
			System.out.println("v[" + i + "] = " + v[i]);
		}
		
		// Gli elementi sono modificabili tramite assegnamento:
		v[1] = v[2] + v[3];

		// Ristampiamo v
		for (i = 0 ; i < v.length ; i++) {
			System.out.println("v[" + i + "] = " + v[i]);
		}
		
		
		// Nel caso in cui si tenti di accedere ad un indice non valido
		// cioè < 0 oppure >= v.length, Java genererà un errore
		//		ArrayIndexOutOfBoundsException
		// Un po' come una divisione per zero, questo terminerà l'esecuzione
		// del programma. Evitatelo!
		//
		// v[4] = 6; // Indice troppo grande.
		
		
		// Non sempre quando scriviamo il programma ("a tempo statico")
		// conosciamo la lunghezza del vettore. Potremmo per esempio
		// volere usare un vettore per contenere dati letti da file,
		// dalla rete, da tastiera, e non è possibile sapere esattamente
		// quanti saranno.
		//
		// In questi casi si può creare un vettore usando
		//		int[] w = new int[ <<lunghezza>> ];
		// ottenendo così un vettore di zeri.
		//
		int n; // Numero non noto a tempo statico.
		if (Math.random() > 0.5) { // Scegliamo n tirando una moneta.
			n = 3;
		} else {
			n = 5;
		}
		int[] w = new int[n]; // Vettore con n zeri.
		
		System.out.println("La lunghezza di w è " + w.length);
		for (i = 0 ; i < w.length ; i++) {
			System.out.println("w[" + i + "] = " + w[i]);
		}
	}
	
	static void esercizioConto() {
		// Dato n>=0, generate un vettore con dentro i primi n naturali.
		
		// TODO
	}

	static void esercizioQuadrati() {
		// Dato n>=0, generate un vettore con dentro i primi n quadrati.
		
		// TODO
	}
	
	static void esercizioSomma() {
		// Dato un vettore di interi, calcolate la somma dei suoi elementi.
		
		// TODO
	}
	
	static void esercizioSommeParziali() {
		// Dato un vettore di interi v, calcolate in un altro vettore w
		// tutte le somme parziali di v. Cioè:
		//		w[0] = v[0]
		//		w[1] = v[0] + v[1] 
		//		w[2] = v[0] + v[1] + v[2]
		//		w[3] = v[0] + v[1] + v[2] + v[3]
		// e così via.
		
		int[] v = new int[] { 1,7,2,4,8,1,5,7,0 };

		System.out.println("La lunghezza di v è " + v.length);
		int i;
		for (i = 0 ; i < v.length ; i++) {
			System.out.println("v[" + i + "] = " + v[i]);
		}

		int[] w = new int[4]; // Bozza da correggere
		// TODO
		
		System.out.println("La lunghezza di w è " + w.length);
		for (i = 0 ; i < w.length ; i++) {
			System.out.println("w[" + i + "] = " + w[i]);
		}
	}

	static void esercizioSommaVettori() {
		// Dati due vettori di interi della stessa lunghezza, create un
		// terzo vettore con la loro somma, componente per componente.
		int[] v1 = new int[] { 1,2,3,4,5,6,7,8 };
		int[] v2 = new int[] { 10,20,30,40,50,60,70,80 };
		
		int[] w = new int[4]; // Bozza, da correggere
		
		// TODO
		
		System.out.println("La lunghezza di v1 è " + v1.length);
		int i;
		for (i = 0 ; i < v1.length ; i++) {
			System.out.println("v1[" + i + "] = " + v1[i]);
		}
		System.out.println("La lunghezza di v2 è " + v2.length);
		for (i = 0 ; i < v2.length ; i++) {
			System.out.println("v2[" + i + "] = " + v2[i]);
		}
		System.out.println("La lunghezza di w è " + w.length);
		for (i = 0 ; i < w.length ; i++) {
			System.out.println("w[" + i + "] = " + w[i]);
		}
	}
	
	static void esercizioConcatenazione() {
		// Dati due vettori di interi, anche di lunghezze diverse, create un
		// terzo vettore con la loro concatenazione.
		int[] v1 = new int[] { 1,2,3,4,5,6,7,8 };
		int[] v2 = new int[] { 10,20,30,40 };
		
		int[] w = new int[4]; // Bozza, da correggere
		
		// TODO
		
		System.out.println("La lunghezza di v1 è " + v1.length);
		int i;
		for (i = 0 ; i < v1.length ; i++) {
			System.out.println("v1[" + i + "] = " + v1[i]);
		}
		System.out.println("La lunghezza di v2 è " + v2.length);
		for (i = 0 ; i < v2.length ; i++) {
			System.out.println("v2[" + i + "] = " + v2[i]);
		}
		System.out.println("La lunghezza di w è " + w.length);
		for (i = 0 ; i < w.length ; i++) {
			System.out.println("w[" + i + "] = " + w[i]);
		}		
	}
	
	static void esercizioOrdinato() {
		// Dato un vettore di interi, si calcoli se è ordinato in
		// modo crescente.		
		int[] v = new int[] { 1,2,3,4,5,6,7,8 };
		
		boolean ordinato = false; // Bozza, da correggere
		
		// TODO
		
		System.out.println("La lunghezza di v è " + v.length);
		int i;
		for (i = 0 ; i < v.length ; i++) {
			System.out.println("v[" + i + "] = " + v[i]);
		}
		if (ordinato) {
			System.out.println("v è ordinato in modo crescente");			
		} else {
			System.out.println("v NON è ordinato in modo crescente");			
		}
	}
	
	static void esercizioOrdinamentoPerSelezione() {
		// (impegnativo)
		//
		// Dato un vettore di interi, lo si permuti in modo da renderlo
		// ordinato in modo debolmente crescente.
		//
		// Per farlo, si proceda in questo modo:
		// - Si trovi la posizione i del minimo elemento del vettore. Si
		//   scambi l'elemento in posizione i con quello in posizione 0.
		// - Si trovi la posizione i del minimo elemento tra quelli in
		//   posizione 1..length-1. Si scambi l'elemento in posizione i
		//   con quello in posizione 1.
		// - Si trovi la posizione i del minimo elemento tra quelli in
		//   posizione 2..length-1. Si scambi l'elemento in posizione i
		//   con quello in posizione 2.
		// - Si proceda analogamente col resto del vettore, fino a renderlo
		//   ordinato.
		//
		// Questo algoritmo è noto come oridinamento per selezione
		// (selection sort) ed effettua O(n^2) operazioni, dove n è la
		// lunghezza del vettore. Non è l'algoritmo più veloce, ma è uno tra
		// i più semplici.
		
		int[] v = new int[] { 10,4,72,34,2,99,64 };
		
		// TODO
		
		System.out.println("La lunghezza di v è " + v.length);
		int i;
		for (i = 0 ; i < v.length ; i++) {
			System.out.println("v[" + i + "] = " + v[i]);
		}
	}

	static void iVettoriSonoRiferimenti() {
		// Questa è una nota avanzata su come Java gestisce i valori di tipo
		// vettore.

		// Quando usiamo i tipi fondamentali, come int o double, una
		// variabile contiene il valore che rappresenta. Se copiamo
		// il valore di una variabile in un'altra, la nuova variabile
		// ottiene una copia del valore.
		int i = 5;
		int j = i;  // Copia del valore di i
		j = 7;
		System.out.println("i = " + i + ", j = " + j);
		// Ora j è diventato 7, ma i è rimasto 5, perché era stata fatta una
		// copia del suo valore.
		
		// Quando usiamo i vettori, invece, accade una cosa diversa.
		int[] v = new int[] { 1,2,3,4 };
		// L'espressione new alloca (riserva) un po' della memoria del
		// nostro computer, scrive lì dentro i dati (1,2,3,4). La variabile
		// v non contiene direttamente i dati, ma solo un *riferimento* alla
		// memoria così allocata.
		//
		// Se proviamo a copiare v, non copiamo i dati del vettori, ma solo
		// il suo riferimento.
		int[] w = v; // Non copia (1,2,3,4), ma solo il suo riferimento.
		w[1] = 1000; // Modifica sia w[1] che v[1] perché si riferisce allo
					 // stesso vettore!
		System.out.println("w[1] = " + w[1] + ", v[1] = " + v[1]);
		
		// Se vogliamo copiare i dati del vettore, creando quindi un secondo
		// vettore in memoria, possiamo usare una new e fare una copia
		// manuale:
		w = new int[v.length];
		for (i = 0 ; i < v.length ; i++) {
			w[i] = v[i];
		}
		w[1] = 2000;
		// Ora w[1] è 2000 ma v[1] è rimasto 1000.
		System.out.println("w[1] = " + w[1] + ", v[1] = " + v[1]);
		
		// Un altro modo per fare una copia è usare clone().
		w = v.clone(); // Crea una copia del vettore, non del riferimento!
		w[1] = 3000;
		// Ora w[1] è 3000 ma v[1] è rimasto 1000.
		System.out.println("w[1] = " + w[1] + ", v[1] = " + v[1]);
	}
	
	static void riferimentiNulli() {
		// Questa è una nota avanzata su come Java gestisce i riferimenti.
		// 
		// Di solito, quando usiamo una variabile di tipo vettore, la
		// impostiamo a un riferimento ottenuto con una espressione new.
		// È anche possibile impostarla a un valore speciale "null" che
		// indica un riferimento invalido, a un vettore che non esiste
		// veramente.
		int[] v = null;
		
		// Siccome v non ha davvero un vettore associato, usare v.length o
		// v[indice] causa un errore (NullPointerException) a tempo di
		// esecuzione.
		//
		// v[0] = 42;  // Errore!
		
		// Possiamo solo controllare se v è nullo o no.
		if (v == null) {
			System.out.println("v è proprio null!");
		}
		
		// Possiamo anche impostare v a un riferimento valido.
		v = new int[4];
		v[0] = 42; // Ok!
		
		// Se ora impostiamo v di nuovo a null, ritorna inusabile.
		v = null;
		// Qui v.length e v[indice] non si possono usare.
		
		// E così via.
		v = new int[2];
		v[1] = 51; // Ok!
	}
	
	static void cenniAllaGarbageCollection() {
		// Quando usiamo una new per creare un vettore, riserviamo una parte
		// della memoria del nostro computer (allocazione). Questa memoria
		// viene segnata come "in uso" e non è più disponibile per contenere
		// altri dati.
		int[] v = new int[1000000]; // Un milione di interi
		
		// In programmi complessi, è importante anche liberare (deallocare)
		// la memoria quando non ci serve più, rendendola disponibile per 
		// le allocazioni future del nostro o di altri programmi.
		//
		// In alcuni linguaggi (come C e C++) la deallocazione va eseguita
		// manualmente con un comando apposito (free(v) / delete[] v).
		// Storicamente, questo ha causato vari problemi perché consente
		// di accedere per sbaglio alla memoria anche dopo la deallocazione:
		//   v = new int[10];
		//   v[0] = 6;
		//   delete[] v;
		//   ...
		//   v[1] = 7; // Scrivo su una zona di memoria che ora potrebbe
		//             //  essere usata per altri scopi! Pericolosissimo!
		//
		// Questo problema viene chiamato "memory unsafety".
		//
		// In Java la memory unsafety viene evitata con un meccanismo
		// chiamato "garbage collection" (raccolta rifiuti), che
		// approssimativamente funziona così:
		//   - la free/delete manuale è vietata dal linguaggio;
		//   - ogni tanto, Java ferma il programma e ne scandisce tutte le
		//     variabili attive, identificando i riferimenti ancora in uso;
		//   - se con tali riferimenti non è possibile raggiungere una zona
		//     di memoria precedentemente allocata, questa viene deallocata.
		//
		// La deallocazione non avviene più in punti precisi del programma,
		// ma avviene a discrezione del linguaggio: Java decide quando farlo
		// al posto nostro, col vincolo di non deallocare mai memoria che
		// il programma potrebbe raggiungere in futuro.
		
		// Sopra abbiamo allocato v, ora Java NON può deallocarlo.
		v[1] = 10;
		// Ora Java NON può deallocare v.
		int i = 7;
		// Ora Java NON può deallocare v.
		v = null;
		// Non ci sono più modi per raggiungere il vettore.
		// Ora Java POTREBBE deallocare v, ma non è obbligato.
		i = i + 100;
		// Ora Java POTREBBE deallocare v, ma non è obbligato.
		
		// In sintesi, se un vettore grande non è più in uso, è buona norma
		// cancellarne i riferimenti, per esempio impostando a null le
		// variabili vettore o uscendo dalle graffe dove sono state
		// dichiarate, in modo da consentire a Java di deallocare la
		// memoria. Non c'è garanzia sul momento in cui questo avverrà.
	}
}
