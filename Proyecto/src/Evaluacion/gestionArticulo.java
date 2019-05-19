package Evaluacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public interface gestionArticulo {

	public default void incluirArtiuclo(Articulo a) {
		System.out.println("Introduce una descripcion");
		BufferedReader bf = new BufferedReader();
		
	}
	
	public default void buscarArticulo(int codigo) {
		
	}
	
	public default void eliminarArticulo(int codigo) {
		
	}
	
	public default void buscarPorDescricion(String descripcion) {
		
	}
	
	public default void mostrarInventario() {
		
	}
	
	public default void buscarPorInventario() {
		
	}
}
