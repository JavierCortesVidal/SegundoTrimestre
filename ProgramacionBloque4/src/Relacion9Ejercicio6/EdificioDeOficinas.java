package Relacion9Ejercicio6;

public class EdificioDeOficinas implements Edificio {
	
	private double superficie;
	private int oficinas;
	
	
	public EdificioDeOficinas(double superficie, int oficinas) {
		super();
		this.superficie = superficie;
		this.oficinas = oficinas;
	}


	public double getSuperficieEdificio() {
		return superficie;
	}


	@Override
	public String toString() {
		return "EdificioDeOficinas [superficie=" + superficie + ", oficinas=" + oficinas + "]";
	}

	
	
}
