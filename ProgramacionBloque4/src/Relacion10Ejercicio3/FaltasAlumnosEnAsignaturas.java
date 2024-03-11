package Relacion10Ejercicio3;
import java.util.Random;

public class FaltasAlumnosEnAsignaturas {
	
	private static final int NUMERO_ALUMNOS = 10;
	private static final int NUMERO_ASIGNATURAS = 4;
	
	
	private String[] asignaturas= {"PROG", "LM", "BD", "ED"};
	private Falta[][] matrizFaltas;
	
	
	public FaltasAlumnosEnAsignaturas() {
		matrizFaltas=new Falta[NUMERO_ALUMNOS][NUMERO_ASIGNATURAS];
		
		cargarConDatosAleatorios();
	}

	public String toString() {
		StringBuilder sb=new StringBuilder();
		
		for(int numeroAlumno=0; numeroAlumno<matrizFaltas.length; numeroAlumno++) {
			
			for( int numeroAsig=0; numeroAsig < matrizFaltas[0].length; numeroAsig++) {
				sb.append(matrizFaltas[numeroAlumno][numeroAsig] +"\t");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	private void cargarConDatosAleatorios() {
		
		Random serie=new Random();
		Falta falta;
		
		for(int numeroAlumno=0; numeroAlumno<matrizFaltas.length; numeroAlumno++) {
			
			for( int numeroAsig=0; numeroAsig < matrizFaltas[0].length; numeroAsig++) {
				
				try {
					falta=new Falta(serie.nextInt(10), serie.nextInt(10), serie.nextInt(10));
					matrizFaltas[numeroAlumno][numeroAsig]=falta;
					
				} catch (FaltaException e) {
					//Este error no va a producirse
					System.out.println(e.getMessage());
				}
				
			
				
				
			}
		}
		
	}
	
	
	
}
