package br.eti.clairton.instancebypriority;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Iterables {

	public static <T> Iterable<T> sort(final Iterable<T> iterable, final Comparator<T> comparator) {
		final List<T> list = new ArrayList<T>();
		for (final T t : iterable ) {
			list.add(t);
		}
		Collections.sort(list, comparator);
		return list;
	}
	
	public static <T> Iterable<T> sort(final Iterable<T> iterable){
		return sort(iterable, new br.eti.clairton.instancebypriority.Comparator<T>());
	}
}
