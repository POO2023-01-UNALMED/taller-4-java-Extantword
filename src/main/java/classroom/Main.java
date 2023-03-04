package classroom;

public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
	    Persona persona2 = new Persona("Jaime");
	    Persona persona3 = new Persona(1234);
	    Persona persona4 = new Persona("Oswaldo", 2345);
	    Persona persona5 = new Persona(3456, "David");

		boolean ok = false;
	    if (persona1.getCedula() == 0 && 
	        persona2.getCedula() == 1 && persona2.getNombre().equals("Jaime") &&
	        persona3.getCedula() == 1234 && persona3.getNombre().equals("") &&
	        persona4.getCedula() == 2345 && persona4.getNombre().equals("Oswaldo") &&
	        persona5.getCedula() == 3456 && persona5.getNombre().equals("David")) {
	      ok = true;
	    }
	    
	    System.out.println(ok);
		    
		    
		
	}

}
