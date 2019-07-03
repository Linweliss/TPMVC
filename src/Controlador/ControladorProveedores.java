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
		ventanaProveedores.getBtnRegistrar().addActionListener(e -> registrarProveedor());
		refresh();
	}

	private void registrarProveedor() {
		sistemaDeIndumentaria.agregarProveedor(
				ventanaProveedores.getTxtNombre().getText(),
				ventanaProveedores.getTxtMail().getText(),
				ventanaProveedores.getTxtTelefono().getText(),
				ventanaProveedores.getTxtCuil().getText());
		refresh();
	}
	
	private void refresh() {
		String matriz[][]= new String[sistemaDeIndumentaria.getProveedores().size()][4];
		for(int i=0; i<sistemaDeIndumentaria.getProveedores().size();i++) {
			//"Nombre", "Cuil", "Mail", "Tel\u00E9fono"
			matriz[i][0]=sistemaDeIndumentaria.getProveedores().get(i).getNombre();
			matriz[i][1]=sistemaDeIndumentaria.getProveedores().get(i).getCuil();
			matriz[i][2]=sistemaDeIndumentaria.getProveedores().get(i).getMail();
			matriz[i][3]=sistemaDeIndumentaria.getProveedores().get(i).getTelefono();
			
		}
		
		ventanaProveedores.getTable().setModel( new javax.swing.table.DefaultTableModel(matriz, new String [] {"Nombre", "Cuil", "Mail", "Tel\u00E9fono"}));
		
	}
}
