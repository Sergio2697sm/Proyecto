package Evaluacion;

public class Principal {

	public static void main(String[] args) {
		System.out.println(" **********MENU******************\r\n " + " 1.- Almacenar nuevo artículo\r\n"
				+ "2.- Eliminar artículo\r\n" + "3.- Buscar artículo por código\r\n"
				+ "4.- Buscar artículo por descripción\r\n" + "5.- Mostrar inventario de artículos\r\n"
				+ "6.- Buscar artículos por intervalo de precios\r\n" + "7.- Salir\r\n" + "Introduce opción: ");
		
		
		int menu=0;
		gestionArticulo ga = new gestionArticulo() {
		};
		do {
			switch (menu) {
			case 1:
				Articulo a = null;
				ga.incluirArtiuclo(a);
				break;

			default:
				break;
			}
		} while(menu!=8);
		
		
		
	}

}
