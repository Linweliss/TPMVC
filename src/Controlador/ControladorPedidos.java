package Controlador;

import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import Modelo.Producto;
import Modelo.Proveedor;
import Modelo.SistemaDeIndumentaria;
import Vista.VentanaPedidos;

public class ControladorPedidos {
	private SistemaDeIndumentaria sistemaDeIndumentaria;
	private VentanaPedidos ventanaPedidos;

	public ControladorPedidos(SistemaDeIndumentaria sistemaDeIndumentaria, VentanaPedidos ventanaPedidos) {
		this.sistemaDeIndumentaria = sistemaDeIndumentaria;
		this.ventanaPedidos = ventanaPedidos;
	}

	public void InitController() {
		for( ActionListener al : ventanaPedidos.getBtnRegistrar().getActionListeners() ) {
			ventanaPedidos.getBtnRegistrar().removeActionListener( al );
		}
		ventanaPedidos.getBtnRegistrar().addActionListener(e -> registrarPedido());
		refrescarCombos();
		refresh();

	}

	private void registrarPedido() {
		Proveedor proveedor = null;
		Producto producto = null;
		for(int i = 0; i < this.sistemaDeIndumentaria.getProveedores().size(); i++){
			if(this.sistemaDeIndumentaria.getProveedores().get(i).getNombre() == ventanaPedidos.getBoxProveedor().getSelectedItem()){
				proveedor = this.sistemaDeIndumentaria.getProveedores().get(i);
			}
		}
		for(int i = 0; i < this.sistemaDeIndumentaria.getProductos().size(); i++){
			if(this.sistemaDeIndumentaria.getProductos().get(i).getNombre() == ventanaPedidos.getBoxProducto().getSelectedItem()){
				producto = this.sistemaDeIndumentaria.getProductos().get(i);
			}
		}
		
		
		this.sistemaDeIndumentaria.agregarPedido(proveedor, producto, Integer.parseInt(ventanaPedidos.getTxtCantidad().getText()));
		refresh();
	}

	
	private void refrescarCombos(){
		ventanaPedidos.getBoxEstado().removeAllItems();
		ventanaPedidos.getBoxEstado().addItem("PENDIENTE");
		ventanaPedidos.getBoxEstado().addItem("CERRADA");
		ventanaPedidos.getBoxProducto().removeAllItems();
		ventanaPedidos.getBoxProveedor().removeAllItems();
		for(int i=0; i < this.sistemaDeIndumentaria.getProductos().size(); i++){
			ventanaPedidos.getBoxProducto().addItem(this.sistemaDeIndumentaria.getProductos().get(i).getNombre());
		}
		for(int i=0; i < this.sistemaDeIndumentaria.getProveedores().size(); i++){
			ventanaPedidos.getBoxProveedor().addItem(this.sistemaDeIndumentaria.getProveedores().get(i).getNombre());
		}
		
	}
	
	private void refresh() {
		String matriz[][]= new String[sistemaDeIndumentaria.getPedidos().size()][6];
		for(int i=0; i<sistemaDeIndumentaria.getPedidos().size();i++) {
			//"NroPedido", "Estado", "Fecha", "Producto","Cantidad", "Proveedor"
			matriz[i][0]=String.valueOf(sistemaDeIndumentaria.getPedidos().get(i).getNroPedido());
			matriz[i][1]=sistemaDeIndumentaria.getPedidos().get(i).getEstado();
			matriz[i][2]=String.valueOf(sistemaDeIndumentaria.getPedidos().get(i).getFecha());
			matriz[i][3]=sistemaDeIndumentaria.getPedidos().get(i).getItemsPedido().get(0).getProducto().getNombre();
			matriz[i][4]=String.valueOf(sistemaDeIndumentaria.getPedidos().get(i).getItemsPedido().get(0).getCant());
			matriz[i][5]=sistemaDeIndumentaria.getPedidos().get(i).getProveedor().getNombre();

			
		}
		
		ventanaPedidos.getTable().setModel( new javax.swing.table.DefaultTableModel(matriz, new String [] {"NroPedido", "Estado", "Fecha", "Producto","Cantidad", "Proveedor"}));
		
	}

}
