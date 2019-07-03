package Controlador;

import javax.swing.JComboBox;
import javax.swing.JTextField;

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
		ventanaPedidos.getBtnRegistrar().addActionListener(e -> registrarPedido());
		ventanaPedidos.getBoxProveedor().addActionListener(e -> comboBox());

	}

	private void registrarPedido() {
		System.out.println("Holas");
		setBox(ventanaPedidos.getBoxProveedor());

	}
	private void comboBox() {
		if(	ventanaPedidos.getBoxProveedor().getSelectedItem().equals("Ubuntu")) {
			ventanaPedidos.getTxtProveedor().setText("Ubuntu");

		}
		
	}
	private void setBox(JComboBox<String> box) {
		box = new JComboBox<>(new String[]{"Ubunssstu", "Redddddhat", "Arch ","Debian", "Mint"});
		ventanaPedidos.setBoxProveedor(box);
	}
}
