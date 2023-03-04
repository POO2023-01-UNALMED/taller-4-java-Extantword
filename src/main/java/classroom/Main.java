package classroom;

public class Main {

	public static void main(String[] args) {

		 	Asignatura asignatura1 = new Asignatura();
		    Asignatura asignatura2 = new Asignatura("POO", Tipo.DISCIPLINAR);
		    Asignatura asignatura3 = new Asignatura(1029, Tipo.FUNDAMENTACION);
		    Asignatura asignatura4 = new Asignatura("Vision por computador", 3984, 4983, Tipo.ELECTIVA);

		    System.out.println(asignatura3.nombre);
		    System.out.println(asignatura3.codigoExterno);
		    System.out.println(asignatura3.tipo);
		    
		    
		
	}

}
