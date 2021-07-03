package homework2;

import java.util.Random;

public class MyHomework {
    public static final int ARRAY_SIZE = 100000;

    public static void main(String[] args) {

        MyArrayList<Integer> arr1 = new MyArrayList<>(ARRAY_SIZE);
        MyArrayList<Integer> arr2 = new MyArrayList<>(ARRAY_SIZE);
        MyArrayList<Integer> arr3 = new MyArrayList<>(ARRAY_SIZE);
        int ranN;
        long time;

        Random random = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            ranN = random.nextInt(100000);
            arr1.add(ranN);
            arr2.add(ranN);
            arr3.add(ranN);
        }
        System.out.println("Start selectionSort");
        time = System.nanoTime();
        arr1.selectionSort();
        time = System.nanoTime() - time;
        System.out.printf("Elapsed %,9.3f ms\n", time/1_000_000.0);

        System.out.println("Start insertSort");
        time = System.nanoTime();
        arr2.insertionSort();
        time = System.nanoTime() - time;
        System.out.printf("Elapsed %,9.3f ms\n", time/1_000_000.0);

        System.out.println("Start bubbleSort");
        time = System.nanoTime();
        arr3.bubbleSort();
        time = System.nanoTime() - time;
        System.out.printf("Elapsed %,9.3f ms\n", time/1_000_000.0);

//        100000 items
//        Start selectionSort
//        Elapsed 165 637,950 ms
//        Start insertSort
//        Elapsed 168 944,570 ms
//        Start bubbleSort
//        Elapsed 272 073,806 ms

//        10000 items
//        Start selectionSort
//        Elapsed   375,125 ms
//        Start insertSort
//        Elapsed   376,568 ms
//        Start bubbleSort
//        Elapsed   868,555 ms

//        1000 items
//        Start selectionSort
//        Elapsed    30,779 ms
//        Start insertSort
//        Elapsed    14,374 ms
//        Start bubbleSort
//        Elapsed    25,786 ms
    }
}
