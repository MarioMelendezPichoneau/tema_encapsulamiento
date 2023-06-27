package tema_encapsulamiento;

public class Ejercio8 {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		
		persona.setEdad(21);
		persona.setNombre("Mario MP");
		persona.setTelefono("+1829-523-7952");
		
		System.out.println("Su nombre es: " + persona.getNombre());
		System.out.println("Edad: " + persona.getEdad());
		System.out.println("Telefono: " + persona.getTelefono());

	}

}


//Crear clase Persona.

//Crear variables las privadas edad, nombre y telefono de la clase Persona.

//Crear gets y sets de cada propiedad.

//Crear un objeto persona en el main.

//Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
