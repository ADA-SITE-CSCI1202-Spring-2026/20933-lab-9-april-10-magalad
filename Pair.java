public class Pair<K, V> {

    private K key;
    private V value;

    // Constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getters
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    // Setters
    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    // toString
    @Override
    public String toString() {
        return "Pair[" + key + ", " + value + "]";
    }

    // equals
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof Pair<?, ?>)) return false;

        Pair<?, ?> other = (Pair<?, ?>) obj;

        return this.key.equals(other.key) &&
               this.value.equals(other.value);
    }

    // Test (main method)
    public static void main(String[] args) {

        Pair<String, Integer> p1 = new Pair<>("Age", 20);
        Pair<String, Integer> p2 = new Pair<>("Age", 20);
        Pair<String, Double> p3 = new Pair<>("GPA", 3.8);

        System.out.println(p1);
        System.out.println(p3);

        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p1 equals p3: " + p1.equals(p3));
    }
}