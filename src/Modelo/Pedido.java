package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	private int nroPedido;
	private int cantidad;
	private String estado;
	private Date fecha;
	private ArrayList<ItemPedido> itemsPedido;
	private Proveedor proveedor;
	
	
	public Pedido(int nroPedido, String estado, Proveedor proveedor) {
		super();
		this.nroPedido = nroPedido;
		this.estado = estado;
		this.fecha = new Date();
		itemsPedido = new ArrayList<ItemPedido>();
		this.proveedor = proveedor;
	}

	public void agregarItem(ItemPedido itemPedido){
		itemsPedido.add(itemPedido);
	}
	
	public float calcularTotal(){
		float total = 0;
		 for(ItemPedido item: this.getItemsPedido()){
			 total += item.calcularPrecio();			 
		 }
		
		return total;
	}
	public int getNroPedido() {
		return nroPedido;
	}
	public void setNroPedido(int nroPedido) {
		this.nroPedido = nroPedido;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public ArrayList<ItemPedido> getItemsPedido() {
		return itemsPedido;
	}
	public void setItemsPedido(ArrayList<ItemPedido> itemsPedido) {
		this.itemsPedido = itemsPedido;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
}