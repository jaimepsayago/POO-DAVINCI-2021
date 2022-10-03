package primerParcial;

import java.text.SimpleDateFormat;

import primerParcial.Fecha;

public class AppAlumnos {

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno(1213213, "juan", 2003, "primero");
		Alumno a2 = new Alumno();
		a2.setCedula(5456);
		a2.setNombre("pablo");
		a2.setAnio(2000);
		a2.setCurso("segundo");
		
		String cadenaFechaEntrada = "24/01/2019";
               
        Fecha f = new Fecha();
        f.setDia(19);
        f.setMes(11);
        f.setAnio(1982); 
              
        Fecha f2 = new Fecha(15,8,2001);   
        
		Alumno a3 = new Alumno(454545, "miguel", 1994, "tercero");
		Alumno a4 = new Alumno(555, "luis", 1989, "cuarto");
		
		System.out.println("alumno 1: " + a1.getNombre() + a1.getCedula() + a1.getCurso() + a1.calcularEdad());
		System.out.println("alumno 1 edad fecha: " + a1.calcularEdadParametros(cadenaFechaEntrada));
		System.out.println("alumno 2 edad fecha objeto: " + a2.calcularEdadParametrosObjeto(f));
		System.out.println("alumno 2 " + a2.toString()+  "edad objeto: " + a2.calcularEdadParametrosObjeto(f2));
		System.out.println("alumno 3 " + a3.toString()+  "edad: " + a3.calcularEdad());
		System.out.println("alumno 4 " + a4.toString()+  "edad: " + a4.calcularEdad());
	}

}
