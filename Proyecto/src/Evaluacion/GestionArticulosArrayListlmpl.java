package Evaluacion;

import java.util.ArrayList;

public class GestionArticulosArrayListlmpl implements GestionArticulo {

	private ArrayList<Articulo> inventario=new ArrayList<Articulo>();

	public GestionArticulosArrayListlmpl(ArrayList<Articulo> inventario) {
		super();
		this.inventario = inventario;
	}

	@Override
	public void incluirArticulo(Articulo a) {
		inventario.add(a);
		
	}


	@Override
	public void buscarArticulo(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarArticulo(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarPorDescricion(String descripcion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarInventario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarPorInventario() {
		// TODO Auto-generated method stub
		
	}
	
	
}
