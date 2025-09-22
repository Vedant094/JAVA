package assignments;

import java.util.HashSet;

public class HashSetOperations {
    public static void main(String[] args) {
        // Create first HashSet
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(8);
        set1.add(9);

        // Create second HashSet
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(7);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Union
        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2); // adds elements of set2 into unionSet
        System.out.println("\nUnion : " + unionSet);

        // Intersection
        HashSet<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2); // retains only common elements
        System.out.println("Intersection : " + intersectionSet);

        // Difference (set1 - set2)
        HashSet<Integer> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2); // removes all elements of set2 from set1
        System.out.println("Difference : " + differenceSet);
    }
}
