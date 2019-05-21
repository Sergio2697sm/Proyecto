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

	public ArticuloALimentario(String descripcion, double precio, int iva,int calorias) {
		super(descripcion, precio, iva);
		this.calorias=calorias;
		
	}

	@Override
	public String toString() {
		return "ArticuloALimentario [calorias=" + calorias + ", getCalorias()=" + getCalorias() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
