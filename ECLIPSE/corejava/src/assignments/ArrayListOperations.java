package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {
    public static void main(String[] args) {
        // 1. Create a new ArrayList and add some colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");
        System.out.println("Original ArrayList: " + colors);

        // 2. Iterate through all elements in the ArrayList
        System.out.println("\nIterating through ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }

        // 3. Insert an element at the first position
        colors.add(0, "Black");
        System.out.println("\nAfter inserting 'Black' at first position: " + colors);

        // 4. Retrieve an element at a specified index
        String elementAt2 = colors.get(2);
        System.out.println("\nElement at index 2: " + elementAt2);

        // 5. Update specific array element
        colors.set(3, "Purple");
        System.out.println("\nAfter updating element at index 3 with 'Purple': " + colors);

        // 6. Remove the third element
        colors.remove(2);
        System.out.println("\nAfter removing 3rd element: " + colors);

        // 7. Search an element in an ArrayList
        String searchColor = "Green";
        if (colors.contains(searchColor)) {
            System.out.println("\n'" + searchColor + "' is found in the ArrayList.");
        } else {
            System.out.println("\n'" + searchColor + "' is not found in the ArrayList.");
        }

        // 8. Sort the ArrayList
        Collections.sort(colors);
        System.out.println("\nAfter sorting: " + colors);

        // 9. Copy one ArrayList into another
        ArrayList<String> copyList = new ArrayList<>(colors);
        System.out.println("\nCopied ArrayList: " + copyList);

        // 10. Shuffle elements
        Collections.shuffle(colors);
        System.out.println("\nAfter shuffling: " + colors);

        // 11. Reverse elements
        Collections.reverse(colors);
        System.out.println("\nAfter reversing: " + colors);

        // 12. Extract a portion of ArrayList
        ArrayList<String> subList = new ArrayList<>(colors.subList(1, 4));
        System.out.println("\nExtracted portion (index 1 to 3): " + subList);

        // 13. Replace the second element
        colors.set(1, "White");
        System.out.println("\nAfter replacing 2nd element with 'White': " + colors);
    }
}
