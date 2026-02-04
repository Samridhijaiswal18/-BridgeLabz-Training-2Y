import java.util.*;

public class InsertionSortIDs {

    public static void insertionSort(int[] ids) {
        int n = ids.length;

        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            // Insert key at correct position
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] ids = {104, 101, 109, 103, 102};

        insertionSort(ids);

        System.out.println("Sorted Employee IDs:");
        for (int id : ids) {
            System.out.print(id + " ");
        }
    }
}
