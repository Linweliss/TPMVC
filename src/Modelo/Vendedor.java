package Modelo;

public class Vendedor {
	private String nombre;
	private String telefono;
	private String mail;
	private float comision;
	private String cuil;
	
	
	
	public Vendedor(String nombre, String telefono, String mail, float comision, String cuil) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.mail = mail;
		this.comision = comision;
		this.cuil = cuil;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public float getComision() {
		return comision;
	}
	public void setComision(float comision) {
		this.comision = comision;
	}
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	
	public boolean soyElVendedor(String cuil){
		return this.cuil == cuil;
	}
}