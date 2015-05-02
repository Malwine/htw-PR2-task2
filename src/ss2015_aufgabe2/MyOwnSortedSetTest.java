package ss2015_aufgabe2;

public class MyOwnSortedSetTest {
	
	static void out(Object line) {
	    System.out.println(line);
	}
	
	public static void testInsert(){
		SortedSet s1 = new SortedSet();
		
		out("Insert 3");
		out(s1.insert(3));
		out(s1.set[0]);
		out("Lenght:"+s1.set.length);
		
		out("----------");
		out("Insert 5");
		out(s1.insert(5));
		out(s1.set[0]);
		out(s1.set[1]);
		out("Lenght:"+s1.set.length);
		
		out("----------");
		
		out("Insert 1");
		out(s1.insert(1));
		out(s1.set[0]);
		out(s1.set[1]);
		out(s1.set[2]);
		out("Lenght:"+s1.set.length);
		
		out("----------");
		
		out("Insert 5");
		out(s1.insert(5));
		out(s1.set[0]);
		out(s1.set[1]);
		out(s1.set[2]);
		out("Lenght:"+s1.set.length);
		
		out("----------");
		
		out("Insert 4");
		out(s1.insert(4));
		out(s1.set[0]);
		out(s1.set[1]);
		out(s1.set[2]);
		out(s1.set[3]);
		out("Lenght:"+s1.set.length);
		
		out("----------");
		
		out("Insert 55");
		out(s1.insert(55));
		out(s1.set[0]);
		out(s1.set[1]);
		out(s1.set[2]);
		out(s1.set[3]);
		out(s1.set[4]);
		out("Lenght:"+s1.set.length);
	}
	
	public static void print(Integer[] set){
		for(int i = 0; i< set.length; i++){
			out(set[i]);
		}
	}
	
	public static void testRemove() {
		SortedSet s2 = new SortedSet();
		s2.remove(2);
		out(s2.insert(1));
		print(s2.set);
		out(s2.insert(3));
		print(s2.set);
		out(s2.insert(2));
		print(s2.set);
		out(s2.insert(5));
		print(s2.set);
		
		out(s2.insert(7));
		print(s2.set);
		
		out(s2.remove(2));
		print(s2.set);
		out(s2.remove(7));
		print(s2.set);
		
	}
	
	public static void testPrintElement() {
		SortedSet s2 = new SortedSet();
		out(s2.insert(1));
		print(s2.set);
		out(s2.insert(3));
		print(s2.set);
		out(s2.insert(2));
		print(s2.set);
		out(s2.insert(5));
		print(s2.set);
		out(s2.insert(7));
		print(s2.set);
		
		out(s2.remove(2));
		print(s2.set);
		
		out("Element an Stelle 2:");
		s2.printElement(2);
		
	}

	public static void main(String[] args) {
		//testInsert();
		
		//testRemove();
		
		testPrintElement();
	}

}
