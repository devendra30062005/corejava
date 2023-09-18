package collection.shorting;

import java.util.Comparator;

public class OrderByMathDese implements Comparator<Marksheet>{
	
	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		return m2.getMaths() - m1.getMaths();
	}

}



