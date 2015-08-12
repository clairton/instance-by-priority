package br.eti.clairton.iterablebypriority;

import javax.annotation.Priority;

public class Comparator<T> implements java.util.Comparator<T> {

	@Override
	public int compare(final T o1, final T o2) {
		return getPriority(o1).compareTo(getPriority(o2));
	}
	
	
	private Integer getPriority(final T o){
		final Priority priority = o.getClass().getAnnotation(Priority.class);
		if(priority != null){
			return priority.value();
		}else{
			return -1;
		}
	}
}
