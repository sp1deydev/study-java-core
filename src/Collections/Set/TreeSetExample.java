package Collections.Set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(5);
        for (int element : treeSet) {
            System.out.print(element + " ");
        }
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Banana");
        treeSet2.add("Coconut");
        treeSet2.add("Apple");
        System.out.print("\n");
        for (String element : treeSet2) {
            System.out.print(element + " ");
        }
    }
}
