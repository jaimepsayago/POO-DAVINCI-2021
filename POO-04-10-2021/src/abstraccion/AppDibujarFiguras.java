package abstraccion;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class AppDibujarFiguras {

	//graficos en java libro de deitel capitulo 11 y 12
	
	public static void main(String[] args) {

		//frame es la ventana donde se va a presentar la informacion
		Frame frame = new Frame("ejemplo dibujar figura"); //titulo
		frame.setSize(800,600); //tamaño
		frame.add(new CanvasToDisplay()); //agregando la figura con un metodo y una clase
		frame.setVisible(true); //mostrando
		frame.addWindowListener(new WindowAdapter() { //agregando el botonde cerrar
			public void windowClosing(WindowEvent e) {
				System.exit(0); //cerrar el programa
			}
		});
		
	}

}
	
	
	//clase embebida
	class CanvasToDisplay extends Component{
		
		//metodo
		public void paint(Graphics g) {
			//envio de datos de la clase heredada
			CirculoDibujable cd = new CirculoDibujable(50, 50, 50); //objet de tipo circulo y sus datos
			cd.dibujar2D(g); //dibujando
			
			//agrego un ojbeto rectangulo
			RectanguloDibujable rd = new RectanguloDibujable(500, 250, 50, 250);
			rd.dibujar2D(g);
		}
		
	}

	

