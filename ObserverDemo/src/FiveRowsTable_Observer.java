import java.util.ArrayList;

public class FiveRowsTable_Observer implements Observer{
	
	public FiveRowsTable_Observer(Subject s) {
		s.registerObserver(this);
	}
	
	public void update(ArrayList<Double> data) {
		System.out.println("\nNotification to Five-Rows Table Observer: Data Changed:");
		display(data);
	}
	
	private void display(ArrayList<Double> data) {
		for (int i=0; i<5; i++) {
			int j = i;
			while (j < data.size()) {
				System.out.print(data.get(j)+" ");
				j += 5;
			}
			System.out.println();	
		}
	}
}
