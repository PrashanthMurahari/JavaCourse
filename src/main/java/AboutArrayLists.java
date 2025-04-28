import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AboutArrayLists {

    public static void main(String args[]) {

        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("G");

        names.add(2, "D");
        names.set(3, "F");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        names.remove(2);

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        List<String> namesCopy = new ArrayList<>();
        namesCopy.addAll(names);

        List<String> namesBackUp = new ArrayList<>();
        namesBackUp.addAll(names);

        names.add("E");

        if (names.contains("E")) {
            System.out.println("List contains E letter");
        }
        if (names.containsAll(namesCopy)) {
            System.out.println("names list contains all namesCopy values");
        }
        if (namesCopy.containsAll(names)) {
            System.out.println("namesCopy doesn't contain all names values");
        }

        namesCopy.remove("E");
        namesCopy.remove(1);

        namesCopy.clear();
        System.out.println("namesCopy list is empty " + namesCopy.isEmpty());

        Object[] arrayOfObjets;
        arrayOfObjets = names.toArray();

        System.out.println(Arrays.toString(arrayOfObjets));

    }
}
