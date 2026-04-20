
public class Soluzioni10_Stringhe {

	public static void main(String[] args) {
	}
	
	static void esercizioRicerca() {
		// Data una stringa, determinate se contiene almeno una lettera 'A'
		// al suo interno.
		
		String s = "ecco qui A un esempio";
		
		boolean trovataA = false;
		int i;
		for (i = 0 ; i < s.length() ; i++) {
			if (s.charAt(i) == 'A') {
				trovataA = true;
			}
		}
		
		if (trovataA) {
			System.out.println("La stringa " + s + " contiene A!");
		} else {
			System.out.println("La stringa " + s + " NON contiene A!");
		}
	}

	static void esercizioDuplica() {
		// Data una stringa, calcolate una nuova stringa ottenuta
		// raddoppiando tutte le lettere. Per esempio, se la stringa di
		// partenza è "Mario" la stringa finale deve essere "MMaarriioo".
		
		String s = "Mario";
		String risultato = "";
		
		int i;
		for (i = 0 ; i < s.length() ; i++) {
			risultato = risultato + s.charAt(i) + s.charAt(i);
		}
		// Nota: concatenare in questo modo le stringhe non è molto
		// efficiente, visto che copiamo ogni volta il contenuto di
		// "risultato" in una nuova stringa. Per stringhe brevi non è
		// importante, ma se dovessimo gestire stringhe lunghe sarebbe
		// meglio scrivere i caratteri in un char[] e alla fine convertirlo
		// a String con le funzioni di libreria, copiando quindi i dati una
		// volta sola.
		
		System.out.println("La stringa " + s + " raddoppiata è " + risultato);
	}
	
	static void esercizioPalindroma() {
		// Data una stringa, determinare se è palindroma, ovvero se 
		// è uguale a se stessa letta al contrario (da destra a sinistra).
		String s = "abcdefedcba";
		
		boolean palindroma = true;
		int i;
		for (i = 0 ; i < s.length() / 2 ; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				palindroma = false;
			}
		}
		
		if (palindroma) {
			System.out.println("s = " + s + " è palindroma!");
		} else {
			System.out.println("s = " + s + " NON è palindroma!");
		}
	}
}
