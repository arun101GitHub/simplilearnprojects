package simplilearn;
import java.util.*;
public class AllCollectionTypes {

	public static void main(String[] args) {
		// ArrayList List = new ArrayList();heterogenerous
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Bombay");
		cities.add("Delhi");
		cities.add("Kathmandu");
		System.out.println(cities);
		
		// create an instance of vector
		Vector<Integer> vector = new Vector<>();
		vector.add(1010);
		vector.add(2020);
		System.out.println(vector);//old feature 
		
		//linkedlist
		LinkedList<String> names = new LinkedList<>();
		names.add("josh");
		names.add("jack");
		names.add("jane");
		
		// use iterator to traverse a linked list
		Iterator<String> i = names.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		HashSet<Integer> hashset = new HashSet<>();
		hashset.add(101);
		hashset.add(103);
		hashset.add(102);
		hashset.add(104);
        System.out.println(hashset);
        //use for each loop to traverse a collection (set, list. and map)
        for (Integer element:hashset) {
        	System.out.println(element);
        }
       LinkedHashSet<Integer> set = new LinkedHashSet<>();
       set.add(101);
       set.add(103);
       set.add(104);
       set.add(102);
       System.out.println(set);
       
       
	}

}
