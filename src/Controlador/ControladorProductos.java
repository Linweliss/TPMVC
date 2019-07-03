package Controlador;

import Modelo.SistemaDeIndumentaria;
import Vista.VentanaProductos;

public class ControladorProductos {
	private SistemaDeIndumentaria sistemaDeIndumentaria;
	private VentanaProductos ventanaProductos;

	public ControladorProductos(SistemaDeIndumentaria sistemaDeIndumentaria, VentanaProductos ventanaProductos) {
		this.sistemaDeIndumentaria = sistemaDeIndumentaria;
		this.ventanaProductos = ventanaProductos;
	}

	public void InitController() {
		//ventanaProductos.getBtnRegistrar().addActionListener(e -> registrarProducto());
	}

	private void registrarProducto() {
		
		
	}
}
