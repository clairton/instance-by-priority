package br.eti.clairton.instancebypriority;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ComparatorTest {

	@Test
	public void test() {
		List<Interface> collection = Arrays.asList(new Class1(), new Class4(), new Class3(), new Class2());
		Iterator<Interface> iterator = collection.iterator();
		Collections.sort(collection, new Comparator<Interface>());
		Integer count = 1;
		while (iterator.hasNext()) {
			Interface instance = iterator.next();
			final String name = instance.getClass().getName();
			assertTrue(name.contains("Class"+count));
			count++;
		}
	}
}
