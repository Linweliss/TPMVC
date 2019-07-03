package Modelo;

import java.util.ArrayList;

public class Proveedor {

	private String nombre;
	private String mail;
	private String telefono;
	private String cuil;
	private ArrayList<Pedido> pedidosProveedor;
	
	
	public Proveedor(String nombre, String mail, String telefono, String cuil) {
		this.nombre = nombre;
		this.mail = mail;
		this.telefono = telefono;
		this.cuil = cuil;
		this.pedidosProveedor = new ArrayList<Pedido>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	
	public boolean soyElProveedor(String cuil){
		return this.cuil == cuil;
	}
	public ArrayList<Pedido> getPedidosProveedor() {
		return pedidosProveedor;
	}
	public void setPedidosProveedor(ArrayList<Pedido> pedidosProveedor) {
		this.pedidosProveedor = pedidosProveedor;
	}
	
}