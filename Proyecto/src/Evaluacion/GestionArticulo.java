package Evaluacion;

public interface GestionArticulo {


	void incluirArticulo(Articulo a);

	void buscarArticulo(int codigo);

	void eliminarArticulo(int codigo);

	void buscarPorDescricion(String descripcion);

	void mostrarInventario();

	void buscarPorIntervalo(double precioMayor,double precioMenor);
}
