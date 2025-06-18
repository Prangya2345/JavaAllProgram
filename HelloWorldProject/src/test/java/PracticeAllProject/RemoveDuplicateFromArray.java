package PracticeAllProject;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		String[] names = {"Alice", "Bob", "Alice", "Charlie", "Bob"};

        // Step 1: Convert to Set to remove duplicates (preserves order)
        Set<String> uniqueNamesSet = new LinkedHashSet<>(Arrays.asList(names));

        // Step 2: Convert back to array if needed
        String[] uniqueNames = uniqueNamesSet.toArray(new String[0]);

        // Print result
        System.out.println(Arrays.toString(uniqueNames));
    }

	}


