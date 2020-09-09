
public class Fase2 {
	public static void main (String args[]) {
		final int BISIESTO = 1948;
		int periodo=4;//periodicidad de los años bisiestos
		int ano_nac=1975; //año de nacimiento
		double num_anos=0f; //variable donde guardaremos el resultado
		num_anos = Math.floor((ano_nac-BISIESTO)/periodo);
	    System.out.println("El numero de años bisiestos entre " + BISIESTO + " y " + ano_nac + " es de " + num_anos + " años.");
			
	}
}
