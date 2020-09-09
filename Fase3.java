
public class Fase3 {

	public static void main (String args[]) {
		int BISIESTO = 1948;
		int periodo=4;//periodicidad de los años bisiestos
    	int ano_nac=1975; //año de naciento
    	boolean pertenece = false;
    	String frase_cierto="";
    	String frase_falso="";
	
		for (BISIESTO = 1948 ; BISIESTO <= ano_nac ;BISIESTO = BISIESTO + periodo) {
			System.out.println(BISIESTO);
				if (BISIESTO == ano_nac) {
				pertenece = true;
			}
		}
		
		if (pertenece==true) {
			frase_cierto="El año "+ano_nac+ " es bisiesto";
			System.out.println(frase_cierto);
		}
		if (pertenece==false) {
			frase_falso="El año "+ano_nac+ " no es bisiesto";
			System.out.println(frase_falso);
		}
	}
		
}
