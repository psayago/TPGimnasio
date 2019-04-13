package ar.edu.utn.modelo;

public class Entrenador {

	private VecEntrenadores nombre;
	private Boxeador[] listaBoxeadores;
	private int cont =0;
	private Categorias categoria[];

	
	public Entrenador(VecEntrenadores nombre) {
		this.listaBoxeadores = new Boxeador[5];
		this.nombre=nombre;
		/*switch (nombre){
		case PEDRO:
			;
			break;
		case MIGUEL:
			
			break;
		case JUAN:
			this.categorias = new categoria[2];
			break;
		case ERNESTO:
			
			break;	
			
		default:
			break;
		}*/
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
	
	

	public void asignoBoxeador(Boxeador boxeador) {
		if(cont < 5) {
			this.listaBoxeadores[cont]= boxeador;
			
			System.out.println("boxeador asignado");
			cont++;
			
		}else {
			System.out.println(this.nombre + " Este entrendor llego al maximo de boxeadores a entrenar");
			System.out.println("no se pueden asignar mas boxeadores a este entrenador");
		}
	}

	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + ", categoria=" + categoria +  "] '/n' ";
	}
	
}