import java.awt.Graphics;

public class Text implements Component{
	private int x;
	private int y;
	private String text;
	
	public Text(String t, int x, int y) {
		this.text = t;
		this.x = x;
		this.y = y;
	}
	
	
	public void draw(Graphics g) {
		g.drawString(text, x, y);
	}
}
