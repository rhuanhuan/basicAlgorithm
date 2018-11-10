package linkedList;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/*
- LIFO
- When for-each, opposite to it's added order.
 */
public class Stack<T> implements Iterable<T> {

  void push(T item){

  }

  // Remove newest added element
  T pop(){
    return null;
  }

  boolean isEmpty(){
    return true;
  }

  int size(){
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
