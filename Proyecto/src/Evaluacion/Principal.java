package Evaluacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) {
		System.out.println(" **********MENU******************\r\n " + " 1.- Almacenar nuevo art�culo\r\n"
				+ "2.- Eliminar art�culo\r\n" + "3.- Buscar art�culo por c�digo\r\n"
				+ "4.- Buscar art�culo por descripci�n\r\n" + "5.- Mostrar inventario de art�culos\r\n"
				+ "6.- Buscar art�culos por intervalo de precios\r\n" + "7.- Salir\r\n" + "Introduce opci�n: ");
		
		
		int menu=0;
		GestionArticulo ga = new GestionArticulosArrayListlmpl();
		do {
			switch (menu) {
			case 1:
				Articulo a = null;
				ga.incluirArticulo(a);
				break;
				
			case 2:
				int codigo = leerNumero("Introduzca el c�digo a buscar");
				ga.buscarArticulo(0);
				break;
			}
		} while(menu!=8);
		
		
		
	}

	private static int leerNumero(String string) {
		System.out.println(string);
		BufferedReader gf= new BufferedReader(new InputStreamReader(System.in));
		try {
			gf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
