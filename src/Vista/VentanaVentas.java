package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaVentas extends JFrame {

	private static final long serialVersionUID = 1L;
	private String titulo = "Clientes";
	private JTable table;
	private JTextField txtCantidad;
	private JButton btnRegistrar;
	private JScrollPane scrollPane;
	private JComboBox<String> boxVendedor;
	private JComboBox<String> boxCliente;
	private JComboBox<String> boxProducto;
	
	public JTextField getTxtCantidad() {
		return txtCantidad;
	}

	public void setTxtCantidad(JTextField txtCantidad) {
		this.txtCantidad = txtCantidad;
	}

	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}

	public void setBtnRegistrar(JButton btnRegistrar) {
		this.btnRegistrar = btnRegistrar;
	}

	public JComboBox<String> getBoxVendedor() {
		return boxVendedor;
	}

	public void setBoxVendedor(JComboBox<String> boxVendedor) {
		this.boxVendedor = boxVendedor;
	}

	public JComboBox<String> getBoxCliente() {
		return boxCliente;
	}

	public void setBoxCliente(JComboBox<String> boxCliente) {
		this.boxCliente = boxCliente;
	}

	public JComboBox<String> getBoxProducto() {
		return boxProducto;
	}

	public void setBoxProducto(JComboBox<String> boxProducto) {
		this.boxProducto = boxProducto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	
	public VentanaVentas(){
		//this.setVisible(true);
		this.setTitle("Ventas");
		this.setSize(480,401);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 161, 444, 198);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Vendedor", "Cliente", "Producto", "Cantidad"
			}
		));
		
		JLabel lblCuil = new JLabel("Vendedor");
		lblCuil.setBounds(10, 11, 129, 14);
		getContentPane().add(lblCuil);
		
		JLabel lblLocalidad = new JLabel("Cliente:");
		lblLocalidad.setBounds(10, 39, 129, 14);
		getContentPane().add(lblLocalidad);
		
		JLabel lblMail = new JLabel("Producto:");
		lblMail.setBounds(10, 70, 129, 14);
		getContentPane().add(lblMail);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(149, 98, 194, 20);
		getContentPane().add(txtCantidad);
		
		JLabel lblNombre = new JLabel("Cantidad:");
		lblNombre.setBounds(10, 101, 129, 14);
		getContentPane().add(lblNombre);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(353, 7, 89, 23);
		getContentPane().add(btnRegistrar);
		
		boxVendedor = new JComboBox<String>();
		boxVendedor.setBounds(149, 8, 194, 20);
		getContentPane().add(boxVendedor);
		
		boxCliente = new JComboBox<String>();
		boxCliente.setBounds(149, 36, 194, 20);
		getContentPane().add(boxCliente);
		
		boxProducto = new JComboBox<String>();
		boxProducto.setBounds(149, 67, 194, 20);
		getContentPane().add(boxProducto);
	}
}