import java.util.HashMap;
import java.util.LinkedList;

class MyData<K, V1, V2> {
    LinkedList<K> key = new LinkedList<K>();
    HashMap<K, V1> value1 = new HashMap<K, V1>();
    HashMap<K, V2> value2 = new HashMap<K, V2>();

    public void add(K key, V1 value1, V2 value2) {
        this.key.add(key);
        this.value1.put(key, value1);
        this.value2.put(key, value2);
    }

    public V1 getValue1(K key) {
        return this.value1.get(key);
    }

    public V2 getValue2(K key) {
        return this.value2.get(key);
    }

    public boolean contain(K key) {
        if(this.key.containsKey(key)) {
            return true;
        } else {
            return false;
        }
    }

}