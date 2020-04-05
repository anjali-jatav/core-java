package lambdaexpression;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*spliterator
add
remove
clone
clear
contains
isEmpty
iterator
size
equals
hashCode
removeAll
toString
toArray
addAll
containsAll
retainAll
wait
getClass
notify
notifyAll
stream
removeIf
parallelStream
forEach
*/


public class LinkedHashExample {

	public static void main(String[] args) {
		Set<Integer>set=new LinkedHashSet<>();
		set.add(90);
		set.add(30);
		set.add(20);
		set.add(70);
		set.add(null);
		System.out.println(set.size());
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
