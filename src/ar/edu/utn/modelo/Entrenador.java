package ar.edu.utn.modelo;

public class Entrenador {

	private VecEntrenadores nombre;
	private Boxeador[] listaBoxeadores;
	private int cont =0;
	
	public Entrenador(VecEntrenadores nombre) {
		this.listaBoxeadores = new Boxeador[5];
		this.nombre=nombre;
	}
	
	public VecEntrenadores getNombre() {
		return nombre;
	}

	public void setNombre(VecEntrenadores nombre) {
		this.nombre = nombre;
	}

	public Boxeador[] getListaAnimal() {
		return listaBoxeadores;
	}
}