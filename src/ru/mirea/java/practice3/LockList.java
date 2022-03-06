package ru.mirea.java.practice3;


import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockList<E> implements List<E> {
    private final List<E> list = new ArrayList<>();
    private static final Lock lock = new ReentrantLock();

    @Override
    public int size() {
        lock.lock();
        int size = list.size();
        lock.unlock();
        return size;
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        boolean isEmpty = list.isEmpty();
        lock.unlock();
        return isEmpty;
    }

    @Override
    public boolean contains(Object o) {
        lock.lock();
        boolean contains = list.contains(o);
        lock.unlock();
        return contains;
    }

    @Override
    public Iterator<E> iterator() {
        lock.lock();
        Iterator<E> iterator = list.iterator();
        lock.unlock();
        return iterator;
    }

    @Override
    public Object[] toArray() {
        lock.lock();
        Object[] array = list.toArray();
        lock.unlock();
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        lock.lock();
        Object[] array = list.toArray((Object[]) a);
        lock.unlock();
        return (T[]) array;
    }

    @Override
    public boolean add(E e) {
        lock.lock();
        boolean add = list.add(e);
        lock.unlock();
        return add;
    }

    @Override
    public boolean remove(Object o) {
        lock.lock();
        boolean remove = list.remove(o);
        lock.unlock();
        return remove;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        lock.lock();
        boolean containsAll = list.containsAll(c);
        lock.unlock();
        return containsAll;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        lock.lock();
        boolean addAll = list.addAll(c);
        lock.unlock();
        return addAll;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        lock.lock();
        boolean addAll = list.addAll(index, c);
        lock.unlock();
        return addAll;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        lock.lock();
        boolean removeAll = list.removeAll(c);
        lock.unlock();
        return removeAll;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        lock.lock();
        boolean retainAll = list.retainAll(c);
        lock.unlock();
        return retainAll;
    }

    @Override
    public void clear() {
        lock.lock();
        list.clear();
        lock.unlock();
    }

    @Override
    public E get(int index) {
        lock.lock();
        E get = list.get(index);
        lock.unlock();
        return get;
    }

    @Override
    public E set(int index, E element) {
        lock.lock();
        E set = list.set(index, element);
        lock.unlock();
        return set;
    }

    @Override
    public void add(int index, E element) {
        lock.lock();
        list.add(index, element);
        lock.unlock();
    }

    @Override
    public E remove(int index) {
        lock.lock();
        E remove = list.remove(index);
        lock.unlock();
        return remove;
    }

    @Override
    public int indexOf(Object o) {
        lock.lock();
        int indexOf = list.indexOf(o);
        lock.unlock();
        return indexOf;
    }

    @Override
    public int lastIndexOf(Object o) {
        lock.lock();
        int lastIndexOf = list.lastIndexOf(o);
        lock.unlock();
        return lastIndexOf;
    }

    @Override
    public ListIterator<E> listIterator() {
        lock.lock();
        ListIterator<E> listIterator = list.listIterator();
        lock.unlock();
        return listIterator;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        lock.lock();
        ListIterator<E> listIterator = list.listIterator(index);
        lock.unlock();
        return listIterator;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        lock.lock();
        List<E> subList = list.subList(fromIndex, toIndex);
        lock.unlock();
        return subList;
    }
}

