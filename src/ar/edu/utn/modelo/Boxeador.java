package ar.edu.utn.modelo;


public class Boxeador {

	private Categorias categoria;
	private String nombre;
	private double peso;


	
	
	public Categorias getCategoria() {
		return categoria;
	}	
	
	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	
	public double getPeso() {
		return peso;
	}
	
	public void identificarse() {
		System.out.println("**************************");
		System.out.println("Nombre: "+ this.getNombre());
		System.out.println("Peso: "+ this.getPeso());
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("**************************");

	}



	


	
	

}