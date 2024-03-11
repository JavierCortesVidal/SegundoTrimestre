package Relacion9Ejercicio6;

public class Polideportivo implements Edificio, InstalacionDeportiva {

	
	private int tipoInstalacion;
	private double superficie;
	private String nombre;
	
	
	public Polideportivo(int tipoInstalacion, double superficie, String nombre) {
		super();
		this.tipoInstalacion = tipoInstalacion;
		this.superficie = superficie;
		this.nombre=nombre;
	}


	public int getTipoInstalacion() {
		// TODO Auto-generated method stub
		return this.tipoInstalacion;
	}

	
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return this.superficie;
	}


	@Override
	public String toString() {
		return "Polideportivo [tipoInstalacion=" + tipoInstalacion + ", superficie=" + superficie + ", nombre=" + nombre
				+ "]";
	}
	
	
	

}
