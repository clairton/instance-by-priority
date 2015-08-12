package br.eti.clairton.iterablebypriority;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import br.eti.clairton.iterablebypriority.Comparator;
import br.eti.clairton.iterablebypriority.Iterables;

public class IterablesTest {

	@Test
	public void test() {
		final List<Interface> collection = Arrays.asList(new Class1(), new Class4(), new Class3(), new Class2());
		final Iterable<Interface> iteratable = Iterables.sort(collection, new Comparator<Interface>());
		Integer count = 1;
		for (final Interface i : iteratable) {
			final String name = i.getClass().getName();
			assertTrue(name.contains("Class" + count));
			count++;
		}
	}

}
