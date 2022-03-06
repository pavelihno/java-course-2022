package ru.mirea.java.practice3;

import java.util.*;
import java.util.concurrent.Semaphore;

public class SemaphoreMap<K, V> implements Map<K, V> {
    private final Map<K, V> map = new HashMap<>();
    private final Semaphore semaphore = new Semaphore(1, true);

    @Override
    public int size() {
        int size = 0;
        try {
            semaphore.acquire();
            size = map.size();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = false;
        try {
            semaphore.acquire();
            isEmpty = map.isEmpty();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return isEmpty;
    }

    @Override
    public boolean containsKey(Object key) {
        boolean containsKey = false;
        try {
            semaphore.acquire();
            containsKey = map.containsKey(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return containsKey;
    }

    @Override
    public boolean containsValue(Object value) {
        boolean containsValue = false;
        try {
            semaphore.acquire();
            containsValue = map.containsValue(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return containsValue;
    }

    @Override
    public V get(Object key) {
        V get = null;
        try {
            semaphore.acquire();
            get = map.get(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return get;
    }

    @Override
    public V put(K key, V value) {
        V put = null;
        try {
            semaphore.acquire();
            put = map.put(key, value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return put;
    }

    @Override
    public V remove(Object key) {
        V remove = null;
        try {
            semaphore.acquire();
            remove = map.remove(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return remove;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        try {
            semaphore.acquire();
            map.putAll(m);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            map.clear();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    @Override
    public Set<K> keySet() {
        Set<K> keySet = new HashSet<>();
        try {
            semaphore.acquire();
            keySet = map.keySet();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return keySet;
    }

    @Override
    public Collection<V> values() {
        Collection<V> values = null;
        try {
            semaphore.acquire();
            values = map.values();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return values;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> entrySet = new HashSet<>();
        try {
            semaphore.acquire();
            entrySet = map.entrySet();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return entrySet;
    }
}
