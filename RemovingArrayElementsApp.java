
public class RemovingArrayElementsApp {

	public static void main(String[] args) {

		Integer[] data = {100, 200, 300, 400, null};
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
	public static Integer[] gradualElementRemoving(Integer[] array) {
		int i = array.length-1;
		while(i > 0) {
			array[i--] = array[i];
		}
		    array[i] = null;
			return array;
	}
	
	public static Integer[] reverseGradualElementRemoving(Integer[] array) {
	int i = 0;
	while(i < array.length-1) {
		array[i++] = array[i];
	}
	array[i] = null;
		return array;
	}
}
