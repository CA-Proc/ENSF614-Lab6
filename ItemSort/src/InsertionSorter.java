import java.util.ArrayList;

public class InsertionSorter<E extends Number & Comparable<E>> implements Sorter<E> {
	
	public void sort(ArrayList<Item<E>> storage) {
		for (int i=1; i<storage.size(); i++) {
			int j = i;
			if (storage.get(j).getItem().compareTo(storage.get(j-1).getItem()) < 0) {
				while ((j >= 1) && (storage.get(i).getItem().compareTo(storage.get(j-1).getItem()) < 0)) {
					j--;
				}
				Item<E> temp = (Item<E>)storage.get(i);
				storage.remove(i);
				storage.add(j, temp);
			}
		}
	}
}
