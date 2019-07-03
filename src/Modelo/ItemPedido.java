package Modelo;

public class ItemPedido {
	private Producto producto;
	private int cant;
	
	public float calcularPrecio(){
		float precio;
			precio = this.producto.getPrecio() * cant;
		return precio;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	
}