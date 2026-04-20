
public class Soluzioni08_TipiNumerici {

	public static void main(String[] args) {
	}
	
	static void esercizioQuadrato() {
		// Dato n>=0, generate n punti casuali (a,b) dentro un quadrato di
		// lato unitario.
		// Contate quanti di questi hanno entrambe le coordinate <= 0.5,
		// cioè cadono nel quarto del quadrato che tocca l'origine.
		// Intuitivamente, in media, quanti punti siffatti dovremmo contare?
		// Stampate il numero di punti siffatti rapportati al numero totale
		// per diversi valori di n, e osservate a quanto converge il
		// rapporto.
		//
		// Questo metodo per stimare l'area di un insieme generando punti
		// casuali viene chiamato metodo Monte Carlo.
		
		int n = 1000*1000;
		double area;

		int i;
		int dentro = 0;
		for (i = 0 ; i < n ; i++) {
			double a = Math.random();
			double b = Math.random();
			if (a <= 0.5 && b <= 0.5) {
				dentro++;
			}
		}
		
		area = (double) dentro / n;
		System.out.println("Stima dell'area (con " + n + " punti): " + area);
	}
	
	static void esercizioCerchio() {
		// Ripetete l'esercizio di prima contando invece i punti che distano
		// dal centro del quadrato al più 0.5 unità.
		// Intuitivamente, in media, quanti punti siffatti dovremmo contare?
		//
		// Se vi serve, potete usare Math.sqrt() per calcolare la radice
		// quadrata, ma è possibile fare a meno di usare tale funzione.
	
		int n = 1000*1000;
		double area;

		int i;
		int dentro = 0;
		for (i = 0 ; i < n ; i++) {
			double a = Math.random();
			double b = Math.random();
			if ((a-0.5)*(a-0.5) + (b-0.5)*(b-0.5) <= 0.25) {
				dentro++;
			}
		}
		
		area = (double) dentro / n;
		System.out.println("Stima dell'area (con " + n + " punti): " + area);
		System.out.println("4 * area = " + 4*area);
		
	}
	
	static void esercizioIntegrale() {
		// Provate ad usare lo stesso metodo per stimare l'integrale della 
		// funzione seno (Math.sin) tra 0 e pi greco (Math.PI).
		//
		// Sfruttate il fatto che il grafico del seno è incluso nel
		// rettangolo di base [0, pi greco] e altezza [0,1]. 
		// Generate n punti nel rettangolo e contate quanti cadono sotto
		// la curva.		
		
		int n = 1000*1000;
		double area;
		
		int i;
		int dentro = 0;
		for (i = 0 ; i < n ; i++) {
			double a = Math.PI * Math.random();
			double b = Math.random();
			if (b <= Math.sin(a)) {
				dentro++;
			}
		}
		
		area = Math.PI * (double) dentro / n;		
		System.out.println("Stima dell'area (con " + n + " punti): " + area);
	}
}
