package Vista;

import javax.swing.*;

import java.awt.*;

public class VentanaPrincipal extends JFrame{
	private static final long serialVersionUID = 1L;

	//TITULO
	private String titulo = "Ventana principal";
	
	//BOTONES
	private JButton btnVentas;
	public JButton getBtnVentas() {
		return btnVentas;
	}


	public void setBtnVentas(JButton btnVentas) {
		this.btnVentas = btnVentas;
	}


	public JButton getBtnPedidos() {
		return btnPedidos;
	}


	public void setBtnPedidos(JButton btnPedidos) {
		this.btnPedidos = btnPedidos;
	}


	public JButton getBtnVendedores() {
		return btnVendedores;
	}


	public void setBtnVendedores(JButton btnVendedores) {
		this.btnVendedores = btnVendedores;
	}


	public JButton getBtnClientes() {
		return btnClientes;
	}


	public void setBtnClientes(JButton btnClientes) {
		this.btnClientes = btnClientes;
	}


	public JButton getBtnProveedores() {
		return btnProveedores;
	}


	public void setBtnProveedores(JButton btnProveedores) {
		this.btnProveedores = btnProveedores;
	}


	public JButton getBtnProductos() {
		return btnProductos;
	}


	public void setBtnProductos(JButton btnProductos) {
		this.btnProductos = btnProductos;
	}


	private JButton btnPedidos;
	private JButton btnVendedores;
	private JButton btnClientes;
	private JButton btnProveedores;
	private JButton btnProductos;

	//LABELS
	private JLabel lblDescripcionVentana; 

	
	public VentanaPrincipal(){
		//this.setVisible(true);
		this.setTitle(titulo);
		this.setSize(300,300);
		
		Container panel=this.getContentPane();
		//LABELS
		lblDescripcionVentana = new JLabel("Seleccione la opción deseada:");
		
		//BOTONES
		btnClientes = new JButton("Clientes");
		btnPedidos = new JButton("Pedidos");
		btnProductos = new JButton("Productos");
		btnProveedores = new JButton("Proveedores");
		btnVendedores = new JButton("Vendedores");
		btnVentas = new JButton("Ventas");

		panel.setLayout(new GridLayout(7,0,6,6));
		panel.add(lblDescripcionVentana);
		panel.add(btnClientes);
		panel.add(btnPedidos);
		panel.add(btnProductos);
		panel.add(btnProveedores);
		panel.add(btnVendedores);
		panel.add(btnVentas);	
		setDefaultCloseOperation (EXIT_ON_CLOSE);
	}

}