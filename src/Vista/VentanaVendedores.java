package Vista;

import javax.swing.*;


public class VentanaVendedores extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//TITULO
	private String titulo = "Vendedores";
	//BOTONES
	
	//
	public VentanaVendedores(){
		//this.setVisible(true);
		this.setTitle(titulo);
		this.setSize(300,300);
		/*
		 
		//HACER ALGO CUANDO SE CIERRA:
		 * 
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent e) {
		        System.out.println("Uncomment following to open another window!");
		        //MainPage m = new MainPage();
		        //m.setVisible(true);
		        e.getWindow().dispose();
		        System.out.println("JFrame Closed!");
		    }
		});
		*/
		
	}
}
