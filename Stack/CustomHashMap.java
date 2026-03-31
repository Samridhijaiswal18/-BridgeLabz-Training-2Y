import java.util.*;

class CustomHashMap<K, V> {

    // Node class
    class Node {
        K key;
        V value;
        Node next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity = 10;
    private Node[] buckets;

    public CustomHashMap() {
        buckets = new Node[capacity];
    }

    // Hash function
    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // Put (Insert/Update)
    public void put(K key, V value) {
        int index = getIndex(key);
        Node head = buckets[index];

        // Check if key already exists
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insert at beginning
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    // Get (Retrieve)
    public V get(K key) {
        int index = getIndex(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }

        return null;
    }

    // Remove (Delete)
    public void remove(K key) {
        int index = getIndex(key);
        Node head = buckets[index];
        Node prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    // Display map (for testing)
    public void display() {
        for (int i = 0; i < capacity; i++) {
            Node head = buckets[i];
            while (head != null) {
                System.out.println(head.key + " -> " + head.value);
                head = head.next;
            }
        }
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println(map.get("B")); // 2

        map.remove("B");
        System.out.println(map.get("B")); // null

        map.display();
    }
}