package Evaluacion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GestionArticulosHashMapImpl implements GestionArticulo {

	HashMap<Integer, Articulo> inventario=null;
	
	

	public GestionArticulosHashMapImpl() {
		inventario = new HashMap<Integer, Articulo>();
	}

	@Override
	public void incluirArticulo(Articulo a) {
		inventario.put(a.getCodigo(), a);

	}

	@Override
	public void buscarArticulo(int codigo) {
		
		System.out.println(inventario.get(codigo));
		

	}

	@Override
	public void eliminarArticulo(int codigo) {
		if(inventario.containsKey(codigo)) {
			inventario.remove(codigo);
			System.out.println("Articulo eliminado");
		}else {
			System.out.println("Codigo no encontrado");
		}
		

	}

	@Override
	public void buscarPorDescricion(String descripcion) {
		
		for(Map.Entry<Integer,Articulo> entry : inventario.entrySet()) {
            if (entry.getValue().getDescripcion().toUpperCase().startsWith(descripcion.toUpperCase())) {
            	System.out.println(entry.getValue().toString());            }
        }
		
//		Iterator<String> buscar=(Iterator<String>) inventario.get(descripcion);
//		while(buscar.hasNext()==buscar.equals(buscar)) {
//			String encontrado=buscar.next();
//			System.out.println("La descripcion es" + encontrado);
//		}

	}

	@Override
	public void mostrarInventario() {
		Iterator<String> completo=(Iterator<String>) inventario.get(inventario);
		while(completo.hasNext()) {
			System.out.println(completo);
		}

	}

	@Override
	public void buscarPorIntervalo(double precioMayor,double precioMenor) {
		Iterator<Integer> igual=(Iterator<Integer>) inventario.get(inventario);
		if(((Articulo) igual).getPrecio()>=precioMenor && ((Articulo) igual).getPrecio()<=precioMayor) {
			System.out.println(igual);
		}

	}

}
