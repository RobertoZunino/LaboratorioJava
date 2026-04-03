
public class Parte09_Vettori {

	public static void main(String[] args) {
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
	}

	static void esercizioQuadrati() {
		// Dato n>=0, generate un vettore con dentro i primi n quadrati.
	}
	
	static void esercizioSomma() {
		// Dato un vettore di interi, calcolate la somma dei suoi elementi. 
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
}
