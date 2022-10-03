package primerParcial;

import java.text.SimpleDateFormat;

public class Alumno extends Persona {
	
	String curso;
	
	public Alumno() {
		
	}
	public Alumno(int cedula, String nombre, int anio, String curso) {
		super(cedula, nombre, anio); //clase padre
		this.curso=curso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	//metodo
	public int calcularEdad() {
		return 2022-this.anio;
	}
	
	public long calcularEdadParametros(String cadenaFechaEntrada) {
		 
		SimpleDateFormat formatoFecha =new SimpleDateFormat("dd-MMMM-yyyy");
	        //String cadenaFechaEntrada = "24/01/2019";
	        String cadenaFechaEntradaTransformada = cadenaFechaEntrada.substring(6, 10)+"-"+cadenaFechaEntrada.substring(3, 5)+"-"+cadenaFechaEntrada.substring(0, 2);            
	   // String fecha = String.valueOf(fechaInmueble1.getDia())+ "-"+ String.valueOf(fechaInmueble1.getMes()) + "-"+ String.valueOf(fechaInmueble1.getAnio());    
		java.sql.Date fechaEntrada = java.sql.Date.valueOf(cadenaFechaEntradaTransformada); 
	        java.util.Date fechaSalida = new java.util.Date();
	        long numeroDias = (fechaSalida.getTime() - fechaEntrada.getTime()) / (24*60*60*1000);
	       return numeroDias/365;
	}
	
	public long calcularEdadParametrosObjeto(Fecha cadenaFechaEntrada) {
		 
		
	        //String cadenaFechaEntrada = "24/01/2019";
	       // String cadenaFechaEntradaTransformada = cadenaFechaEntrada.substring(6, 10)+"-"+cadenaFechaEntrada.substring(3, 5)+"-"+cadenaFechaEntrada.substring(0, 2);            
	   String fecha = String.valueOf(cadenaFechaEntrada.getAnio())+ "-"+ String.valueOf(cadenaFechaEntrada.getMes()) + "-"+ String.valueOf(cadenaFechaEntrada.getDia());    
		java.sql.Date fechaEntrada = java.sql.Date.valueOf(fecha); 
	        java.util.Date fechaSalida = new java.util.Date();
	        long numeroDias =( (fechaSalida.getTime() - fechaEntrada.getTime()) / (24*60*60*1000));
	        long edad = numeroDias/365;
		return edad;
	}
	public String toString() {
	 return "cedula: " + this.cedula + "nombre: " + nombre + "anio: " + anio + "curso: " + curso;
	}
	
	

}
