package Evaluacion;

public class ArticuloNoAlimentario extends Articulo {

	private int peso;

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public ArticuloNoAlimentario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArticuloNoAlimentario(String descripcion, double precio, int iva, int peso) {
		super(descripcion, precio, iva);

		this.peso = peso;
	}
	
	

	@Override
	public String toString() {
		return "ArticuloNoAlimentario [peso=" + peso + "]";
	}

}
