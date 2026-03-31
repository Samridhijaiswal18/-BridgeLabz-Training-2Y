import java.util.*;

class CircularTour {

    static class PetrolPump {
        int petrol, distance;

        PetrolPump(int p, int d) {
            petrol = p;
            distance = d;
        }
    }

    static int findStart(PetrolPump[] arr) {
        int n = arr.length;

        Queue<Integer> q = new LinkedList<>();
        int start = 0;
        int currPetrol = 0;

        while (start < n) {

            // Add pumps to queue
            while (q.size() < n) {
                int i = (start + q.size()) % n;
                q.add(i);
                currPetrol += arr[i].petrol - arr[i].distance;

                if (currPetrol < 0) break;
            }

            // If full tour possible
            if (q.size() == n && currPetrol >= 0) {
                return start;
            }

            // Remove front and adjust
            if (!q.isEmpty()) {
                int removed = q.poll();
                currPetrol -= arr[removed].petrol - arr[removed].distance;
            }

            start++;
        }

        return -1; // No valid start
    }

    public static void main(String[] args) {
        PetrolPump[] arr = {
            new PetrolPump(6, 4),
            new PetrolPump(3, 6),
            new PetrolPump(7, 3)
        };

        System.out.println(findStart(arr)); // Output: 2
    }
}