package lambdaexpression;

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
addAll
first
floor
ceiling
comparator
descendingIterator
descendingSet
headSet
higher
last
lower
pollFirst
pollLast
subSet
tailSet
equals
hashCode
removeAll
toString
toArray
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


public class TreeSetExample {

	public static void main(String[] args) {
		Set<Integer>set=new TreeSet<>();
		set.add(30);
		set.add(10);
		set.add(79);
		set.add(10);
//		set.add(null); // it is not allowed in this set because it internally compares the values of the set and
//		gives the answer in the sorted order.
		
//		set.add(null);// it is not allowed.
		for(Integer i:set) {
//			set.add(3);
			System.out.println(i);
		}

	}

}
