package polimorfismo;

import java.util.Calendar;

public class ProfesorInterino extends Profesor{
	
	private Calendar fechaComienzoTrabajoInterino;
	
	public ProfesorInterino(Calendar fechaComienzoTrabajoInterino) {
		super();
		this.fechaComienzoTrabajoInterino=fechaComienzoTrabajoInterino;
	}
	
	public ProfesorInterino(String nombre, String apellidos, int edad, String idProfesor, Calendar fechaComienzoTrabajoInterino) {
		super(nombre, apellidos,edad, idProfesor);
		this.fechaComienzoTrabajoInterino=fechaComienzoTrabajoInterino;
	}

	public Calendar getFechaComienzoTrabajoInterino() {
		return fechaComienzoTrabajoInterino;
	}

	public void setFechaComienzoTrabajoInterino(Calendar fechaComienzoTrabajoInterino) {
		this.fechaComienzoTrabajoInterino = fechaComienzoTrabajoInterino;
	}
	
	public void mostrarDatos() {
		System.out.println("datos profesor interno: fecha comienzo" + fechaComienzoTrabajoInterino.getTime().toString());
	}

}
