import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.BasicStroke;

public class ColouredFrameDecorator extends Decorator{
	
	private int thickness;
	
	public ColouredFrameDecorator(Component c, int x, int y, int w, int h, int t) {
		this.cmp = c;
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
		this.thickness = t;
	}
	
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		Stroke oldStroke = g2d.getStroke();
		Color oldColor = g2d.getColor();
		
		g2d.setStroke(new BasicStroke(thickness));
		g2d.setColor(Color.red);
		g2d.drawRect(x, y, width, height);
		
		g2d.setStroke(oldStroke);
		g2d.setColor(oldColor);
		
		cmp.draw(g);
	}
}
