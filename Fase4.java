
public class Fase4 {
	public static void main (String args[]) {	
		String nombre_completo="";
		String fecha_nac="";
		String nom="Daniel";
		String cognom1="Arizu";
		String cognom2="Pascual";
		int dia_nac = 27;
		int mes_nac = 11;
		int ano_nac = 1975;
		int BISIESTO = 1948;
		int periodo=4;
    	boolean pertenece = false;
    	String frase_cierto="Mi año de nacimiento es bisiesto.";
    	String frase_falso="Mi año de nacimiento no es bisiesto.";
		
		nombre_completo=nom + " " + cognom1 + " " + cognom2;
		fecha_nac=dia_nac+"/"+ mes_nac +"/"+ano_nac;
		
		for (BISIESTO = 1948 ; BISIESTO <= ano_nac ;BISIESTO = BISIESTO + periodo) {
			if (BISIESTO == ano_nac) {
				pertenece = true;
			}
		}
		System.out.println("Mi nombre es " + nombre_completo + ".");
		System.out.println("Mi fecha de nacimeinto es el " + fecha_nac  + ".");
		if (pertenece) {
			System.out.println(frase_cierto);
		}
		else {
			System.out.println(frase_falso);
		}
	}
}
