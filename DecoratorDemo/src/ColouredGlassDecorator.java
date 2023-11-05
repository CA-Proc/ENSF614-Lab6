import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Composite;
import java.awt.Color;
import java.awt.AlphaComposite;

public class ColouredGlassDecorator extends Decorator{
	
	public ColouredGlassDecorator(Component c, int x, int y, int w, int h) {
		this.cmp = c;
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
	}
	
	public void draw(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		Color oldColor = g2d.getColor();
		Composite oldComposite = g2d.getComposite();
		
		g2d.setColor(Color.green);
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1 * 0.1f));
		g2d.fillRect(25, 25, 110, 110);
		
		g2d.setComposite(oldComposite);
		g2d.setColor(oldColor);
		
		cmp.draw(g);
	}
}
