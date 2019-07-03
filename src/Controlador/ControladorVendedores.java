package Controlador;

import Modelo.SistemaDeIndumentaria;
import Vista.VentanaVendedores;

public class ControladorVendedores {
	private SistemaDeIndumentaria sistemaDeIndumentaria;
	private VentanaVendedores ventanaVendedores;

	public ControladorVendedores(SistemaDeIndumentaria sistemaDeIndumentaria, VentanaVendedores ventanaVendedores) {
		this.sistemaDeIndumentaria = sistemaDeIndumentaria;
		this.ventanaVendedores = ventanaVendedores;
	}

	public void InitController() {
		//ventanaVendedores.getBtnRegistrar().addActionListener(e -> registrarVendedor());
	}

	private void registrarVendedor() {
		
		
	}
}
