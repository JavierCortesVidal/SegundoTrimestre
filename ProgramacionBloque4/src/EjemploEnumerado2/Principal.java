package EjemploEnumerado2;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Persona persona = crearPersona();

		System.out.println(persona);
		
		switch ( persona.getEstadoCivil() ) {
		case CASADO:
			break;
		case OTRO:
			break;
		case SEPARADO:
			break;
		case SOLTERO:
			break;
		case VIUDO:
			break;
	
		
		}

	}

	private static Persona crearPersona() {

		String dni, nombre;
		Persona.TipoEstadoCivil estadoCivil;
		Persona persona;

		dni = "111";
		nombre = "pepe perez";
		estadoCivil = solicitarEstadoCivil();
		persona = new Persona(dni, nombre, estadoCivil);
		return persona;

	}

	private static Persona.TipoEstadoCivil solicitarEstadoCivil() {
		String cadenaEstadoCivil;
		Persona.TipoEstadoCivil estadoCivil=null;
		boolean correcto = false;

		do {
			try {
				System.out.println("Introduce el estado civil: " +Arrays.toString(Persona.TipoEstadoCivil.values()));
				cadenaEstadoCivil = teclado.nextLine();

				cadenaEstadoCivil=cadenaEstadoCivil.toUpperCase();
				estadoCivil = Persona.TipoEstadoCivil.valueOf(cadenaEstadoCivil);
				correcto = true;
			} catch (IllegalArgumentException e) {
				System.out.println("Estado civil incorrecto");
				correcto = false;
			}
		} while (!correcto);

		return estadoCivil;

	}

}
