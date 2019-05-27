package Evaluacion;

import java.util.HashMap;
import java.util.Iterator;

public class GestionArticulosHashMapImpl implements GestionArticulo {

	HashMap<String, Articulo> inventario;

	@Override
	public void incluirArticulo(Articulo a) {
		inventario = new HashMap<String, Articulo>();

	}

	@Override
	public void buscarArticulo(int codigo) {
		Iterator<String> buscar = inventario.keySet().iterator();
		while (buscar.hasNext()) {
			String clave = buscar.next();
			Articulo valor = inventario.get(clave);
			System.out.println(valor);
		}

	}

	@Override
	public void eliminarArticulo(int codigo) {
		Iterator<String> borrar = inventario.keySet().iterator();
		while (borrar.hasNext()) {
			borrar.remove();
			System.out.println("Articulo eliminado");
		}

	}

	@Override
	public void buscarPorDescricion(String descripcion) {
		Iterator<String> buscar=(Iterator<String>) inventario.get(descripcion);
		while(buscar.hasNext()) {
			String encontrado=buscar.next();
			System.out.println("La descripcion es" + encontrado);
		}

	}

	@Override
	public void mostrarInventario() {
		Iterator<String> completo=(Iterator<String>) inventario.get(inventario);
		while(completo.hasNext()) {
			System.out.println(completo);
		}

	}

	@Override
	public void buscarPorInventario() {
		// TODO Auto-generated method stub

	}

}
