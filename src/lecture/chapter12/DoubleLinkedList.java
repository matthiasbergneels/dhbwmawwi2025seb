package lecture.chapter12;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DoubleLinkedList<D> implements List<D> {

  @Override
  public int size() {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean contains(Object o) {
    return false;
  }

  @Override
  public Iterator<D> iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return null;
  }

  @Override
  public boolean add(D d) {
    return false;
  }

  @Override
  public boolean remove(Object o) {
    return false;
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends D> c) {
    return false;
  }

  @Override
  public boolean addAll(int index, Collection<? extends D> c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    return false;
  }

  @Override
  public void clear() {

  }

  @Override
  public D get(int index) {
    return null;
  }

  @Override
  public D set(int index, D element) {
    return null;
  }

  @Override
  public void add(int index, D element) {

  }

  @Override
  public D remove(int index) {
    return null;
  }

  @Override
  public int indexOf(Object o) {
    return 0;
  }

  @Override
  public int lastIndexOf(Object o) {
    return 0;
  }

  @Override
  public ListIterator<D> listIterator() {
    return null;
  }

  @Override
  public ListIterator<D> listIterator(int index) {
    return null;
  }

  @Override
  public List<D> subList(int fromIndex, int toIndex) {
    return List.of();
  }

  class DoubleLinkedListIterator implements ListIterator<D> {

    @Override
    public boolean hasNext() {
      return false;
    }

    @Override
    public D next() {
      return null;
    }

    @Override
    public boolean hasPrevious() {
      return false;
    }

    @Override
    public D previous() {
      return null;
    }

    @Override
    public int nextIndex() {
      return 0;
    }

    @Override
    public int previousIndex() {
      return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(D d) {

    }

    @Override
    public void add(D d) {

    }
  }
}
