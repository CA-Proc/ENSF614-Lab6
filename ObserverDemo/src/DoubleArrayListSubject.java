import java.util.ArrayList;

public class DoubleArrayListSubject implements Subject {
	
	public ArrayList<Double> data;
	private ArrayList<Observer> observers;
	
	public DoubleArrayListSubject() {
		data = new ArrayList<Double>();
		observers = new ArrayList<Observer>();
	}
	
	public void display() {
		if (data.isEmpty()) {
			System.out.println("Empty List ...");
		} else {
			System.out.println(data.toString());
		}
	}
	public void addData(Double value) {
		data.add(value);
		notifyAllObservers();
	}
	
	public void setData(Double value, int index) {
		data.set(index, value);
		notifyAllObservers();
	}
	
	public void populate(double[] values) {
		for (Double x: values) {
			data.add(x);
		}
		notifyAllObservers();
	}
	
	public void registerObserver(Observer o) {
		if (!observers.contains(o)){
			observers.add(o);
		}
		o.update(data);
	}
	
	public void remove(Observer o) {
		observers.remove(o);
	}
	
	public void notifyAllObservers() {
		for (Observer o: observers) {
			o.update(data);
		}
	}
}
