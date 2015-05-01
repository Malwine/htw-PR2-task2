package ss2015_aufgabe2;

import java.util.Arrays;

/**
 * SortedSet is a class for a sorted set without any doubled integers.
 * @author Malwine
 *
 */
public class SortedSet implements MyComparable, MyPrintable {
	Integer[] set;
	
	public SortedSet() {
		set = new Integer[0];
	}
	
	//helper! take out later!
	void out(Object line) {
	    System.out.println(line);
	}

	public boolean insert(int num) {
		
		if( set.length == 0 ){				    //if array is empty
			set = new Integer[1];  				//create array with length 1
			set[0] = num;						//fill in number at first array spot
			out("Array was null");				//message
		}
		else {
			for(int i = 0; i< set.length; i++ ){ //if array is not empty - go through array
				if(set[i] == num){				 //if number at index is equal to num - exit
					out("number is double");     //message
					return false;				 //return false
				}
				else { 		 // if number at index is bigger then number
					out("added at the end");    //message
					Integer[] tempSet = new Integer[set.length + 1]; 
					for(int k = 0; k < tempSet.length -1; k++){
						tempSet[k] = set[k];
					}
					tempSet[tempSet.length-1] = num;
					out("filled");
					set = tempSet;
					Arrays.sort(set);
					return true;		
				}
			}
		}
		
		//in the end return true, when successful
		System.out.print("End: ");
		return true;
	}


	public boolean remove(int i) {
		// TODO
		return false;
	}
	
	public boolean insert(SortedSet s) {
		// TODO 
		return false;
	}

	@Override
	public void printElement(Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printElement(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean equal(Object set) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
