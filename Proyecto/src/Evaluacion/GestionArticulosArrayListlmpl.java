package Evaluacion;

import java.util.ArrayList;

public class GestionArticulosArrayListlmpl implements GestionArticulo {

	private ArrayList<Articulo> inventario=null;

	public GestionArticulosArrayListlmpl() {
		
		inventario=new ArrayList<Articulo>();
	}

	@Override
	public void incluirArticulo(Articulo a) {
		inventario.add(a);
		
	}


	@Override
	public void buscarArticulo(int codigo) {
		for (Articulo recorrido : inventario) {
			if(recorrido.getCodigo()==codigo) {
				System.out.println(recorrido);
			}
		}
		
		
	}

	@Override
	public void eliminarArticulo(int codigo) {

		for (Articulo recorrido : inventario) {
			if(recorrido.getCodigo()==codigo) {
				recorrido=null;
			}
		}
		
	}

	@Override
	public void buscarPorDescricion(String descripcion) {

		for (Articulo igual : inventario) {
			if(igual.getDescripcion()==descripcion) {
				System.out.println(igual);
			}
		}
		
	}

	@Override
	public void mostrarInventario() {
		for (Articulo articulo : inventario) {
			System.out.println(articulo);
		}
		
	}

	@Override
	public void buscarPorIntervalo(double precioMayor,double precioMenor) {
		for (Articulo igual : inventario) {
			if(igual.getPrecio()>=precioMenor && igual.getPrecio()<=precioMayor) {
				System.out.println(igual);
			}
		
	}
	
	}
}
