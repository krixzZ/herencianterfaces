package cl.krixz.main;

import cl.krixz.interfaces.InterfaceA;

// clase que implementa InterfaceA que hereda método mostrarMensaje() de -InterfaceB
public class ClaseFinal implements InterfaceA {

	public ClaseFinal() {
		
	}
	
	@Override
	public void mostrarMensaje() {
		
		System.out.println("Ptobando la herencia de interfaces.");
		
	}

}
