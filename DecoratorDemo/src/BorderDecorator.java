import java.awt.*;

public class BorderDecorator extends Decorator{
	
	public BorderDecorator(Component c, int x, int y, int w, int h) {
		this.cmp = c;
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
	}
	
	public void draw(Graphics g) {
		//TODO
		Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9},
				0);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(dashed);
		g2d.drawRect(30, 30, 100, 100);
		cmp.draw(g);
	}
}
