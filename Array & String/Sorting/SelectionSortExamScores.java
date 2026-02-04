import java.util.Arrays;

public class SelectionSortExamScores {
    public static void main(String[] args) {
        int[] scores = {78, 45, 90, 62, 55};

        selectionSort(scores);

        System.out.println("Sorted exam scores: " + Arrays.toString(scores));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find minimum in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
