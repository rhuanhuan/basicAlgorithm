package linkedList;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/*
- FIFO
- When for-each, in the order of added order
 */
public class Queue<T> implements Iterable<T> {

  void enqueue(T item) {
  }

  // Remove the earliest enqueued element
  T dequequ(){
    return null;
  }

  boolean isEmpty(){
    return false;
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
