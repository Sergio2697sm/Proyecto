package Evaluacion;

public class ArticuloALimentario extends Articulo {

	private int calorias;

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public ArticuloALimentario() {
		super();
		
	}

	public ArticuloALimentario(int codigo, String descripcion, double precio, int iva) {
		super(codigo, descripcion, precio, iva);
		
	}

	@Override
	public String toString() {
		return "ArticuloALimentario [calorias=" + calorias + ", getCalorias()=" + getCalorias() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
