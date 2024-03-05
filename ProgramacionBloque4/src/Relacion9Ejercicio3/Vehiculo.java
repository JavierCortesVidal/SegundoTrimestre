package Relacion9Ejercicio3;

public abstract class Vehiculo {
	
	private String matricula; 
	private TipoGama gama;
	
	public static final double PRECIO_ALTA = 50;
	public static final double PRECIO_MEDIA = 40;
	public static final double PRECIO_BAJA = 30;

	public Vehiculo(String matricula, TipoGama gama)  {
		this.matricula = matricula;
		this.gama=gama;

	}
	
	public abstract double calcularAlquiler(int dias) throws VehiculoException;

	// M�todos gets y sets
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public TipoGama getGama() {
		return gama;
	}

	public void setGama(TipoGama gama) {
		this.gama = gama;
	}	

	

	// M�todos calcular base	

	protected double calcularAlquilerBase(int dias) throws VehiculoException {
		double precio=0 ;
		
		if (dias <= 0)
			throw new VehiculoException("Dias de alquiler incorrecto");
		
		precio=dias* gama.getPrecioBasePorGama();
		
		precio= precio* dias;
		
		return precio;

	}

	@Override
	public String toString() {
		return " Matricula=" + matricula + ", gama=" + gama + "]";
	}

}
