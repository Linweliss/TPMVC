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

	}
	private void comboBox() {
		/*ventanaPedidos.getTxtProveedor().setText(ventanaPedidos.getBoxProveedor().getSelectedItem().toString());*/

	}

}
