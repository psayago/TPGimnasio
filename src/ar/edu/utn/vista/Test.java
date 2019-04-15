package ar.edu.utn.vista;

import java.util.Scanner;

import ar.edu.utn.controlador.BoxeadorControlador;
import ar.edu.utn.controlador.GimnasioControlador;
import ar.edu.utn.modelo.Boxeador;
import ar.edu.utn.modelo.Entrenador;


public class Test {
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		Scanner scan2 =new Scanner(System.in);
		GimnasioControlador gimnasioRocky=new GimnasioControlador();
		int cont=0;
		
		while (cont<25) {  // PIDE EL INGRESO DE 25 ASPIRANTES
			System.out.println("Ingrese el nombre del aspirante a boxeador: ");	
			String nombre=scan.nextLine();
			System.out.println("Ingrese el peso del aspirante a boxeador: ");
			Double peso =scan2.nextDouble();
			int opcion=0;
			while (opcion<=0 || opcion>4) {
				System.out.println("Elija un entrenador: ");
			    System.out.println("1--PEDRO");	
			    System.out.println("2--MIGUEL");	
	            System.out.println("3--JUAN");	
	            System.out.println("4--ERNESTO");
	            System.out.println("---->>");
			    opcion =scan2.nextInt();			
		    }
		    opcion=opcion-1;
		    BoxeadorControlador box= new BoxeadorControlador();
		    gimnasioRocky.asignoBoxeador(box.creoBoxeador(nombre,peso),opcion);
		    cont++;
		}
				
		
		for (int i=0; i<4; i++)	{//MUESTRA TODOS LOS ENTRENADORES CON SUS BOXEADORES ASIGNADOS
			Entrenador ent=gimnasioRocky.getListaEntrenadores()[i];			
			listarEnPantalla(ent);
			if (gimnasioRocky.getListaEntrenadores()[i].getListaBoxeador()[0]==null) {
				System.out.println("--NO TIENE BOXEADORES ASIGNADOS--");
			}
		}
		
		System.out.println("--BOXEADORES RECHAZADOS--");
		System.out.println("*************************");
		
		for (Boxeador boxeador : gimnasioRocky.getRechazados()) {
			if (boxeador!=null){
				boxeador.identificarse();
			}
		}
		
	}
	
	public static void listarEnPantalla(Entrenador entrenador) {
		System.out.println(entrenador.toString());
		Boxeador[] boxeadores= entrenador.getListaBoxeador();
		for (Boxeador  boxeador : boxeadores) {
			if (boxeador!=null){
				boxeador.identificarse();
			}
					
		}		
	}
}

/*
public class Test {

	public static void main(String[] args) {
		
		VeterinariaControlador vc = new VeterinariaControlador();
		
		Animal a1 = new Animal(TipoAnimal.PERRO);
		a1.setNombre("Sparkly");
		a1.setCausa("atropello");
		a1.setEdad(22);
		a1.setRaza("Caniche toy");
		
		Animal a2 = new Animal(TipoAnimal.CONEJO);
		a2 = pidoDatos(a2);
		
		System.out.println(a2);
		
		Animal a3 = new Animal(TipoAnimal.CONEJO);
		Animal a4 = new Animal(TipoAnimal.CONEJO);
		Animal a5 = new Animal(TipoAnimal.CONEJO);
		
		
		vc.atiendoAnimal(a1, 1);
		vc.atiendoAnimal(a2, 1);
		vc.atiendoAnimal(a3, 1);
		vc.atiendoAnimal(a4, 1);
		vc.atiendoAnimal(a5, 1);
		vc.atiendoAnimal(a1, 1);
		
		
	}
	
	
	private static Animal pidoDatos(Animal a) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("ingrese el nombre");
		
		a.setNombre(s.nextLine());
		System.out.println("ingrese la raza");
		a.setRaza(s.nextLine());
		System.out.println("xq mierda lo trajiste");
		a.setCausa(s.nextLine());
		System.out.println("Ingrese la edad");
		a.setEdad(s.nextInt());
		return a;
	}

}   */