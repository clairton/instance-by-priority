# instance-by-priority[![Build Status](https://drone.io/github.com/clairton/instance-by-priority/status.png)](https://drone.io/github.com/clairton/instance-by-priority/latest)

```java
@Priority(1)
class Class1{
}
@Priority(2)
class Class4{
}
final List<?> collection = Arrays.asList(new Class4(), new Class1());
final Iterator<?> iterator = Iterators.sort(collection.iterator(), new Comparator<?>());
while (iterator.hasNext()) {
	String name = iterator.next().getClass().getName();
	System.err.println(name);//print class1 and after class4
}
```
