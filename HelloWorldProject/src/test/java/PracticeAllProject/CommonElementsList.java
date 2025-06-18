package PracticeAllProject;


import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class CommonElementsList {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> list2 = Arrays.asList("banana", "date", "fig", "grape");

        List<String> commonElements = new ArrayList<>();

        for (String item1 : list1) {
            for (String item2 : list2) {
                if (item1.equals(item2) && !commonElements.contains(item1)) {
                    commonElements.add(item1);
                }
            }
        }

        System.out.println("Common elements: " + commonElements);
    }
}