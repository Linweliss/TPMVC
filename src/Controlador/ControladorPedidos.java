package Controlador;

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
		//ventanaPedidos.getBtnRegistrar().addActionListener(e -> registrarPedido());
	}

	private void registrarPedido() {
		
		
	}
}
