package Relacion9Ejercicio6;

import java.util.Iterator;

public class Principal {

	private static final int TOTAL_EDIFICIOS=5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Edificio[] edificio=new Edificio[TOTAL_EDIFICIOS];
		
		edificio[0]=new Polideportivo(1,120, "San Juana");
		edificio[1]=new Polideportivo(3,450, "San Matea");
		edificio[2]=new Polideportivo(7,230, "San Lucasa");
		edificio[3]=new EdificioDeOficinas(301, 4);
		edificio[4]=new EdificioDeOficinas(200, 1);
		
		
		
		for (int i = 0; i < edificio.length; i++) {
			System.out.println(edificio[i].toString()+"\n");
		}
		
	}

}
