import Controlador.ControladorPrincipal;
import Modelo.SistemaDeIndumentaria;
import Vista.VentanaPrincipal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaDeIndumentaria sistemaDeIndumentaria = new SistemaDeIndumentaria();
		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
		ControladorPrincipal controladorPrincipal = new ControladorPrincipal(sistemaDeIndumentaria, ventanaPrincipal);
		controladorPrincipal.InitController();
		
	}

}
