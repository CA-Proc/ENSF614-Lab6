import java.util.ArrayList;

public class ThreeColumnTable_Observer implements Observer{

	
	public ThreeColumnTable_Observer(Subject s) {
		s.registerObserver(this);
	}
	
	public void update(ArrayList<Double> data) {
		System.out.println("\nNotification to Three-Column Table Observer: Data Changed:");
		display(data);
	}
	
	private void display(ArrayList<Double> data) {
		for (int i=0; i<data.size(); i++) {
			System.out.print(data.get(i));
			if (((i+1) % 3) == 0) {
				System.out.println();
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
