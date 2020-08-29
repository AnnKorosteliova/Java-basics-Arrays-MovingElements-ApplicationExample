import java.util.ArrayList;

public class RemovingArrayListElementsApp {

	public static void main(String[] args) {

		
		ArrayList<Integer> data = new ArrayList<>();
		
		data.add(100);
		data.add(200);
		data.add(300);
		data.add(400);
		data.add(null);
		
		//data = gradualElementRemoving(data);
		//data = gradualElementRemoving(data);
		//data = gradualElementRemoving(data);
		
		//data = reverseGradualElementRemoving(data);
		//data = reverseGradualElementRemoving(data);
		//data = reverseGradualElementRemoving(data);
				
		for (Integer integer : data) {
			System.out.println(integer);
		}
		
	}
	
	
	/**
	 * @param array of Integer[] type
	 * @return modified array if Integer[] type
	 * The last value of an array have been removed
	 * All elements of this array had moved at the next position 
	 * The first value of this array become "null"  
	 */
	public static ArrayList<Integer> gradualElementRemoving(ArrayList<Integer> array) {
		int i = array.size()-1;
		while(i > 0) {
			array.set(i--, array.get(i));			
		}
		    array.set(i, null);
			return array;
	}
	
	public static ArrayList<Integer> reverseGradualElementRemoving(ArrayList<Integer> array) {
	int i = 0;
	while(i < array.size()-1) {
		array.set(i++, array.get(i));
	}
	 	array.set(i, null);
		return array;
	}
}
