package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VentanaProveedores extends JFrame {
	private static final long serialVersionUID = 1L;
	private String titulo = "Proveedores";
	private JTable table;
	private JTextField txtCuil;
	private JTextField txtMail;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JButton btnRegistrar;
	private JScrollPane scrollPane;
	
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

	public JTextField getTxtCuil() {
		return txtCuil;
	}

	public void setTxtCuil(JTextField txtCuil) {
		this.txtCuil = txtCuil;
	}

	public JTextField getTxtMail() {
		return txtMail;
	}

	public void setTxtMail(JTextField txtMail) {
		this.txtMail = txtMail;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtTelefono() {
		return txtTelefono;
	}

	public void setTxtTelefono(JTextField txtTelefono) {
		this.txtTelefono = txtTelefono;
	}
	
	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}

	public void setBtnRegistrar(JButton btnRegistrar) {
		this.btnRegistrar = btnRegistrar;
	}
	
	public VentanaProveedores(){
		//this.setVisible(true);
		this.setTitle(titulo);
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
				"Nombre", "Cuil", "Localidad", "Tel\u00E9fono"
			}
		));
		
		JLabel lblCuil = new JLabel("Cuil:");
		lblCuil.setBounds(10, 11, 129, 14);
		getContentPane().add(lblCuil);
		
		txtCuil = new JTextField();
		txtCuil.setBounds(149, 8, 194, 20);
		getContentPane().add(txtCuil);
		txtCuil.setColumns(10);
		
		txtMail = new JTextField();
		txtMail.setColumns(10);
		txtMail.setBounds(149, 36, 194, 20);
		getContentPane().add(txtMail);
		
		JLabel lblMail = new JLabel("Mail:");
		lblMail.setBounds(10, 39, 129, 14);
		getContentPane().add(lblMail);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(149, 67, 194, 20);
		getContentPane().add(txtNombre);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 70, 129, 14);
		getContentPane().add(lblNombre);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(149, 98, 194, 20);
		getContentPane().add(txtTelefono);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setBounds(10, 102, 129, 14);
		getContentPane().add(lblTelfono);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(353, 7, 89, 23);
		getContentPane().add(btnRegistrar);
	}
}

