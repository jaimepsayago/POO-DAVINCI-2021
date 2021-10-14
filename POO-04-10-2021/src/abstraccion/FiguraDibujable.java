package abstraccion;

import java.awt.Graphics;

public interface FiguraDibujable {
	
	//coordenadas o datos
	public void setCoordenadas(int x, int y);
	
	
	//dibujar
	public void dibujar2D(Graphics g);

}
