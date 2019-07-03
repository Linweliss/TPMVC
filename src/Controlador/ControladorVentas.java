package Controlador;

import Modelo.SistemaDeIndumentaria;
import Vista.VentanaVentas;

public class ControladorVentas {
	private SistemaDeIndumentaria sistemaDeIndumentaria;
	private VentanaVentas ventanaVentas;

	public ControladorVentas(SistemaDeIndumentaria sistemaDeIndumentaria, VentanaVentas ventanaVentas) {
		this.sistemaDeIndumentaria = sistemaDeIndumentaria;
		this.ventanaVentas = ventanaVentas;
	}

	public void InitController() {
		//ventanaVentas.getBtnRegistrar().addActionListener(e -> registrarVenta());
	}

	private void registrarVenta() {
		
		
	}
}
