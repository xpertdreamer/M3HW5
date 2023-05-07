package customhashset;

import customhashmap.CustomHashMap;

public class CustomHashSet<E> {
    private CustomHashMap<E, Object> map;
    private static final Object PRESENT = new Object();

    public CustomHashSet() {
        map = new CustomHashMap<>();
    }

    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    public boolean remove(E e) {
        return map.remove(e);
    }

    public int size() {
        return map.size();
    }
}
