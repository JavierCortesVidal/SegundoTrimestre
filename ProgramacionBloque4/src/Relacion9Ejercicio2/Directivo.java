package Relacion9Ejercicio2;

public class Directivo extends Empleado {

	private static final int SUELDO_MAXIMO_DIRECTIVO = 3500;
	private String departamento;

	public Directivo(String dni, String nombre, int sueldo, String departamento) throws EmpleadoException {
		super(dni, nombre, sueldo);
		this.departamento = departamento;
		setSueldo(sueldo);
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setSueldo(int sueldo) throws EmpleadoException {
		if (sueldo > SUELDO_MAXIMO_DIRECTIVO) {
			throw new EmpleadoException("El sueldo supera al máximo permitido");
		}
		super.setSueldo(sueldo);
	}

	@Override
	public String toString() {
		return "Directivo" + super.toString() + "departamento:" + departamento;
	}
}