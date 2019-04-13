package ar.edu.utn.controlador;

import ar.edu.utn.modelo.Entrenador;
import ar.edu.utn.modelo.VecEntrenadores;
import ar.edu.utn.modelo.Boxeador;


public class GimnasioControlador {

	private Entrenador[] listaEntrenadores;
	
	public GimnasioControlador() {
		this.listaEntrenadores = new Entrenador[4];
		this.listaEntrenadores[0]= new Entrenador(VecEntrenadores.PEDRO);
		this.listaEntrenadores[1]= new Entrenador(VecEntrenadores.MIGUEL);
		this.listaEntrenadores[2]= new Entrenador(VecEntrenadores.JUAN);
		this.listaEntrenadores[3]= new Entrenador(VecEntrenadores.ERNESTO);
		
	}
	
	
	public void asignoBoxeador(Boxeador boxeador, int numerEntrenador) {
		
		System.out.println("Bienvenido lo va entrenar entrenar: " + this.listaEntrenadores[numerEntrenador].getNombre());
		this.listaEntrenadores[numerEntrenador].asignoBoxeador(boxeador);
		
	}
	
	
	
}