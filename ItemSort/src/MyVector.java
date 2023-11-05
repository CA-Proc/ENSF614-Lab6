import java.util.ArrayList;

public class MyVector <E extends Number & Comparable<E> >{

	private ArrayList<Item<E>> storageM;
	private Sorter<E> sorter;
	
	public MyVector(int n){
		storageM = new ArrayList<>(n);
	}
	
	@SuppressWarnings("unchecked")
	public MyVector(ArrayList<E> arr){
		
		storageM = (ArrayList <Item<E>>)arr.clone();
	}
	
	public void add(Item<E> value) {
		storageM.add((Item<E>)value);
	}
	
	public void setSortStrategy(Sorter<E> s) {
		this.sorter = s;
	}
	
	public void performSort() {
		sorter.sort(storageM);
	}
	
	public void display() {
		for (int i=0; i<storageM.size(); i++) {
			System.out.print(storageM.get(i).getItem() + " ");
		}
	}
	
	
}
