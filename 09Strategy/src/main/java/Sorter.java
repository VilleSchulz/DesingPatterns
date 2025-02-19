import java.util.Random;

public class Sorter extends Thread {


    public static void main(String[] args) {
        int[] array = new int[30];
        int[] array2 = new int[30];
        int[] array3 = new int[30];
        int[] array4 = new int[100000];
        int[] array5 = new int[100000];
        int[] array6 = new int[100000];
        Random random = new Random();


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);

        }
        //make a copy of the array
        System.arraycopy(array, 0, array2, 0, array.length);
        System.arraycopy(array, 0, array3, 0, array.length);

        for (int i = 0; i < array4.length; i++) {
            array4[i] = random.nextInt(100);

        }

        // Copy the contents of array4 to array5 and array6
        System.arraycopy(array4, 0, array5, 0, array4.length);
        System.arraycopy(array4, 0, array6, 0, array4.length);


        Thread bubleSort = new Thread(() -> {
            SortingContext sortingContext = new SortingContext(new BubbleSort());
            //10 items
            long startTime = System.nanoTime();
            sortingContext.sort(array);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Bubble Sort 10 items: " + duration + " nanoseconds");
            //100000 items
            startTime = System.nanoTime();
            sortingContext.sort(array3);
            endTime = System.nanoTime();
            duration = (endTime - startTime);
            System.out.println("Bubble Sort 100000 items: " + duration + " nanoseconds");


        });


        Thread mergeSort = new Thread(() -> {

            SortingContext sortingContext = new SortingContext(new MergeSort());
            //10 items
            long startTime = System.nanoTime();
            sortingContext.sort(array2);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Merge Sort 10 items: " + duration + " nanoseconds");
            //100000 items
            startTime = System.nanoTime();
            sortingContext.sort(array4);
            endTime = System.nanoTime();
            duration = (endTime - startTime);
            System.out.println("Merge Sort 100000 items: " + duration + " nanoseconds");

        });

        Thread quickSort = new Thread(() -> {

            SortingContext sortingContext = new SortingContext(new QuickSort());
            //10 items
            long startTime = System.nanoTime();
            sortingContext.sort(array3);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Quick Sort 10 items: " + duration + " nanoseconds");
            //100000 items
            startTime = System.nanoTime();
            sortingContext.sort(array5);
            endTime = System.nanoTime();
            duration = (endTime - startTime);
            System.out.println("Quick Sort 100000 items: " + duration + " nanoseconds");

        });

//start sorting competition
        bubleSort.start();
        mergeSort.start();
        quickSort.start();


    }


}
