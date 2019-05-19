package Evaluacion;

import java.util.ArrayList;

public class GestionArticulosArrayListlmpl implements gestionArticulo {

	private ArrayList<Articulo> inventario=new ArrayList<Articulo>();

	public GestionArticulosArrayListlmpl(ArrayList<Articulo> inventario) {
		super();
		this.inventario = inventario;
	}
	
	
}
