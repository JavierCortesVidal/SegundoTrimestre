package Relacion9Ejercicio2;

public class Operario extends Empleado {

	private static final int SUELDO_MAXIMO_OPERARIO = 1200;
	private static final int NUMERO_MINIMO_NAVE = 1;
	private static final int NUMERO_MAXIMO_NAVE = 5;
	private int numeroNave;

	public Operario(String dni, String nombre, int sueldo, int numeroNave) throws EmpleadoException {
		super(dni, nombre, sueldo);
		setNumeroNave(numeroNave);
		setSueldo(sueldo);
	}

	public int getNumeroNave() {
		return numeroNave;
	}

	public void setNumeroNave(int numeroNave) throws EmpleadoException {
		if (numeroNave < NUMERO_MINIMO_NAVE || numeroNave > NUMERO_MAXIMO_NAVE) {
			throw new EmpleadoException("No existe el número de nave introducido");
		} else {
			this.numeroNave = numeroNave;
		}
	}
	
	public void setSueldo(int sueldo) throws EmpleadoException {
		if (sueldo > SUELDO_MAXIMO_OPERARIO) {
			throw new EmpleadoException("El sueldo supera al máximo permitido");
		}
		super.setSueldo(sueldo);
	}

	@Override
	public String toString() {
		return "Operario" + super.toString() + "numero nave:" + numeroNave;
	}

}