package Evaluacion;

public abstract class Articulo {

	protected int codigo;
	protected String descripcion;
	protected double precio;
	protected int iva;

	private static int codigoActual = 1;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public Articulo() {
		super();
		codigo = codigoActual;
		codigoActual++;
	}

	public Articulo(String descripcion, double precio, int iva) {
		super();
		codigo = codigoActual;
		codigoActual++;
		this.descripcion = descripcion;
		this.precio = precio;
		this.iva = iva;
	}

	@Override
	public String toString() {
		return "CODIGO: " + codigo + "- DESCRIPCION " + descripcion + "- PRECIO: " + precio + "-iVA" + iva + "%]";
	}

}
