/* Create a Pair Class that takes two objects, one known as a key and the other the
corresponding object value. Create also the getKey(), setKey(), getValue(), and
setValue(). */

package lab12;

public class pair<K,V> {
	
	private K key;
	private V value;
	
	public pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}

}
