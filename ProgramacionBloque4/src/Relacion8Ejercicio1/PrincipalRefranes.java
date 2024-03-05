package Relacion8Ejercicio1;

import java.util.Scanner;

public class PrincipalRefranes {

	private static final int MAXIMO_REFRANES = 50;
	private static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Refran[] refranes=new Refran[MAXIMO_REFRANES];
		int numeroRealRefranes=0;
		int opcionMenu;
		int opc;
		
//		do {
			opcionMenu=mostrarMenu();
			
//			numeroRealRefranes= tratarMenu( refranes, numeroRealRefranes);
			
//		}while(opc!=4);
		
		

	}

	private static int tratarMenu(Refran[] refranes, int numeroRealRefranes, int opc) throws RefranException {
		// TODO Auto-generated method stub
		
		int salida=0;
		String refran,palabraRefran;
		int popularidad;
		boolean encontrado=false;
		int i;

		
		
		switch(opc) {
			case 1:
				refran=solicitarDato("Introduce un refrán");
				popularidad=solicitarEntero("Introduce la popularidad");
				for(i=0; i<refranes.length && !refranes[i].equals(refran);i++) {
					if(refranes[i].equals(refran)) {
						throw new RefranException("Ya existe este refrán");
					}
				}
				refranes[i].setNombre(refran);
				
				break;
			case 2:
				palabraRefran=solicitarDato("Dime una palabra");
					
				for(int j=0;j<refranes.length;j++) {
			if(palabraRefran.contains(String.valueOf(refranes[j]))) {
			 System.out.println("Encontrado");
			 encontrado=true;
				}else {
					System.err.println("No encontrado");
					}		
				}
					
				break;
			case 3:
				int j=0;
				while(refranes.length>j) {
				
					
				}
				
				
				break;
			case 4:
				opc=4;
				break;
			
				
		}
		return 0;
	}

	private static int solicitarEntero(String msg) {
			int entero;
			System.out.println(msg);
			entero=Integer.parseInt(teclado.nextLine());
		return entero;
	}

	private static String solicitarDato(String msg) {
		String dato;
		System.out.println(msg);
		dato=teclado.nextLine();
		return dato;
	}

	private static int mostrarMenu() {
		int opc;
		
		System.out.println("1. Guardar refrán");
		System.out.println("2. Buscar refrán");
		System.out.println("3. Listar refranes");
		System.out.println("4. Salir");
		opc=Integer.parseInt(teclado.nextLine());
		
		return opc;
	}
	
	}
	


