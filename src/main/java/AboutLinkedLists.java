import java.util.Arrays;
import java.util.LinkedList;

import static Constants.Constants.kToJson;

public class AboutLinkedLists {

    public static void main(String args[]) {
        LinkedList<String> names = new LinkedList<>();
        names.add("M");
        names.add("B");
        names.add("C");

        names.add(1, "D");
        names.set(3, "E");

        names.addFirst("A");
        names.addLast("Z");
        names.remove("Z");
        names.remove(4);

        System.out.println("Get the first element of the linkedList " + names.getFirst());
        System.out.println("Get the last element of the linkedList " + names.getLast());

        LinkedList<String> namesCopy = new LinkedList<>(names);

        System.out.println("namesCopy " + kToJson(namesCopy));

        System.out.println("Finding index of any element " + names.indexOf("B"));

        // if the elements are empty then it will return null for peek function
        System.out.println("Get first element of the list " + names.peek());
        System.out.println("Get first element of the list " + names.peekFirst());
        System.out.println("Get last element of the list " + names.peekLast());
        System.out.println("Remove last element of the list " + names.poll());
        System.out.println("Remove first element of the list " + names.pollFirst());
        System.out.println("Remove lasr element of the list " + names.pollLast());

        names.push("G"); // add a element at the last to the list
        names.pop(); // removes the last element of the list

        Object[] arrayOfNames;
        arrayOfNames = names.toArray();
        System.out.println("Converted to arrays " + Arrays.toString(arrayOfNames));
    }
}
