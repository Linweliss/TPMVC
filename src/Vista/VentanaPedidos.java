package Vista;

import java.time.LocalDate;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Modelo.Proveedor;

public class VentanaPedidos extends JFrame{
	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JTextField getTxtNroPedido() {
		return txtNroPedido;
	}

	public void setTxtNroPedido(JTextField txtNroPedido) {
		this.txtNroPedido = txtNroPedido;
	}

	public JTextField getTxtCantidad() {
		return txtCantidad;
	}

	public void setTxtCantidad(JTextField txtCantidad) {
		this.txtCantidad = txtCantidad;
	}

	public JComboBox<String> getBoxEstado() {
		return boxEstado;
	}

	public void setBoxEstado(JComboBox<String> boxEstado) {
		this.boxEstado = boxEstado;
	}

	public JComboBox<String> getBoxProducto() {
		return boxProducto;
	}

	public void setBoxProducto(JComboBox<String> boxProducto) {
		this.boxProducto = boxProducto;
	}

	/**
	 * 
	 */
	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}

	public JComboBox<String> getBoxProveedor() {
		return boxProveedor;
	}
	
	public void setBoxProveedor(JComboBox<String> comboBox) {
		this.boxProveedor  = comboBox;
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
	private JTextField txtCantidad;
	private JTextField txtProveedor;
	JButton btnRegistrar;
	private JScrollPane scrollPane;
	private JComboBox<String> boxProveedor;
	private JComboBox<String> boxEstado;
	private JComboBox<String> boxProducto;

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
					"NroPedido", "Estado", "Fecha", "Producto","Cantidad", "Proveedor"
				}
			));
			
			JLabel lblProveedor = new JLabel("Proveedor:");
			lblProveedor.setBounds(10, 11, 129, 14);
			getContentPane().add(lblProveedor);

			
			JLabel lblEstado = new JLabel("Estado:");
			lblEstado.setBounds(10, 39, 129, 14);
			getContentPane().add(lblEstado);	
			
			JLabel lblNroPedido = new JLabel("NroPedido:");
			lblNroPedido.setBounds(10, 70, 129, 14);
			getContentPane().add(lblNroPedido);
			
			txtNroPedido = new JTextField();
			txtNroPedido.setColumns(10);
			txtNroPedido.setBounds(149, 67, 194, 20);
			getContentPane().add(txtNroPedido);

			JLabel lblCantidad = new JLabel("Cantidad:");
			lblCantidad.setBounds(10, 133, 129, 14);
			getContentPane().add(lblCantidad);
				
			
			JLabel lblProduto = new JLabel("Producto");
			lblProduto.setBounds(10, 101, 129, 14);
			getContentPane().add(lblProduto);
				
			
			txtCantidad = new JTextField();
			txtCantidad.setColumns(10);
			txtCantidad.setBounds(149, 129, 194, 20);
			getContentPane().add(txtCantidad);
			
			btnRegistrar = new JButton("Registrar");
			btnRegistrar.setBounds(353, 7, 89, 23);
			getContentPane().add(btnRegistrar);

			boxProveedor = new JComboBox();
			boxProveedor.setBounds(149, 8, 194, 20);
			getContentPane().add(boxProveedor);
			
			boxEstado = new JComboBox<String>();
			boxEstado.setBounds(149, 36, 194, 20);
			getContentPane().add(boxEstado);
			
			boxProducto = new JComboBox<String>();
			boxProducto.setBounds(149, 98, 194, 20);
			getContentPane().add(boxProducto);
			
		
	}
}