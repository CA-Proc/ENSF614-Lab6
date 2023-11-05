import java.util.ArrayList;

public class SelectionSorter <E extends Number & Comparable<E>> implements Sorter<E> {

	public void sort(ArrayList<Item<E>> storage) {
		for (int i=0; i< storage.size()-1; i++) {
			int smallest = i;
			for (int j=i+1; j<storage.size(); j++) {
				if(storage.get(j).getItem().compareTo(storage.get(smallest).getItem()) < 0) {
					smallest = j;
				}
			}
			storage.add(i,storage.remove(smallest));
		}
	}
}
