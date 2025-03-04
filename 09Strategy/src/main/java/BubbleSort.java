public class BubbleSort implements SortingStrategy {
    // Optimized java implementation of Bubble sort


    // An optimized version of Bubble Sort
    @Override
    public boolean sort(int arr[], int x, int n) {

        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
        return true;
    }
}
// source https://www.geeksforgeeks.org/bubble-sort-algorithm/