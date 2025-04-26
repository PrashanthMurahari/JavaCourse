import com.google.gson.stream.JsonToken;

import java.util.Arrays;

public class AboutArrays {

    public static void main(String args[]) {
        // one-dimensional array
        String[] stringArrays = {"a", "b", "c"};
        System.out.println(Arrays.toString(stringArrays));

        // two-dimensional array
        String[][] multiArray = new String[10][10];

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = i + " " + j;
            }
        }

        for (String[] row : multiArray) {
            System.out.print("|");
            for (String column : row) {
                System.out.print(column + "|");
            }
            System.out.println();
        }

        int[] numberArray = new int[5];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }

        int[] numbersToCopy;
        // copy values from existing array to new array and copy only mentioned limit
        numbersToCopy = Arrays.copyOf(numberArray, 3);
        System.out.println(Arrays.toString(numbersToCopy));

        // copy values from the mentioned start index and end index
        numbersToCopy = Arrays.copyOfRange(numberArray, 2, 4);
        System.out.println(Arrays.toString(numbersToCopy));

        int[] numsToSort = new int[20];
        for (int i = 0; i < numsToSort.length; i++) {
            numsToSort[i] = (int) (Math.random() * 100);
        }
        // sort the array
        Arrays.sort(numsToSort);
        System.out.println(Arrays.toString(numsToSort));

        int whereIs40 = Arrays.binarySearch(numsToSort, 40);
        System.out.println(whereIs40);
    }
}
