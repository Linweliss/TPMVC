package Controlador;

import java.awt.event.ActionListener;

import Modelo.Cliente;
import Modelo.Producto;
import Modelo.SistemaDeIndumentaria;
import Modelo.Vendedor;
import Vista.VentanaVentas;

public class ControladorVentas {
	private SistemaDeIndumentaria sistemaDeIndumentaria;
	private VentanaVentas ventanaVentas;

	public ControladorVentas(SistemaDeIndumentaria sistemaDeIndumentaria, VentanaVentas ventanaVentas) {
		this.sistemaDeIndumentaria = sistemaDeIndumentaria;
		this.ventanaVentas = ventanaVentas;
	}

	public void InitController() {
		for( ActionListener al : ventanaVentas.getBtnRegistrar().getActionListeners() ) {
			ventanaVentas.getBtnRegistrar().removeActionListener( al );
		}
		
		ventanaVentas.getBtnRegistrar().addActionListener(e -> registrarVenta());
		refrescarCombos();
		refresh();

	}

	private void registrarVenta() {
		Vendedor vendedor = null;
		Cliente cliente = null;
		Producto producto = null;
		for(int i = 0; i < this.sistemaDeIndumentaria.getVendedores().size(); i++){
			if(this.sistemaDeIndumentaria.getVendedores().get(i).getNombre() == ventanaVentas.getBoxVendedor().getSelectedItem()){
				vendedor = this.sistemaDeIndumentaria.getVendedores().get(i);
			}
		}
		for(int i = 0; i < this.sistemaDeIndumentaria.getProductos().size(); i++){
			if(this.sistemaDeIndumentaria.getProductos().get(i).getNombre() == ventanaVentas.getBoxProducto().getSelectedItem()){
				producto = this.sistemaDeIndumentaria.getProductos().get(i);
			}
		}
		for(int i = 0; i < this.sistemaDeIndumentaria.getClientes().size(); i++){
			if(this.sistemaDeIndumentaria.getClientes().get(i).getNombre() == ventanaVentas.getBoxCliente().getSelectedItem()){
				cliente = this.sistemaDeIndumentaria.getClientes().get(i);
			}
		}
		
		this.sistemaDeIndumentaria.agregarVenta(vendedor, cliente, producto, Integer.parseInt(ventanaVentas.getTxtCantidad().getText()));
		System.out.println("Agregue uno!");
		refresh();
	}
	
	private void refrescarCombos(){
		ventanaVentas.getBoxVendedor().removeAllItems();
		ventanaVentas.getBoxCliente().removeAllItems();
		ventanaVentas.getBoxProducto().removeAllItems();
		for(int i=0; i < this.sistemaDeIndumentaria.getClientes().size(); i++){
			ventanaVentas.getBoxCliente().addItem(this.sistemaDeIndumentaria.getClientes().get(i).getNombre());
		}
		for(int i=0; i < this.sistemaDeIndumentaria.getVendedores().size(); i++){
			ventanaVentas.getBoxVendedor().addItem(this.sistemaDeIndumentaria.getVendedores().get(i).getNombre());
		}
		for(int i=0; i < this.sistemaDeIndumentaria.getProductos().size(); i++){
			ventanaVentas.getBoxProducto().addItem(this.sistemaDeIndumentaria.getProductos().get(i).getNombre());
		}
		
	}
	
	private void refresh() {
		String matriz[][]= new String[sistemaDeIndumentaria.getVentas().size()][4];
		for(int i=0; i<sistemaDeIndumentaria.getVentas().size();i++) {
			//"Vendedor", "Cliente", "Producto", "Cantidad"
			matriz[i][0]=sistemaDeIndumentaria.getVentas().get(i).getVendedor().getNombre();
			matriz[i][1]=sistemaDeIndumentaria.getVentas().get(i).getCliente().getNombre();
			matriz[i][2]=sistemaDeIndumentaria.getVentas().get(i).getItemsVenta().get(0).getProducto().getNombre();
			matriz[i][3]=String.valueOf(sistemaDeIndumentaria.getVentas().get(i).getItemsVenta().get(0).getCant());
			
		}
		
		ventanaVentas.getTable().setModel( new javax.swing.table.DefaultTableModel(matriz, new String [] {"Vendedor", "Cliente", "Producto", "Cantidad"}));
		
	}
}
