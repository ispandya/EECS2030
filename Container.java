package Lab6;

public class Container {
	// do not change the value of the following constant.
	protected final int ORIGINAL_SIZE = 10; 
	protected Object[] list; // is a container that stores the element of MyList
	protected Object[] set; // is a container that stores the element of MySet
	protected int size; // this variable holds the actual number of elements that are stored in either of the containers (i.e. MyList or MySet).
	
	public Container() {
		this.size =0;
		this.list = new Object[ORIGINAL_SIZE];
		this.set = new Object[ORIGINAL_SIZE];
	}
	/**
	 * This method adds the <code> obj </code> to the end of the container.
	 * @param obj is the object that is added to the container.
	 */
	void add(Object obj) {
		// insert your code here. Only one line should be added here. 
		list[size]=obj;
		size++;
//		set[size]=obj;
//		size++;
	}

	/**
	 * This method removes the <code> obj </code> from the container. 
	 * It shifts all the elements to make sure that removal of the element
	 * does not create a whole in the container.
	 * @param obj is the object that is removed from the container. 
	 * @return It returns the object that was removed.
	 */
	
	Object remove(Object obj) {
		Object removedObj = null; // Declare removedObj outside the if statement
	    // Find and remove object from the list
	    for (int i = 0; i < size; i++) {
	        if (list[i].equals(obj)) {
	            removedObj = list[i]; // Assign the value inside the if statement
	            // Shift elements to fill the gap
	            for (int j = i; j < size - 1; j++) {
	                list[j] = list[j + 1];
	            }
	            // Set the last element to null to avoid duplication
	            list[size - 1] = null;
	            size--;
	            return removedObj;
	        }
	    }
	    return null;
	}
	
	
	/**
	 * This method returns true if the container is empty.
	 * @return It returns true if the container is empty, otherwise false.
	 */
	boolean isEmpty() {
		// you may want to change the return value
		return size == 0;
	}
	
	
	/**
	 * This method returns the number of elements stored in the container.
	 * @return It returns the number of elements in the container.
	 */
	int getSize() {
		// you may wnat to change the return value
		return size;
	}
	

}

/**
 * 
 * This class simulates an ArrayList, where you can add unlimited number of 
 * elements to the list.
 *
 */
class MyList extends Container{
	/**
	 * This is the default constructor that sets all the instance variables to their defualt value. 
	 */
	public MyList () {
        super();

		//insert your code here 
	}
	
	/**
	 * This method returns the element that is stored at index <code> index </code>.
	 * @param index is the<code> index </code> at which the element is accessed and returned. 
	 * @return it returns the element stored at the given <code> index </code>.
	 */
	public Object get(int index) {
		// insert your code here, you may want to change the return value
		if (index >= 0 && index < size) {
            return list[index];
        }
		return null; 	
	}
	/**
	 * This method overrrides the <code> add </code> method defined in class <code> container</code>, by
	 * adding the <code> obj </code> to the back of <code> list </code> array. 
	 * The original size of the <code> array </code>, is defined by <code> ORIGINAL_SIZE </code>, however, it is possible that 
	 * more elements is added to this array. In case the array does not have enough capacity to add one more element, it grows itself 
	 * by doubling the size of <code> list </code> array.     
	 */
	@Override
	void add(Object obj) {
		
		if (size >= list.length) {
            Object[] newList = new Object[list.length * 2];
            System.arraycopy(list, 0, newList, 0, list.length);
            list = newList;
        }
//        super.add(obj);
        list[size++] = obj;

		// insert your code here
	}
	/**
	 * This method removes the first occurrence of <code> obj </code>
	 * from <code> list </code>
	 * @pre <code> obj </code> exists in the <code>list</code> array.
	 * 
	 */
	@Override
	Object remove(Object obj) {
		// insert your code here. You may wnat to change the return value
		return super.remove(obj);
	}

	/**
	 * This method returns the elements of the MyList in a form of 
	 * [obj1 obj2 obj3 ...]
	 */
	@Override
	public String toString() {
		// insert your code here. You may want to change the return value.
		StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(list[i]);
            if (i < size - 1) {
                result.append(" ");
            }
        }
        result.append("]");
		return result.toString();
	}


}

class MySet extends Container{
	public MySet() {
        super();

		// insert your code here.
	}
	
	/**
	 * This method overrrides the <code> add </code> method defined in class <code> container</code>, by
	 * adding the <code> obj </code> to the back of <code> set </code> array. 
	 * The original size of the <code> set </code>, is defined by <code> ORIGINAL_SIZE </code>, however, it is possible that 
	 * more elements is added to this set. In case the set does not have enough capacity to add one more element, it grows itself 
	 * by doubling the size of <code> set </code> array.      
	 */
	
	@Override
	void add(Object obj) {
		// Insert your code here.
		for (int i = 0; i < size; i++) {
            if (set[i].equals(obj)) {
                return; // Object already exists, do not add
            }
        }
		
        // Grow set if necessary
        if (size >= set.length) {
            Object[] newSet = new Object[set.length * 2];
            System.arraycopy(set, 0, newSet, 0, set.length);
            set = newSet;
        }
        set[size++] = obj;
//        size++;
	}
	/**
	 * This method removes the first occurrence of <code> obj </code>
	 * from <code> set </code>
	 * @pre <code> obj </code> exists in the <code>set</code> array.
	 * 
	 */
	@Override
	Object remove(Object obj) {
		// Insert your code here. You may want to change the return value. 
//		return super.remove(obj);
		for (int i = 0; i < size; i++) {
            if (set[i].equals(obj)) {
                Object removedObj = set[i];
                for (int j = i; j < size - 1; j++) {
                    set[j] = set[j + 1];
                }
                size--;
                return removedObj;
            }
        }
        return null;
	}


	/**
	 * This method returns the elements of the MySet in a form of 
	 * [obj1 obj2 obj3 ...]
	 */
	
	@Override
	public String toString() {
		// Insert your code here. You may want to change the return value. 
		StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(set[i]);
            if (i < size - 1) {
                result.append(" ");
            }
        }
        result.append("]");
		return result.toString();
		}
	
}

