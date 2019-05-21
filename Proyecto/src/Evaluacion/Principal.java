package Evaluacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) {
		System.out.println(" **********MENU******************\r\n " + " 1.- Almacenar nuevo artículo\r\n"
				+ "2.- Eliminar artículo\r\n" + "3.- Buscar artículo por código\r\n"
				+ "4.- Buscar artículo por descripción\r\n" + "5.- Mostrar inventario de artículos\r\n"
				+ "6.- Buscar artículos por intervalo de precios\r\n" + "7.- Salir\r\n" + "Introduce opción: ");
		
		
		int menu=0;
		GestionArticulo ga = new GestionArticulosArrayListlmpl();
		do {
			switch (menu) {
			case 1:
				Articulo a = null;
				ga.incluirArticulo(a);
				break;
				
			case 2:
				int codigo = leerNumero("Introduzca el código a buscar");
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
