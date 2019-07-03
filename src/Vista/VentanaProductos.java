package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VentanaProductos extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//TITULO
	private String titulo = "Productos";
	private JTextField txtCodigo;
	private JTextField txtColor;
	private JTextField txtDescripcion;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JTextField txtStock;
	private JTextField txtTalle;
	private JTable table;
	private JButton btnRegistrar;
	
	//Getters y setters
	public JTextField getTxtCodigo() {
		return txtCodigo;
	}

	public void setTxtCodigo(JTextField txtCodigo) {
		this.txtCodigo = txtCodigo;
	}

	public JTextField getTxtColor() {
		return txtColor;
	}

	public void setTxtColor(JTextField txtColor) {
		this.txtColor = txtColor;
	}

	public JTextField getTxtDescripcion() {
		return txtDescripcion;
	}

	public void setTxtDescripcion(JTextField txtDescripcion) {
		this.txtDescripcion = txtDescripcion;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtPrecio() {
		return txtPrecio;
	}

	public void setTxtPrecio(JTextField txtPrecio) {
		this.txtPrecio = txtPrecio;
	}

	public JTextField getTxtStock() {
		return txtStock;
	}

	public void setTxtStock(JTextField txtStock) {
		this.txtStock = txtStock;
	}

	public JTextField getTxtTalle() {
		return txtTalle;
	}

	public void setTxtTalle(JTextField txtTalle) {
		this.txtTalle = txtTalle;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}

	public void setBtnRegistrar(JButton btnRegistrar) {
		this.btnRegistrar = btnRegistrar;
	}
	
	
	public VentanaProductos(){
		//this.setVisible(true);
		this.setTitle(titulo);
		this.setSize(480,401);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo:");
		lblNewLabel.setBounds(10, 11, 112, 14);
		getContentPane().add(lblNewLabel);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(132, 8, 194, 20);
		getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(10, 39, 112, 14);
		getContentPane().add(lblColor);
		
		txtColor = new JTextField();
		txtColor.setColumns(10);
		txtColor.setBounds(132, 36, 194, 20);
		getContentPane().add(txtColor);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(10, 67, 112, 14);
		getContentPane().add(lblDescripcion);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(132, 64, 194, 20);
		getContentPane().add(txtDescripcion);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 95, 112, 14);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(132, 92, 194, 20);
		getContentPane().add(txtNombre);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(10, 123, 112, 14);
		getContentPane().add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(132, 120, 194, 20);
		getContentPane().add(txtPrecio);
		
		JLabel lblStock = new JLabel("Stock:");
		lblStock.setBounds(10, 151, 112, 14);
		getContentPane().add(lblStock);
		
		txtStock = new JTextField();
		txtStock.setColumns(10);
		txtStock.setBounds(132, 148, 194, 20);
		getContentPane().add(txtStock);
		
		JLabel lblTalle = new JLabel("Talle:");
		lblTalle.setBounds(10, 179, 112, 14);
		getContentPane().add(lblTalle);
		
		txtTalle = new JTextField();
		txtTalle.setColumns(10);
		txtTalle.setBounds(132, 176, 194, 20);
		getContentPane().add(txtTalle);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 207, 444, 145);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Color", "Descripcion", "Nombre", "Precio", "Stock", "Talle"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(76);
		scrollPane.setViewportView(table);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(336, 175, 89, 23);
		getContentPane().add(btnRegistrar);
	}
}

