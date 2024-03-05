package Relacion9Ejercicio2;

public class Informatico extends Empleado {

	public enum Especialidad {
		DESARROLLO, BD, SISTEMAS;
	}

	private static final int SUELDO_MAXIMO_INFORMATICO = 2500;
	private Especialidad especialidad;

	public Informatico(String dni, String nombre, int sueldo, Especialidad especialidad) throws EmpleadoException {
		super(dni, nombre, sueldo);
		this.especialidad = especialidad;
	}

	public void setSueldo(int sueldo) throws EmpleadoException {
		if (sueldo > SUELDO_MAXIMO_INFORMATICO) {
			throw new EmpleadoException("El sueldo supera al máximo permitido");
		}
		super.setSueldo(sueldo);
	}

	@Override
	public String toString() {
		return "Informatico" + super.toString() + "Especialidad:" + especialidad + "]";
	}

}
