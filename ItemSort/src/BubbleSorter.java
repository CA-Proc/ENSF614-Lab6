import java.util.ArrayList;

public class BubbleSorter <E extends Number & Comparable<E>> implements Sorter<E>{
	
	@Override
	public void sort(ArrayList<Item<E>> storage) {
		for (int i=0; i<storage.size(); i++) {
			for (int j=0; j<storage.size()-1; j++) {
				if (storage.get(j).getItem().compareTo(storage.get(j+1).getItem()) > 0) {
					// Swap i and j
					Item<E> temp = (Item<E>)storage.get(j);
					storage.set(j, storage.get(j+1));
					storage.set(j+1, temp);
				}
			}
		}
	}
}
