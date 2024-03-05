package Relacion9Ejercicio3;

import java.util.Arrays;

public class FlotaVehiculos {
	static int numeroRealVehiculos=0;
	
	private Vehiculo vehiculos[];

	/**
	 *  Variable que guarda donde se insertará el siguiente vehiculo
	 *  Empieza con 0 y si vale vehiculos.length el almacen esta lleno
	 */
	private  int numeroRealDeVehiculos;

	public FlotaVehiculos(int capacidadAlmacen) throws VehiculoException {
		if (capacidadAlmacen <= 0)
			throw new VehiculoException("Numero de vehiculos no puede ser negativo o cero");
		vehiculos = new Vehiculo[capacidadAlmacen];
		numeroRealDeVehiculos = 0;
		
	}
	
	
	

	public  void introducirVehiculo (Vehiculo vehiculo){
		vehiculos[numeroRealVehiculos]=vehiculo;
		numeroRealDeVehiculos++;
		
		
	}
	
	public double precioAlquiler( String matricula, int dias) throws VehiculoException{
		double precio=0;
		boolean encontrado=false;
	
		
		for(int i=0;i<numeroRealDeVehiculos && !encontrado ;i++) {
			if(vehiculos[i].getMatricula().equals(matricula)) {
				precio=vehiculos[i].calcularAlquilerBase(dias)+vehiculos[i].calcularAlquiler(dias);
				encontrado=true;
			}
		}
		
		if(!encontrado) {
			throw new VehiculoException("La matricula no existe");
		}
		return precio;

	}
	
	




	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<numeroRealDeVehiculos ;i++) {
			sb.append(vehiculos[i]+"/n");
		}
		return sb.toString();
	}
	
}
