package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VentanaPedidos extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//TITULO
	private String titulo = "Pedidos";
	//BOTONES
	private JTable table;
	private JTextField txtNroPedido;
	private JTextField txtLocalidad;
	private JTextField txtMail;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JButton btnRegistrar;
	private JScrollPane scrollPane;
	//
	public VentanaPedidos(){
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
				"Nombre", "Cuil", "Localidad", "Mail", "Tel\u00E9fono"
			}
		));
		
		JLabel lblCuil = new JLabel("Cuil:");
		lblCuil.setBounds(10, 11, 129, 14);
		getContentPane().add(lblCuil);
		
		txtNroPedido = new JTextField();
		txtNroPedido.setBounds(149, 8, 194, 20);
		getContentPane().add(txtNroPedido);
		txtNroPedido.setColumns(10);
		
		txtLocalidad = new JTextField();
		txtLocalidad.setColumns(10);
		txtLocalidad.setBounds(149, 39, 194, 20);
		getContentPane().add(txtLocalidad);
		
		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setBounds(10, 39, 129, 14);
		getContentPane().add(lblLocalidad);
		
		txtMail = new JTextField();
		txtMail.setColumns(10);
		txtMail.setBounds(149, 67, 194, 20);
		getContentPane().add(txtMail);
		
		JLabel lblMail = new JLabel("Mail:");
		lblMail.setBounds(10, 70, 129, 14);
		getContentPane().add(lblMail);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(149, 98, 194, 20);
		getContentPane().add(txtNombre);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 101, 129, 14);
		getContentPane().add(lblNombre);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(149, 129, 194, 20);
		getContentPane().add(txtTelefono);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setBounds(10, 133, 129, 14);
		getContentPane().add(lblTelfono);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(353, 7, 89, 23);
		getContentPane().add(btnRegistrar);
	}
}