package br.eti.clairton.instancebypriority;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Iterators {

	public static <T> Iterator<T> sort(final Iterator<T> iterator, final Comparator<T> comparator) {
		final List<T> list = new ArrayList<T>();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		Collections.sort(list, comparator);
		return list.iterator();
	}
	
	public static <T> Iterator<T> sort(final Iterator<T> iterator){
		return sort(iterator, new br.eti.clairton.instancebypriority.Comparator<T>());
	}
}
