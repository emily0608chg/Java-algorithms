package practice.book;

import java.util.ArrayList;
import java.util.Hashtable;

public class SortedHashTable<K, V> {

    private Hashtable<K, V> table = null;
    private ArrayList<K> keys = null;

    public SortedHashTable() {
        table = new Hashtable<K, V>();
        keys = new ArrayList<K>();
    }

    public void put(K key, V value) {
        keys.add(key);
        table.put(key, value);
    }

    public int keyCount() {
        return keys.size();
    }

    public K getKeyAt(int i) {
        return keys.get(i);
    }

    public V get(K key) {
        return table.get(key);
    }


}
