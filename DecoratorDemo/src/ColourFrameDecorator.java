import java.awt.Graphics;
import java.awt.Graphics2D;

public class ColourFrameDecorator extends Decorator{

	public ColourFrameDecorator(Component c) {
		this.cmp = c;
	}
	
	public void draw(Graphics g) {
		// TODO
		cmp.draw(g);
	}
}
