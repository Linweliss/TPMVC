package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {
	private int nroVenta;
	private Date fecha;
	private String estado;
	private ArrayList<ItemVenta> itemsVenta;
	private Vendedor vendedor;
	private Cliente cliente;
	
	public Venta(int nroVenta, String estado, Vendedor vendedor,Cliente cliente) {
		this.nroVenta = nroVenta;
		this.fecha = new Date();
		this.estado = estado;
		itemsVenta =  new ArrayList<ItemVenta>();
		this.vendedor = vendedor;
		this.cliente = cliente;
	}

	public void agregarItem(ItemVenta itemVenta){
		this.itemsVenta.add(itemVenta);
	}
	
	public float calcularTotal(){
		float total = 0;
		 for(ItemVenta item: this.getItemsVenta()){
			 total += item.calcularPrecio();			 
		 }
		
		return total;
	}
	
	public float calcularComision(){
		float comision;
			comision = calcularTotal() * this.getVendedor().getComision();
		return comision;
	}
	public int getNroVenta() {
		return nroVenta;
	}
	public void setNroVenta(int nroVenta) {
		this.nroVenta = nroVenta;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public List<ItemVenta> getItemsVenta() {
		return itemsVenta;
	}
	public void setItemsVenta(ArrayList<ItemVenta> itemsVenta) {
		this.itemsVenta = itemsVenta;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}