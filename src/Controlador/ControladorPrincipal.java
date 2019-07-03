package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.SistemaDeIndumentaria;
import Vista.*;


public class ControladorPrincipal{
	private SistemaDeIndumentaria sistemaDeIndumentaria;
	private VentanaPrincipal ventanaPrincipal;
	
	//Controladores y ventanas
	private ControladorClientes controladorClientes;
	private VentanaClientes ventanaClientes;
	private ControladorPedidos controladorPedidos;
	private VentanaPedidos ventanaPedidos;
	private ControladorProductos controladorProductos;
	private VentanaProductos ventanaProductos;
	private ControladorProveedores controladorProveedores;
	private VentanaProveedores ventanaProveedores;
	private ControladorVendedores controladorVendedores;
	private VentanaVendedores ventanaVendedores;
	private ControladorVentas controladorVentas;
	private VentanaVentas ventanaVentas;
	
	public ControladorPrincipal(SistemaDeIndumentaria sistemaDeIndumentaria, VentanaPrincipal ventanaPrincipal) {
		this.sistemaDeIndumentaria = sistemaDeIndumentaria;
		this.ventanaPrincipal = ventanaPrincipal;
	}

	public void InitController() {
		//Inicializar ventanas
		ventanaClientes = new VentanaClientes();
		controladorClientes = new ControladorClientes(sistemaDeIndumentaria, ventanaClientes);
		controladorClientes.InitController();
		ventanaPedidos = new VentanaPedidos();
		controladorPedidos = new ControladorPedidos(sistemaDeIndumentaria, ventanaPedidos);
		controladorPedidos.InitController();
		ventanaProductos = new VentanaProductos();
		controladorProductos = new ControladorProductos(sistemaDeIndumentaria, ventanaProductos);
		controladorProductos.InitController();
		ventanaProveedores = new VentanaProveedores();
		controladorProveedores = new ControladorProveedores(sistemaDeIndumentaria, ventanaProveedores);
		controladorProveedores.InitController();
		ventanaVendedores = new VentanaVendedores();
		controladorVendedores = new ControladorVendedores(sistemaDeIndumentaria, ventanaVendedores);
		controladorVendedores.InitController();
		ventanaVentas = new VentanaVentas();
		controladorVentas = new ControladorVentas(sistemaDeIndumentaria, ventanaVentas);
		controladorVentas.InitController();
		
		
		//Eventos ventana
		ventanaPrincipal.getBtnClientes().addActionListener(e -> abrirVentanaClientes());
		ventanaPrincipal.getBtnPedidos().addActionListener(e -> abrirVentanaPedidos());
		ventanaPrincipal.getBtnProductos().addActionListener(e -> abrirVentanaProductos());
		ventanaPrincipal.getBtnProveedores().addActionListener(e -> abrirVentanaProveedores());
		ventanaPrincipal.getBtnVendedores().addActionListener(e -> abrirVentanaVendedores());
		ventanaPrincipal.getBtnVentas().addActionListener(e -> abrirVentanaVentas());
	
		ventanaPrincipal.setVisible(true);
	}

	private void abrirVentanaClientes() {
		ventanaClientes.setVisible(true);
	}
	
	private void abrirVentanaPedidos() {
		ventanaPedidos.setVisible(true);
	}
	
	private void abrirVentanaProductos() {
		ventanaProductos.setVisible(true);
	}
	
	private void abrirVentanaProveedores() {
		ventanaProveedores.setVisible(true);
	}
	
	private void abrirVentanaVendedores() {
		ventanaVendedores.setVisible(true);
	}
	
	private void abrirVentanaVentas() {
		ventanaVentas.setVisible(true);
	}

}
