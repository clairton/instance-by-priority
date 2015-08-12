package br.eti.clairton.iterablebypriority;

import javax.annotation.Priority;

public class Comparator<T> implements java.util.Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		return getPriority(o1).compareTo(getPriority(o2));
	}
	
	
	private Integer getPriority(T o){
		Priority priority = o.getClass().getAnnotation(Priority.class);
		if(priority != null){
			return priority.value();
		}else{
			return -1;
		}
	}
}
