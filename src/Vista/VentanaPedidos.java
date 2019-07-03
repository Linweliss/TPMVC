package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Modelo.Proveedor;

public class VentanaPedidos extends JFrame{
	/**
	 * 
	 */
	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}

	public JComboBox<String> getBoxProveedor() {
		return box;
	}
	
	public void setBoxProveedor(JComboBox<String> comboBox) {
		this.box  = comboBox;
	}
	
	public JTextField getTxtProveedor() {
		return txtProveedor;
	}
	public void setTxtProveedor(JTextField txtProveedor) {
		this.txtProveedor = txtProveedor;
	}
	
	private static final long serialVersionUID = 1L;
	//TITULO
	private String titulo = "Pedidos";
	//BOTONES
	private JTable table;
	private JTextField txtNroPedido;
	private JTextField txtEstado;
	private JTextField txtFecha;
	private JTextField txtProveedor;
	JButton btnRegistrar;
	private JScrollPane scrollPane;
    private JComboBox<String> box;
    private String[] proveedoresPrueba;

	//
	public VentanaPedidos(){
	
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
					"NroPedido", "Estado", "Fecha", "Pedidos", "Proveedor"
				}
			));
			
			JLabel lblProveedor = new JLabel("Proveedor:");
			lblProveedor.setBounds(10, 11, 129, 14);
			getContentPane().add(lblProveedor);
			
			proveedoresPrueba = new String[]{"Proveedor 1", "Proveedor 2", "Proveedor 3","Proveedor 4", "Proveedor 5"};
			box = new JComboBox<>(proveedoresPrueba);
			box.setBounds(149, 8, 194, 20);
			getContentPane().add(box);
/*
			txtProveedor = new JTextField();
			txtProveedor.setColumns(10);
			txtProveedor.setBounds(149, 98, 194, 20);
			getContentPane().add(txtProveedor);
			*/
			btnRegistrar = new JButton("Registrar");
			btnRegistrar.setBounds(353, 7, 89, 23);
			getContentPane().add(btnRegistrar);
		
	}
}