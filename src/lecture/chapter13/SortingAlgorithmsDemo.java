package lecture.chapter13;

import java.util.Arrays;

public class SortingAlgorithmsDemo {

    public static void main(String[] args) {

        int[] toSort = {50, 70, 100, 80, 40, 30, 20, 10, 60};
        System.out.println("Unsortiert: " + Arrays.toString(toSort));

        System.out.println("Sortierte Arrays:");
        System.out.println("===================");
        System.out.println("Bubble Sort V1 sortiert: " + Arrays.toString(SortingAlgorithms.bubbleSort(toSort.clone())));
        System.out.println("Bubble Sort V2 sortiert: " + Arrays.toString(SortingAlgorithms.bubbleSortV2(toSort.clone())));
        System.out.println("Bubble Sort V3 sortiert: " + Arrays.toString(SortingAlgorithms.bubbleSortV3(toSort.clone())));
    }
}
