package Vista;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaVentaNueva extends JFrame {
    private static VentanaVentaNueva single_instance = null; 

	
	
	//TITULO
	private String titulo = "Nueva Venta";
	//BOTONES
	private JButton agregarVenta;
	private JButton cerrarVenta;
	private BorderLayout layoutVentas = new BorderLayout();
	
	//LABELS
	private JLabel lblDescripcionVentana; 
	
	private VentanaVentaNueva() {
		
		
		
		
		//this.setVisible(true);
		this.setTitle(titulo);
		this.setSize(300,300);
		
		Container panel=this.getContentPane();
		//LABELS
		lblDescripcionVentana = new JLabel("Ingrese los datos de la venta:");
		
	
		
		
		//lblDescripcionVentana.setAlignmentX(RIGHT_ALIGNMENT);
		panel.setLayout(new GridLayout(7,0,6,6));
		this.setVisible(true);
		this.setSize(400,400);
		
		
	

		
	}
	
	public static VentanaVentaNueva getInstance() 
	{ 
	        if (single_instance == null) 
	            single_instance = new VentanaVentaNueva(); 
	  
	        return single_instance; 
	} 
}