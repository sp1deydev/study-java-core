package Collections.Set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(5);
        for (int element : hashSet) {
            System.out.print(element + " ");
        }
    }
}
