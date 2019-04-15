package ar.edu.utn.controlador;

import ar.edu.utn.modelo.Entrenador;
import ar.edu.utn.modelo.VecEntrenadores;
import ar.edu.utn.modelo.Boxeador;


public class GimnasioControlador {

	private Entrenador[] listaEntrenadores;
	private Boxeador rechazados[];
	int contRechazados=0;
	
	public GimnasioControlador() {
		this.listaEntrenadores = new Entrenador[4];
		this.listaEntrenadores[0]= new Entrenador(VecEntrenadores.PEDRO);
		this.listaEntrenadores[1]= new Entrenador(VecEntrenadores.MIGUEL);
		this.listaEntrenadores[2]= new Entrenador(VecEntrenadores.JUAN);
		this.listaEntrenadores[3]= new Entrenador(VecEntrenadores.ERNESTO);
		rechazados= new Boxeador[25];
	}
	
	
	public Entrenador[] getListaEntrenadores() {
		return listaEntrenadores;
	}


	
	public void asignoBoxeador(Boxeador boxeador, int numerEntrenador) {
		
		System.out.println("Bienvenido boxeador " + boxeador.getNombre()+" usted quiere entrenar con: " + this.listaEntrenadores[numerEntrenador].getNombre());
		if (this.listaEntrenadores[numerEntrenador].esEntrenable(boxeador)) {
			this.listaEntrenadores[numerEntrenador].asignoBoxeador(boxeador);			
		}else {
			rechazados[contRechazados]=boxeador;
			System.out.println("1-- El entrenador " + this.listaEntrenadores[numerEntrenador].getNombre()+ " llego al maximo de boxeadores a entrenar");
			System.out.println("    no se pueden asignar mas boxeadores a este entrenador");
			System.out.println("2-- O este entrenador no entrena a boxeadores de categoria: "+ boxeador.getCategoria());
			contRechazados++;
		}
		
		
	}


	public Boxeador[] getRechazados() {
		return rechazados;
	}
	
	
	
	
}