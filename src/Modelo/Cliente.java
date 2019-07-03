package Modelo;
import java.util.ArrayList;


public class Cliente {
	private String nombre;
	private String mail;
	private String localidad;
	private String telefono;
	private String cuil;
	private ArrayList <Venta> ventasCliente;
	
	public Cliente(String nombre, String mail, String localidad, String telefono, String cuil){
		this.cuil= cuil;
		this.nombre= nombre;
		this.localidad = localidad;
		this.telefono = telefono;
		this.mail = mail;
		this.ventasCliente = new ArrayList<Venta>();
	}
	public boolean soyCliente( String cuil){
		return cuil == this.cuil;
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
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
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
	
	public boolean soyElCliente (String cuil){
		return this.cuil == cuil;
	}
	public ArrayList <Venta> getVentasCliente() {
		return ventasCliente;
	}
	public void setVentasCliente(ArrayList <Venta> ventasCliente) {
		this.ventasCliente = ventasCliente;
	}
}