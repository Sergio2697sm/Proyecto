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

		int menu = 0;
		GestionArticulo ga = new GestionArticulosArrayListlmpl(null);
		do {
			switch (menu) {
			case 1:
				Articulo a = null;
				int iva = leerNumero("Introductiva el iva");
				double precio = leerdouble("Introduce un precio");
				String descripcion = leerDescripcion("Introduzca una descripcion");
				int tipo = leerNumero("Introduzca 1 si es alimentario y 2 si no es alimentario");
				if (tipo == 1) {
					int calorias = leerNumero("Introduzca unas calorias");
					a = new ArticuloALimentario(descripcion, precio, iva, calorias);
				} else {
					int peso = leerNumero("Introduzca un peso");
					a=new ArticuloNoAlimentario(descripcion, precio, iva, peso);
				}
				
				ga.incluirArticulo(a);
				
				break;

				
			case 2:

				ga.buscarArticulo(0);
				break;

			case 3:
				break;

			case 4:
				break;

			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			}
		} while (menu != 8);

	}

	private static int leerNumero(String string) {

		BufferedReader gf = new BufferedReader(new InputStreamReader(System.in));
		String texto = null;
		int numero = 0;
		try {
			System.out.println(string);
			texto = gf.readLine();
			numero = Integer.parseInt(texto);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numero;
	}

	private static double leerdouble(String string) {

		BufferedReader gf = new BufferedReader(new InputStreamReader(System.in));
		String texto = null;
		double numero = 0;
		try {
			System.out.println(string);
			texto = gf.readLine();
			numero = Double.parseDouble(texto);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numero;
	}

	private static String leerDescripcion(String string) {

		BufferedReader gf = new BufferedReader(new InputStreamReader(System.in));
		String texto = null;

		try {
			System.out.println(string);
			texto = gf.readLine();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return texto;
	}

}
