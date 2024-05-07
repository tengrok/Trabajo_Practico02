package ar.edu.unju.fi.ejercicio5.model;

public class Producto {
	private int codigo;
	private String descripcion;
	private double precioUnitario;
	private categoriaProducto categoria;
	private origenFabricacion origen;
	private boolean estado;
	
	public enum categoriaProducto{
		TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS
	}
	
	public enum origenFabricacion {
		ARGENTINA, CHILE, BRASIL, URUGUAY
	}
	
	public Producto(int codigo, String descripcion, double precioUnitario, categoriaProducto categoria,
			origenFabricacion origen, boolean estado) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.categoria = categoria;
		this.origen = origen;
		this.estado = estado;
	}

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

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public categoriaProducto getCategoria() {
		return categoria;
	}

	public void setCategoria(categoriaProducto categoria) {
		this.categoria = categoria;
	}

	public origenFabricacion getOrigen() {
		return origen;
	}

	public void setOrigen(origenFabricacion origen) {
		this.origen = origen;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nCodigo del Producto: ").append(getCodigo());
		sb.append("\nDescripcion del Producto: ").append(getDescripcion());
		sb.append("\nPrecio Unitario del Producto: ").append(getPrecioUnitario());
		sb.append("\nCategoria del Producto: ").append(getCategoria());
		sb.append("\nOrigen del Producto: ").append(getOrigen());
		sb.append("\nEstado :").append(estado);
		return sb.toString();
	}
}