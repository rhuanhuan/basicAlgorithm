package linkedList.basicImplement;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/*
- Bag do not support remove element, it's a collection for all to use.
- unordered
*/
public class Bag<T> implements Iterable<T> {

  public void add(T item) {
  }

  public boolean isEmpty() {
    return false;
  }

  public int size(){
    return 0;
  }


  @Override
  public Iterator<T> iterator() {
    return null;
  }

  @Override
  public void forEach(Consumer<? super T> action) {

  }

  @Override
  public Spliterator<T> spliterator() {
    return null;
  }
}
