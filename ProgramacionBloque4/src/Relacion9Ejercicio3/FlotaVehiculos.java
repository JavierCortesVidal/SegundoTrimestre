package Relacion9Ejercicio3;

import java.util.Arrays;

public class FlotaVehiculos {

	private Vehiculo vehiculos[];

	/**
	 * Variable que guarda donde se insertará el siguiente vehiculo Empieza con 0 y
	 * si vale vehiculos.length el almacen esta lleno
	 */
	private int numeroRealDeVehiculos;

	public FlotaVehiculos(int capacidadAlmacen) throws VehiculoException {
		if (capacidadAlmacen <= 0)
			throw new VehiculoException("Numero de vehiculos no puede ser negativo o cero");
		vehiculos = new Vehiculo[capacidadAlmacen];
		numeroRealDeVehiculos = 0;
	}

	public void introducirVehiculo(Vehiculo vehiculo) throws VehiculoException {

		comprobarMatriculaRepetida(vehiculo.getMatricula());
		vehiculos[numeroRealDeVehiculos] = vehiculo;
		numeroRealDeVehiculos++;
	}

	public double precioAlquiler(String matricula, int dias) throws VehiculoException {
		double precio = 0;
		boolean encontrado = false;
		int posicionEncontrado = 0;

		for (int i = 0; i < numeroRealDeVehiculos && !encontrado; i++) {
			if (vehiculos[i].getMatricula().equals(matricula)) {
				posicionEncontrado = i;
				encontrado = true;
			}
		}
		if (!encontrado) {
			throw new VehiculoException("La matrícula no existe");
		}
		precio = vehiculos[posicionEncontrado].calcularAlquiler(dias);
		return precio;
	}

	public void comprobarMatriculaRepetida(String matricula) throws VehiculoException {

		for (int i = 0; i < numeroRealDeVehiculos; i++) {
			if (vehiculos[i].getMatricula().equals(matricula)) {
				throw new VehiculoException("La matrícula está repetida");
			}
		}

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < numeroRealDeVehiculos; i++) {
			sb.append(vehiculos[i] + "\n");
		}
		return sb.toString();
	}
}