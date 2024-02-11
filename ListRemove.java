import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListRemove {

    public static void main(String[] args) {
        List<String> progLangs = new ArrayList<>();

        progLangs.add("Java");
        progLangs.add("C#");
        progLangs.add("C");
        progLangs.add("C++");
        progLangs.add("Python");
        progLangs.add("Ruby");
        progLangs.add("JavaScript");
        progLangs.add("PHP");
        progLangs.add("Go");

        System.out.println("Initial List: " + "\n" + progLangs);

        // Remove the elem at index "5"
        progLangs.remove(2);
        System.out.println("After removing the element at index 2: " + "\n" + progLangs);

        // Remove the first occurrence of the given element from the ArrayList
        // (The remove() method returns false if the element does not exist in th
        boolean isRemoved = progLangs.remove("Ruby");
        System.out.println("After remove (\"Ruby\"): " + "\n" + progLangs);

        // Remove all elements that exist in the given list
        List<String> scriptLangs = new ArrayList<>();
        scriptLangs.add("Python");
        scriptLangs.add("Ruby");
        scriptLangs.add("Perl");

        progLangs.removeAll(scriptLangs);
        System.out.println("After removeAll(ScriptLangs): " + "\n" + progLangs);

        // Remove all elements that satisfy the given predicate
        progLangs.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("C");
            }
        });

        System.out.println("After removing all elements that start with \"C\": " + "\n" + progLangs);

        // Remove all elements from the ArrayList
        progLangs.clear();
        System.out.println("After clearing the list: " + "\n" + progLangs);
    }

}
