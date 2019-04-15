package ar.edu.utn.modelo;

public class Entrenador {

	private VecEntrenadores nombre;
	private Boxeador[] listaBoxeadores;
	private int cont =0;
	private Categorias categoria[];

	
	public Entrenador(VecEntrenadores nombre) {
		this.listaBoxeadores = new Boxeador[5];
		this.setNombre(nombre);
		categoria=new Categorias[2];
		
		switch (nombre) {
		case PEDRO:
			categoria[0]= Categorias.MOSCA;
			categoria[1]= Categorias.GALLO;
			break;
		case MIGUEL:
			categoria[0]= Categorias.PLUMA;
			categoria[1]= Categorias.LIGERO;
			break;
		case JUAN:
			categoria[0]= Categorias.WELTER;
			categoria[1]= Categorias.MEDIANO;
			break;
		case ERNESTO:
			categoria[0]= Categorias.MEDIOPESADO;
			categoria[1]= Categorias.PESADO;
			break;				
		default:
			break;
		}
	
	}
	
	
	public VecEntrenadores getNombre() {
		return nombre;
	}

	public void setNombre(VecEntrenadores nombre) {
		this.nombre = nombre;
	}

	public Boxeador[] getListaBoxeador() {
		return listaBoxeadores;
	}
	
	public boolean esEntrenable(Boxeador boxeador) {
		return (  this.getCont() < 5 &&
				(boxeador.getCategoria()==this.categoria[0] || 
				boxeador.getCategoria()==this.categoria[1])  );
	}
	

	public void asignoBoxeador(Boxeador boxeador) {
		
		if(this.esEntrenable(boxeador)) {			
			this.listaBoxeadores[cont]= boxeador;			
			System.out.println("boxeador asignado");
			System.out.println("*****************");
			System.out.println("");
			cont++;			
		}			
	}
	
	
	public int getCont() {
		return cont;
	}


	

	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + ", categorias= " + categoria[0] + ", " + categoria[1] + "] ";
	}


	
	
}