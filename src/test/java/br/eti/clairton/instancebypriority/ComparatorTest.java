package br.eti.clairton.instancebypriority;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Priority;

import org.junit.Test;

public class ComparatorTest {

	@Test
	public void test() {
		final List<Interface> collection = Arrays.asList(new Class1(), new Class4(), new Class3(), new Class2());
		final Iterator<Interface> iterator = collection.iterator();
		Collections.sort(collection, new Comparator<Interface>());
		Integer count = 1;
		while (iterator.hasNext()) {
			final Interface instance = iterator.next();
			final String name = instance.getClass().getName();
			assertTrue(name.contains("Class"+count));
			count++;
		}
	}
	
	interface Interface{
		
	}

	@Priority(1)
	class Class1 implements Interface{

	}

	@Priority(2)
	class Class2 implements Interface{

	}

	@Priority(3)
	class Class3 implements Interface{

	}

	@Priority(4)
	class Class4 implements Interface{

	}
}
