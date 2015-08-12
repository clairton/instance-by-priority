package br.eti.clairton.iterablebypriority;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import br.eti.clairton.iterablebypriority.Comparator;
import br.eti.clairton.iterablebypriority.Iterators;

public class IteratorsTest {

	@Test
	public void test() {
		final List<Interface> collection = Arrays.asList(new Class1(), new Class4(), new Class3(), new Class2());
		final Iterator<Interface> iterator = Iterators.sort(collection.iterator(), new Comparator<Interface>());
		Integer count = 1;
		while (iterator.hasNext()) {
			final Interface i = iterator.next();
			final String name = i.getClass().getName();
			assertTrue(name.contains("Class" + count));
			count++;
		}
	}

}
