import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class LongestStringFinder {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("watermelon");
        strings.add("grapefruit");
        strings.add("kiwi");

        findLongestString(strings);
    }

    public static void findLongestString(ArrayList<String> strings) {
        // Using Stream API to find the longest string
        Optional<String> longestString = strings.stream()
                .max(Comparator.comparingInt(String::length));
        
        longestString.ifPresentOrElse(
                str -> System.out.println("Longest String: " + str),
                () -> System.out.println("The list is empty!")
        );
    }
}
