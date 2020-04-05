package lambdaexpression;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*add
remove
clone
clear
contains
isEmpty
iterator
size
spliterator
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


public class HashSetExample {

	public static void main(String[] args) {
		Set<Integer>set=new HashSet<>();
		set.add(10);
		set.add(90);
		set.add(50);
		set.add(40);
//		set.add(null);
		System.out.println(set.size());
		for(Integer i:set) {
//			set.add(39);    // While iterating we cannot manipulate or change the value of the set because
//			 concurrent operations are not allowed in the set and it gives the ConcurrentModificationException
//			 and this concept is known as Fail-fast.
			System.out.println(i);
		}

	}

}
