package lecture.chapter13;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortingAlgorithmsTest {

    static final int COUNT = 50000;

    @Nested
    @DisplayName("Sort cases on random generated Arrays")
    class StandardRandomSortCases {
        static int[] toSort;

        @BeforeAll
        static void setUp() {
            toSort = generateUniqueRandomArray();
        }

        @Test
        void bubbleSort() {
            assertTrue(isSorted(SortingAlgorithms.bubbleSort(toSort.clone())),
                    "BubbleSort did not sort array correctly");
        }

        @Test
        void bubbleSortV2() {
            assertTrue(isSorted(SortingAlgorithms.bubbleSortV2(toSort.clone())),
                    "BubbleSortV2 did not sort array correctly");
        }

        @Test
        void bubbleSortV3() {
            assertTrue(isSorted(SortingAlgorithms.bubbleSortV3(toSort.clone())),
                    "BubbleSortV3 did not sort array correctly");
        }

      @Test
      void selectionSort() {
        assertTrue(isSorted(SortingAlgorithms.selectionSort(toSort.clone())),
          "SelectionSort did not sort array correctly");
      }

    }

    @Nested
    @DisplayName("Sort cases on ordered Arrays")
    class SortCasesOnOrderedArrays {
        static int[] toSort;

        @BeforeAll
        static void setUp() {
            toSort = generateOrderedArray();
        }

        @Test
        void bubbleSort() {
            assertTrue(isSorted(SortingAlgorithms.bubbleSort(toSort.clone())),
                    "BubbleSort did not sort ordered array correctly");
        }

        @Test
        void bubbleSortV2() {
            assertTrue(isSorted(SortingAlgorithms.bubbleSortV2(toSort.clone())),
                    "BubbleSortV2 did not sort ordered array correctly");
        }

        @Test
        void bubbleSortV3() {
            assertTrue(isSorted(SortingAlgorithms.bubbleSortV3(toSort.clone())),
                    "BubbleSortV3 did not sort ordered array correctly");
        }

        @Test
        void selectionSort() {
          assertTrue(isSorted(SortingAlgorithms.selectionSort(toSort.clone())),
            "SelectionSort did not sort array correctly");
        }

    }

    @Nested
    @DisplayName("Sort cases on reverse ordered Arrays")
    class SortCasesOnReverseOrderedArrays {
        static int[] toSort;

        @BeforeAll
        static void setUp() {
            toSort = generateReverseOrderedArray();
        }

        @Test
        void bubbleSort() {
            assertTrue(isSorted(SortingAlgorithms.bubbleSort(toSort.clone())),
                    "BubbleSort did not sort reverse-ordered array correctly");
        }

        @Test
        void bubbleSortV2() {
            assertTrue(isSorted(SortingAlgorithms.bubbleSortV2(toSort.clone())),
                    "BubbleSortV2 did not sort reverse-ordered array correctly");
        }

        @Test
        void bubbleSortV3() {
            assertTrue(isSorted(SortingAlgorithms.bubbleSortV3(toSort.clone())),
                    "BubbleSortV3 did not sort reverse-ordered array correctly");
        }

        @Test
        void selectionSort() {
          assertTrue(isSorted(SortingAlgorithms.selectionSort(toSort.clone())),
            "SelectionSort did not sort array correctly");
        }
    }

    // Helper Methods
    private static int[] generateUniqueRandomArray() {
        int[] array = new int[COUNT];
        for (int i = 0; i < COUNT; i++) array[i] = i + 1;
        Random rnd = new Random();
        for (int i = COUNT - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            int tmp = array[i]; array[i] = array[j]; array[j] = tmp;
        }
        return array;
    }

    private static int[] generateOrderedArray() {
        int[] array = new int[COUNT];
        for (int i = 0; i < COUNT; i++) array[i] = i + 1;
        return array;
    }

    private static int[] generateReverseOrderedArray() {
        int[] array = new int[COUNT];
        for (int i = 0; i < COUNT; i++) array[i] = COUNT - i;
        return array;
    }

    private static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) return false;
        }
        return true;
    }
}
