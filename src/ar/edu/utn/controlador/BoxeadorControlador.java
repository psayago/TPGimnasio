package ar.edu.utn.controlador;

import ar.edu.utn.modelo.Boxeador;
import ar.edu.utn.modelo.Categorias;


public class BoxeadorControlador {
	public Boxeador creoBoxeador(String nombre, double peso){
		Boxeador b = new Boxeador();
		b.setNombre(nombre);
		b.setPeso(peso);
		if (peso<52.163) {
			b.setCategoria(Categorias.MOSCA);
		}else 
			if (52.163<=peso && peso<55.3385) {
			b.setCategoria(Categorias.GALLO);
		}else
			if (55.338 <=peso && peso<58.967 ) {
			b.setCategoria(Categorias.PLUMA);
		}else 
			if (58.967<=peso && peso<63.503 ) {
			b.setCategoria(Categorias.LIGERO);
		}else
			if (63.503<=peso && peso<69.853 ) {
			b.setCategoria(Categorias.WELTER);
		}else
			if (69.853<=peso && peso<76.205  ) {
			b.setCategoria(Categorias.MEDIANO);
		}
		return b;
	}

}
