package Modelo;

import java.util.ArrayList;

public class SistemaDeIndumentaria {
	private ArrayList<Cliente> clientes;
	private ArrayList<Proveedor> proveedores;
	private ArrayList<Vendedor> vendedores;
	private ArrayList<Venta> ventas;
	private ArrayList<Pedido> pedidos;
	private ArrayList<Producto> productos;
	int nroVenta = 0;
	int nroPedido = 0;
	
    private static SistemaDeIndumentaria single_instance = null; 
    
    public SistemaDeIndumentaria(){
    	ventas = new ArrayList<Venta>();
    	pedidos = new ArrayList<Pedido>();
    	clientes = new ArrayList<Cliente>();
    	proveedores = new ArrayList<Proveedor>();
    	vendedores = new ArrayList<Vendedor>();
    	productos = new ArrayList<Producto>();
    }

	public static SistemaDeIndumentaria getInstance() 
	{ 
	        if (single_instance == null) 
	            single_instance = new SistemaDeIndumentaria(); 
	  
	        return single_instance; 
	} 
	
	public void cerrarVenta(int nroVenta) {
		for(Venta venta : ventas){
			if(venta.getNroVenta() == nroVenta){
				venta.setEstado("CERRADA");
			}
		}
	
	}
	
	public Venta agregarVenta(Vendedor vendedor, Cliente cliente, Producto producto, int cantidad) {
		Venta venta = new Venta(++nroVenta,"PENDIENTE", vendedor, cliente );
		ItemVenta itemVenta = new ItemVenta();
		itemVenta.setCant(cantidad);
		itemVenta.setProducto(producto);
		venta.agregarItem(itemVenta);
		ventas.add(venta);
		//cliente.getVentasCliente().add(venta);
		return venta;
	}
	
	public Pedido agregarPedido(Proveedor proveedor, Producto producto, int cantidad) {
		Pedido pedido = new Pedido(++nroPedido,"PENDIENTE",proveedor);
		ItemPedido itemPedido = new ItemPedido();
		itemPedido.setCant(cantidad);
		itemPedido.setProducto(producto);
	
		pedido.agregarItem(itemPedido);
		this.getPedidos().add(pedido);
		//proveedor.getPedidosProveedor().add(pedido);
		return pedido;
	}
	
	public void agregarCliente(String nombre, String mail, String localidad, String telefono, String cuil) {
		Cliente cliente = new Cliente(nombre, mail, localidad, telefono, cuil);
		this.getClientes().add(cliente);
	}
	
	public void modificarCliente(String nombre, String mail, String localidad, String telefono, String cuil) {
		for(Cliente cliente: clientes){
			if(cliente.soyCliente(cuil)){
				cliente.setLocalidad(localidad);
				cliente.setMail(mail);
				cliente.setNombre(nombre);
				cliente.setTelefono(telefono);
			}
		}
	}
	
	public void agregarVendedor(String nombre, String mail, String telefono, String cuil, float comision) {
		Vendedor vendedor = new Vendedor(nombre, telefono, mail, comision, cuil);
		this.getVendedores().add(vendedor);
	}
	
	public void quitarVendedor(String cuil) {
		for(Vendedor vendedor : vendedores){
			if(vendedor.soyElVendedor(cuil)){
				vendedores.remove(vendedor);
			}
		}
	
	}
	
	public void quitarProveedor(String cuil) {
		for(Proveedor proveedor: proveedores){
			if(proveedor.soyElProveedor(cuil)){
				proveedores.remove(proveedor);
			}
		}
	
	}
	
	public void quitarCliente(String cuil) {
		for (Cliente cliente : clientes){
			if(cliente.soyCliente(cuil)){
				clientes.remove(cliente);
			}
		}
	
	}
	
	public void agregarProveedor(String nombre, String mail, String telefono, String cuil) {
		Proveedor proveedor = new Proveedor(nombre, mail, telefono, cuil);
		this.proveedores.add(proveedor);
		
	}
	
	public void agregarProducto(int codigo, String color, String descripcion, String nombre, float precio, int stock, String talle) {
		Producto producto = new Producto(codigo, color, descripcion, nombre, precio, stock, talle);
		this.productos.add(producto);
		
	}
	
	public void modificarProveedor(String nombre, String mail, String telefono, String cuil) {
		for(Proveedor proveedor: proveedores){
			if(proveedor.soyElProveedor(cuil)){
				proveedor.setMail(mail);
				proveedor.setNombre(nombre);
				proveedor.setTelefono(telefono);
			}
		}
	}
	
	public void modificarVendedor(String nombre, String mail, String telefono, String cuil, float comision) {
		for(Vendedor vendedor: vendedores){
			if(vendedor.soyElVendedor(cuil)){
				vendedor.setComision(comision);
				vendedor.setMail(mail);
				vendedor.setTelefono(telefono);
				vendedor.setNombre(nombre);
			}
		}
	}
	
	
	
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Proveedor> getProveedores() {
		return proveedores;
	}

	public void setProveedores(ArrayList<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}

	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(ArrayList<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	public ArrayList<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(ArrayList<Venta> ventas) {
		this.ventas = ventas;
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}