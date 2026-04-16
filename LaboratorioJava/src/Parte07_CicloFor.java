
public class Parte07_CicloFor {

	public static void main(String[] args) {
		introduzione();
	}
	
	static void introduzione() {
		// Il ciclo for è una variante del while.
		// Ha la seguente sintassi:
		//
		//	for (<<inizializzazione>> ; <<guardia>> ; <<incremento>>) {
		//		<<comandi da eseguire finché la guardia è vera>>
		// 	}
		//
		// Per esempio:
		
		int i;
		System.out.println("Inizio for");
		for (i = 0 ; i < 10 ; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("Fine for");
			
		// Il for è completamente equivalente a
		i = 0;
		while (i < 10) {
			System.out.println("i = " + i);
			i++;
		}
		// e quindi non aggiunge nessuna nuova funzionalità -- è solo una 
		// sintassi più semplice / più comoda per scrivere un ciclo dove
		// "i va da 0 a 10 (escluso)".
	}
	
	static void esercizioQuadrati() {
		// Usate un for per stampare i primi 20 quadrati.
		// 0 1 4 9 ...
		
		// TODO
	}
			
	static void esercizioPrimalità() {
		// Dato n>=2, verificate se n è un primo, provando
		// a dividerlo per tutti gli m tra 2 e n-1.
		//
		// Potete imitare il precedente esercizio che usava il while,
		// ma provate a usare un ciclo for al suo posto.
		
		// TODO
	}
	
	static void esercizioTabellaPrimi() {
		// Per ogni intero n tra 2 e 100 stampate se è primo o no.
		//
		// Bonus: se n è composto, stampate anche un suo divisore.
		
		// TODO
	}
}
