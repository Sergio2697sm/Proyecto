package Evaluacion;

public class Principal {

	public static void main(String[] args) {
		System.out.println(" **********MENU******************\r\n " + " 1.- Almacenar nuevo art�culo\r\n"
				+ "2.- Eliminar art�culo\r\n" + "3.- Buscar art�culo por c�digo\r\n"
				+ "4.- Buscar art�culo por descripci�n\r\n" + "5.- Mostrar inventario de art�culos\r\n"
				+ "6.- Buscar art�culos por intervalo de precios\r\n" + "7.- Salir\r\n" + "Introduce opci�n: ");
		
		
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
