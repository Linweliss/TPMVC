package Controlador;

import Modelo.SistemaDeIndumentaria;
import Vista.VentanaProveedores;

public class ControladorProveedores {
	private SistemaDeIndumentaria sistemaDeIndumentaria;
	private VentanaProveedores ventanaProveedores;

	public ControladorProveedores(SistemaDeIndumentaria sistemaDeIndumentaria, VentanaProveedores ventanaProveedores) {
		this.sistemaDeIndumentaria = sistemaDeIndumentaria;
		this.ventanaProveedores = ventanaProveedores;
	}

	public void InitController() {
		//ventanaProveedores.getBtnRegistrar().addActionListener(e -> registrarProveedor());
	}

	private void registrarProveedor() {
		
		
	}
}
