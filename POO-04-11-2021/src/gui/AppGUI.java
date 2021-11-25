package gui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class AppGUI extends JFrame{
	
	//constructor inicializar objetos
	public AppGUI() {
		initGUI(); //inicializa los parametros por defecto de una ventana
	}
	
	//inicializador de ventana
	public void initGUI(){
		//genera parametros por defecto para una ventana
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); //generar un menu de cierre de la ventana
		setTitle("mi jframe de Jaime"); //titulo de mi ventana
		setSize(600, 600); //tamaño de la venta
	}
	
	
	
	public static void main(String[] args) {
		
		//GUI = Graphic User Interface
		
		//existe varios componentes crear ventanas AWT, Swing
		
		//como programar en Java de Deitel 7 9 12 edition capitulo 11 y 22
		
		//componentes = contenedores graficos para agrupar diferentes elementos
		
		/*
		 * JFRAME = como una ventana 
		 */
		
		AppGUI frame = new AppGUI(); //instanciar objeto frame 
		frame.setVisible(true); //hacer visible la ventana frame
		
		
	}
	
	

}
