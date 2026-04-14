
public class Parte10_Stringhe {

	public static void main(String[] args) {
		introduzione();
	}
	
	static void introduzione() {
		// Il tipo char contiene un carattere: una lettera, cifra, simbolo,
		// o spazio.
		// I letterali char si scrivono tra apici singoli (apostrofi).
		char c = 'A';
		c = '7';
		c = ' ';
		c = 'x';
		System.out.println("c = " + c);
		
		// Le stringhe contengono una sequenza finita di zero o più char.
		// I letterali String si scrivono tra apici doppi.
		String s = "Ciao!";
		s = "Ehilà!";
		System.out.println("s = " + s);
		
		// Le stringhe si possono sommare con quasi tutti gli altri valori.
		// Quando si somma una stringa con qualcos'altro, l'altro valore
		// viene convertito automaticamente a stringa. Il risultato è
		// la concatenazione delle due stringhe.
		s = "Ciao " + 123;
		s = "Ciao " + 123.456;
		s = "Ciao " + '!';
		
		// La lunghezza di una stringa è ottenibile come s.length().
		// I caratteri sono accessibili come s.chatAt(posizione), come se
		// fosse un vettore. Anche qui le posizione partono da *zero*.
		int i;
		for (i = 0 ; i < s.length() ; i++) {
			c = s.charAt(i);
			System.out.println("c = " + c);
		}
		
		// Al contrario di un vettore di char, le stringhe sono 
		// *immutabili*. Non è possibile cambiare un singolo carattere.
		// È tuttavia possibile creare una nuova String.
		//
		// Per esempio, data s, proviamo a sostituire ogni X con Y.
		s = "123X456X789";
		String risultato = "";
		for (i = 0 ; i < s.length() ; i++) {
			if (s.charAt(i) == 'X') {
				risultato = risultato + 'Y';
			} else {
				risultato = risultato + s.charAt(i);
			}
		}
		System.out.println("s = " + s + ", risultato = " + risultato);
		
		// (Nota: il codice sopra non è particolarmente efficiente in
		// quanto crea un sacco di stringhe intermedie. Ci sono metodi più
		// efficienti di farlo in Java, ma non li vediamo. Per stringhe
		// brevi l'efficienza non importa molto.)
		
		// Infine, si noti che le stringhe in Java sono riferimenti, come i
		// vettori. Come tali, non vanno confrontate con "==". Per
		// controllare l'uguaglianza tra due stringhe, usate invece
		// ".equals()" come fatto sotto:
		
		String s1 = "ciao";
		String s2 = "c";
		s2 = s2 + "iao";
		System.out.println("Confrontiamo \"" + s1 + "\" con \"" + s2 + "\"");			
		if (s1 != s2) {
			System.out.println("Il confronto con == dice che sono diverse!");			
			System.out.println("Non usate == sulle stringhe!");			
		}
		if (s1.equals(s2)) {
			System.out.println("Il confronto con .equals() dice che sono uguali!");			
		}
	}

	static void esercizioRicerca() {
		// Data una stringa, determinate se contiene almeno una lettera 'A'
		// al suo interno.
		
		String s = "ecco qui A un esempio";
		
		boolean trovataA = false; // Bozza da correggere
		
		// TODO
		
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
		String risultato = ""; // Bozza da correggere
		
		// TODO
		
		System.out.println("La stringa " + s + " raddoppiata è " + risultato);
	}
	
	static void esercizioPalindroma() {
		// Data una stringa, determinare se è palindroma, ovvero se 
		// è uguale a se stessa letta al contrario (da destra a sinistra).
		String s = "abcdefedcba";
		
		boolean palindroma = true; // Bozza da correggere
		
		// TODO
		
		if (palindroma) {
			System.out.println("s = " + s + " è palindroma!");
		} else {
			System.out.println("s = " + s + " NON è palindroma!");
		}
	}
}
