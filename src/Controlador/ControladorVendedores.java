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
		ventanaVendedores.getBtnRegistrar().addActionListener(e -> registrarVendedor());
		refresh();
	}

	private void registrarVendedor() {
		sistemaDeIndumentaria.agregarVendedor(
				ventanaVendedores.getTxtNombre().getText(),
				ventanaVendedores.getTxtMail().getText(),
				ventanaVendedores.getTxtTelefono().getText(),
				ventanaVendedores.getTxtCuil().getText(),
				Float.parseFloat(ventanaVendedores.getTxtComision().getText())
				
				);
		refresh();
	}
	
	private void refresh() {
		String matriz[][]= new String[sistemaDeIndumentaria.getVendedores().size()][5];
		for(int i=0; i<sistemaDeIndumentaria.getVendedores().size();i++) {
			matriz[i][0]=sistemaDeIndumentaria.getVendedores().get(i).getNombre();
			matriz[i][1]=sistemaDeIndumentaria.getVendedores().get(i).getCuil();
			matriz[i][2]=String.valueOf(sistemaDeIndumentaria.getVendedores().get(i).getComision());
			matriz[i][3]=sistemaDeIndumentaria.getVendedores().get(i).getMail();
			matriz[i][4]=sistemaDeIndumentaria.getVendedores().get(i).getTelefono();
			
		}
		
		ventanaVendedores.getTable().setModel( new javax.swing.table.DefaultTableModel(matriz, new String [] {"Nombre", "Cuil", "Localidad", "Mail", "Tel\u00E9fono"}));
		
	}
}
