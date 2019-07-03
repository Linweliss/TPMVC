package Controlador;

import Modelo.SistemaDeIndumentaria;
import Vista.VentanaClientes;

public class ControladorClientes {
	private SistemaDeIndumentaria sistemaDeIndumentaria;
	private VentanaClientes ventanaClientes;

	public ControladorClientes(SistemaDeIndumentaria sistemaDeIndumentaria, VentanaClientes ventanaClientes) {
		this.sistemaDeIndumentaria = sistemaDeIndumentaria;
		this.ventanaClientes = ventanaClientes;
	}

	public void InitController() {
		ventanaClientes.getBtnRegistrar().addActionListener(e -> registrarCliente());
		refresh();
	}

	private void registrarCliente() {
		sistemaDeIndumentaria.agregarCliente(
				ventanaClientes.getTxtNombre().getText(),
				ventanaClientes.getTxtMail().getText(),
				ventanaClientes.getTxtLocalidad().getText(),
				ventanaClientes.getTxtTelefono().getText(),
				ventanaClientes.getTxtCuil().getText());
		refresh();
	}
	
	private void refresh() {
		String matriz[][]= new String[sistemaDeIndumentaria.getClientes().size()][5];
		for(int i=0; i<sistemaDeIndumentaria.getClientes().size();i++) {
			//"Nombre", "Cuil", "Localidad", "Mail", "Tel\u00E9fono"
			matriz[i][0]=sistemaDeIndumentaria.getClientes().get(i).getNombre();
			matriz[i][1]=sistemaDeIndumentaria.getClientes().get(i).getCuil();
			matriz[i][2]=sistemaDeIndumentaria.getClientes().get(i).getLocalidad();
			matriz[i][3]=sistemaDeIndumentaria.getClientes().get(i).getMail();
			matriz[i][4]=sistemaDeIndumentaria.getClientes().get(i).getTelefono();
			
		}
		
		ventanaClientes.getTable().setModel( new javax.swing.table.DefaultTableModel(matriz, new String [] {"Nombre", "Cuil", "Localidad", "Mail", "Tel\u00E9fono"}));
		
	}
}
