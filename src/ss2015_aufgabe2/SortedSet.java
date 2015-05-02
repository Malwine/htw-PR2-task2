package ss2015_aufgabe2;

import java.util.Arrays;


/**
 * SortedSet is a class for a sorted array without any doubled integers.
 * @author Malwine
 *
 */
public class SortedSet implements MyComparable, MyPrintable {
	Integer[] set;
	
	public SortedSet() {
		set = new Integer[0];
	}
	
	//helper! take out later with all debug messages!
	void out(Object line) {
	    System.out.println(line);
	}

	public boolean insert(int num) {
		
		boolean shouldAdd = false;
		
		if( set.length == 0 ){				    //if array is empty
			set = new Integer[1];  				//create array with length 1
			set[0] = num;						//fill in number at first array spot
			return true;
		}
		else {
			for(int i = 0; i< set.length; i++ ){ //if array is not empty - go through array
				shouldAdd = false;
				if(set[i] == num){				 //if number at index is equal to num - exit
					return false;				 //return status false = contains num already
					
				}
				else { 		 					// if array has ints then set shouldAdd to true
					shouldAdd = true;			// set only boolean because otherwise loop ends here (hacky)
				}
			}
			if(shouldAdd == true) {				//if shouldAdd is true add num and sort
				Integer[] tempSet = new Integer[set.length + 1]; //new temprary array
				for(int k = 0; k < tempSet.length -1; k++){      //fill temporary array with original array
					tempSet[k] = set[k];
				}
				tempSet[tempSet.length-1] = num;				 //fill num in last field of array
				set = tempSet;									 //set set-array to temporary array
				Arrays.sort(set);								 //sort the array
				return true;									 //return status true = was inserted
			}
		}
		return false;
	}


	public boolean remove(int num) {
		
		if( set.length == 0 ){				    //if array is empty
			return false;
		}
		else {
			for (int i = 0; i < set.length; i++) { //go through array 
				 if (set[i] == num) {			   					 //if number at index equals num
					 Integer[] tempSet = new Integer[set.length -1]; //create temp array
					 for (int j = 0; j < i; j++) {					 //fill temp array with numbers before num
						 tempSet[j] = set[j];
					 }
					 for (int k = i+1; k < set.length; k++) { 		 //fill temp with numbers after num
						 tempSet[k-1] = set[k];
					 }
					 set = tempSet;                  				 //set set-array to temp-array
					 return true;
				 }
			}	
		}
		return false;
	}
	
	public boolean insert(SortedSet s) {
		// TODO 
		return false;
	}

	@Override
	public void printElement(Object o) {
		boolean containsElement = false;
		
		if (o instanceof Integer){
			Integer element = (Integer)o;
			
			for(int i = 0; i< set.length; i++){
				if(set[i]== (int)element){
					containsElement = true;
				}
			}
			if(containsElement){
				System.out.print(element);
			}
			else {
				System.out.println("not a number or not in the set");
			}
			
		}
		else {
			System.out.println("not a number or not in the set");
		}
		
	}

	@Override
	public void printElement(int index) {
		if(index < set.length && index > 0){
			System.out.println(set[index]);
		}
		else{
			System.out.println("index out of bounds");
		}
	}

	@Override
	public void printAll() {
		System.out.print(set.length);
		System.out.print(" : [ ");
		for(int i = 0; i < set.length - 1; i++){
			System.out.print(set[i] + ", ");
		}
		System.out.print(set[set.length-1]);
		System.out.print(" ]");
	}

	@Override
	public boolean equal(Object o) {
		boolean isEqual = false;
		
		if (o instanceof SortedSet){
			SortedSet s1 = (SortedSet)o;
			if(this.set.length == s1.set.length){
				
				for(int i = 0; i < this.set.length; i++){
					if(this.set[i] == s1.set[i]){
						isEqual = true;
					}
					else {
						isEqual = false;
					}
				}
				if(isEqual){
					return true;
				}
				
			}
			else {
				out("Not same size, not equal");
				return false;
			}
			
		}
		return false;
	}

	
	
}
