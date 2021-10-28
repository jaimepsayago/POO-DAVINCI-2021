package primerParcial;

public class AppAlumnos {

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno(1213213, "juan", 2003, "primero");
		Alumno a2 = new Alumno();
		a2.setCedula(5456);
		a2.setNombre("pablo");
		a2.setAnio(2000);
		a2.setCurso("segundo");
		
		Alumno a3 = new Alumno(454545, "miguel", 1994, "tercero");
		Alumno a4 = new Alumno(555, "luis", 1989, "cuarto");
		
		System.out.println("alumno 1: " + a1.getNombre() + a1.getCedula() + a1.getCurso() + a1.calcularEdad());
		System.out.println("alumno 2 " + a2.toString()+  "edad: " + a2.calcularEdad());
		System.out.println("alumno 3 " + a3.toString()+  "edad: " + a3.calcularEdad());
		System.out.println("alumno 4 " + a4.toString()+  "edad: " + a4.calcularEdad());
	}

}
