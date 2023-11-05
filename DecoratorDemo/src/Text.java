import java.awt.Graphics;
import java.awt.Graphics2D;

public class Text implements Component{
	private int x;
	private int y;
	private String text;
	
	public void draw(Graphics g) {
		//TODO
		g.drawString(text, x, y);
	}
}
