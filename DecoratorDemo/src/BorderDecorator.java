import java.awt.Graphics;
import java.awt.Graphics2D;

public class BorderDecorator extends Decorator{
	
	public BorderDecorator(Component c) {
		this.cmp = c;
	}
	
	public void draw(Graphics g) {
		//TODO
		
		cmp.draw(g);
	}
}
