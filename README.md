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
```
Será necessário uma implementação da interface FileService, recomendamos o uso do projeto https://github.com/clairton/exporter.


Se usar o maven, será necessário adicionar os repositórios:
```xml
<repository>
	<id>mvn-repo-releases</id>
	<url>https://raw.github.com/clairton/mvn-repo/releases</url>
</repository>
<repository>
	<id>mvn-repo-snapshot</id>
	<url>https://raw.github.com/clairton/mvn-repo/snapshots</url>
</repository>
```
 Também adicionar as depêndencias:
```xml
<dependency>
    <groupId>br.eti.clairton</groupId>
    <artifactId>instance-by-priority</artifactId>
    <version>0.1.0-SNAPSHOT</version><!--Ou versão mais recente-->
</dependency>
```
