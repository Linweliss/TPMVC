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
		ventanaProductos.getBtnRegistrar().addActionListener(e -> registrarProducto());
	}

	private void registrarProducto() {
		sistemaDeIndumentaria.agregarProducto(
				Integer.parseInt(ventanaProductos.getTxtCodigo().getText()),
				ventanaProductos.getTxtColor().getText(),
				ventanaProductos.getTxtDescripcion().getText(),
				ventanaProductos.getTxtNombre().getText(),
				Float.parseFloat(ventanaProductos.getTxtPrecio().getText()),
				Integer.parseInt(ventanaProductos.getTxtStock().getText()),
				ventanaProductos.getTxtTalle().getText()
				);
		refresh();
		
	}
	
	private void refresh() {
		String matriz[][]= new String[sistemaDeIndumentaria.getProductos().size()][7];
		for(int i=0; i<sistemaDeIndumentaria.getProductos().size();i++) {
			//"Codigo", "Color", "Descripcion", "Nombre", "Precio", "Stock", "Talle"
			matriz[i][0]=String.valueOf(sistemaDeIndumentaria.getProductos().get(i).getCodigo());
			matriz[i][1]=sistemaDeIndumentaria.getProductos().get(i).getColor();
			matriz[i][2]=sistemaDeIndumentaria.getProductos().get(i).getDescripcion();
			matriz[i][3]=sistemaDeIndumentaria.getProductos().get(i).getNombre();
			matriz[i][4]=String.valueOf(sistemaDeIndumentaria.getProductos().get(i).getPrecio());
			matriz[i][5]=String.valueOf(sistemaDeIndumentaria.getProductos().get(i).getStock());
			matriz[i][6]=sistemaDeIndumentaria.getProductos().get(i).getTalle();
			
		}
		
		ventanaProductos.getTable().setModel( new javax.swing.table.DefaultTableModel(matriz, new String [] {"Codigo", "Color", "Descripcion", "Nombre", "Precio", "Stock", "Talle"}));
		
	}
}
