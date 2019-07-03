package Vista;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaVentas extends JFrame {
    private static VentanaVentas single_instance = null; 

	
	
	//TITULO
	private String titulo = "Ventas";
	//BOTONES
	private JButton agregarVenta;
	private JButton cerrarVenta;
	private BorderLayout layoutVentas = new BorderLayout();
	
	public VentanaVentas() {
		//this.setVisible(true);
		this.setSize(400,400);
		
		
		//BOTONES
		agregarVenta = new JButton("Nueva venta");
		cerrarVenta = new JButton("Cerrar venta");
		
		//Controlador controlador = new Controlador(SistemaDeIndumentaria.getInstance());
		//agregarVenta.addActionListener(controlador);

		Container panel=this.getContentPane();
		panel.add(agregarVenta);
		panel.setLayout(layoutVentas);
		panel.add(agregarVenta, BorderLayout.LINE_START);
		panel.add(cerrarVenta,BorderLayout.PAGE_END);

		
	}
	
	public static VentanaVentas getInstance() 
	{ 
	        if (single_instance == null) 
	            single_instance = new VentanaVentas(); 
	  
	        return single_instance; 
	} 
}