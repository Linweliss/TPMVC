package Modelo;

public class Producto {
	private String nombre;
	private int codigo;
	private String Descripcion;
	private String color;
	private String talle;
	private float precio;
	private int stock;
	


	public Producto(int codigo, String color, String descripcion, String nombre, float precio, int stock,
			String talle) {
		super();
		this.codigo = codigo;
		this.color = color;
		Descripcion = descripcion;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.talle = talle;
	}

	public void modificarPrecio(float precio){
		this.setPrecio(precio);
	}
	
	public boolean soyElProducto(String nombre, String color, String talle){
		if(nombre == this.nombre && color == this.color && talle == this.talle){
			return true;
		}else {
			return false;
		}
	}
	
	public boolean tengoStock(){
		return this.getStock()>0;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTalle() {
		return talle;
	}
	public void setTalle(String talle) {
		this.talle = talle;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}