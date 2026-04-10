// Questi "import" attivano le librerie standard di Java e consentono
// di effettuare l'output su file.
import java.io.*;

public class Parte14_Output {

	public static void main(String[] args) {
		introduzione();
	}

	static void introduzione() {
		// Vediamo ora come creare un file di testo e scriverci dentro dei
		// dati.
		//
		// **ATTENZIONE**: quando proviamo a creare un nuovo file di testo,
		// questa azione *cancella* un eventuale file esistente con lo
		// stesso nome! Si raccomanda la massima attenzione per evitare di
		// vedersi cancellati file importanti.
		
		// Siccome creare un file può causare errori (per esempio, spazio
		// insufficiente, mancanza di permessi, ...), Java ci obbliga a
		// gestirli. Così come abbiamo fatto per la lettura, useremo un
		// comando try-with-resources.
		
		try (FileWriter file = new FileWriter(new File("output.txt"))) {
			// Ora il file è aperto e possiamo scriverci dentro.
			//
			// Eseguiamo la scrittura nel file con il comando file.write();
			// Al contrario di println, non va automaticamente a capo.
			// Per scrivere una riga e andare a capo bisogna terminare
			// la riga col carattere "\n" (new line).
			file.write("Questo viene scritto dentro il file\n");
			file.write("Pure questo viene scritto dentro il file\n");
			
			// Scriviamo i numeri a 0 a 10 (escluso).
			int i;
			for (i = 0 ; i < 10 ; i++) {
				file.write("numero " + i + "\n");
			}
			
			System.out.println("Per vedere quello che è stato scritto su file, "
					+ "aprite \"output.txt\" con un editor di testi qualunque.");
			// Qui il file viene automaticamente chiuso.
		} catch (IOException e) {
			// C'è stato un errore, stampiamolo
			System.out.println("Errore di IO su file: " + e);
		}
	}

}
