package ss2015_aufgabe2;

public class MyOwnSortedSetTest {
	
	static void out(Object line) {
	    System.out.println(line);
	}

	public static void main(String[] args) {
		
		SortedSet s1 = new SortedSet();
		
		out(s1.insert(3));
		out(s1.set[0]);
		out("Lenght:"+s1.set.length);
		
		out("----------");
		
		out(s1.insert(2));
		out(s1.set[1]);
		out("Lenght:"+s1.set.length);
		
		out("----------");
		
		out(s1.insert(4));
		out(s1.set[2]);
		out("Lenght:"+s1.set.length);
	}

}
