package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Modelo.Proveedor;

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
	private JTextField txtEstado;
	private JTextField txtFecha;
	private JTextField txtProveedor;
	JButton btnRegistrar;
	private JScrollPane scrollPane;
    private JComboBox<String> box;
    private String[] distros;

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
			
			distros = new String[]{"Ubuntu", "Redhat", "Arch ","Debian", "Mint"};
			box = new JComboBox<>(distros);
			box.setBounds(149, 67, 194, 20);
			getContentPane().add(box);
		
	}
}