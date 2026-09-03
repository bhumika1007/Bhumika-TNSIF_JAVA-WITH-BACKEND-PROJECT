package STREAMAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StremFunctionsDemo {

    public static void main(String[] args) {

        List<String> strList = Arrays.asList(
            "Nashik", "", "Bangalore", "", "Chennai", "Mumbai", "Pune"
        );

        System.out.println("List of Cities is " + strList);

        // retrieve the stream
        Stream<String> stream = strList.stream();

        // Counting the empty strings
        long count = StreamFunctions.countEmptyStrings(stream);

        System.out.printf(
            "List %s has %d empty strings%n",
            strList, count
        );

        // Counting strings with length more than 8
        count = StreamFunctions.countStrings(strList.stream(), 8);

        System.out.printf(
            "List %s has %d strings of length more than 8%n",
            strList, count
        );

        // Remove all empty Strings from List
        List<String> filteredList =
            StreamFunctions.nonEmptyStringList(strList.stream());

        System.out.printf(
            "Original List : %s, List without Empty Strings : %s%n",
            strList, filteredList
        );

        // Strings with length more than 6
        filteredList = StreamFunctions.getStrings(strList.stream(), 6);

        System.out.printf(
            "Original List : %s, Cities length more than 6: %s%n",
            strList, filteredList
        );

        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

        Stream<Integer> stream1 = numbers.stream();

        // List of square of all distinct numbers
        List<Integer> filteredNumberList =
            StreamFunctions.getSquareList(stream1);

        System.out.printf(
            "Original List : %s, Square Without duplicates : %s%n",
            numbers, filteredNumberList
        );

        // Get count, min, max, sum, and average
        StreamFunctions.showStatistics(numbers.stream());
    }
}
