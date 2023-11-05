import java.util.ArrayList;

public class OneRow_Observer implements Observer {
	
	public OneRow_Observer(Subject s) {
		s.registerObserver(this);
	}
	
	public void update(ArrayList<Double> data) {
		System.out.println("\nNotification to One-Row Observer: Data Changed:");
		display(data);
	}
	
	private void display(ArrayList<Double> data) {
		for (Double d: data) {
			System.out.print(d + " ");
		}
	}
}
