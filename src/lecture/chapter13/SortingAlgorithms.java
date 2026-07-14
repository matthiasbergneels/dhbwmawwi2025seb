package lecture.chapter13;

public class SortingAlgorithms {

  static long quickSortSwapCount = 0;

  public static int[] bubbleSort(int[] numbers){

    long swapCount = 0;
    long startTime = System.nanoTime();

    for(int i = 0; i < numbers.length; i++){
      for(int j = 0; j < numbers.length-1; j++){
        if(numbers[j] > numbers[j+1]){
          swap(numbers, j, j+1);
          swapCount++;
        }
      }
    }

    long stopTime = System.nanoTime();
    printRuntimeDuration("BubbleSortV1", numbers.length, startTime, stopTime, swapCount);

    return numbers;
  }

  public static int[] bubbleSortV2(int[] numbers){

    long swapCount = 0;
    long startTime = System.nanoTime();

    for(int i = 0; i < numbers.length; i++){
      for(int j = 0; j < numbers.length-i-1; j++){
        if(numbers[j] > numbers[j+1]){
          swap(numbers, j, j+1);
          swapCount++;
        }
      }
    }

    long stopTime = System.nanoTime();
    printRuntimeDuration("BubbleSortV2", numbers.length, startTime, stopTime, swapCount);

    return numbers;
  }

  public static int[] bubbleSortV3(int[] numbers){

    long swapCount = 0;
    boolean swapped = true;
    int sortedArea = 1;
    long startTime = System.nanoTime();


    while(swapped){
      swapped = false;
      for(int j = 0; j < numbers.length-sortedArea; j++){
        if(numbers[j] > numbers[j+1]){
          swap(numbers, j, j+1);
          swapped = true;
          swapCount++;
        }
      }
      sortedArea++;
    }

    long stopTime = System.nanoTime();
    printRuntimeDuration("BubbleSortV3", numbers.length, startTime, stopTime, swapCount);

    return numbers;
  }

  private static void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }

  private static void printRuntimeDuration(String algorithmName, int elementCount, long startTime, long endTime, long swapCount){
    long durationInNanoSeconds = endTime - startTime;
    long durationInMilliSeconds = (long) (durationInNanoSeconds / 10e5);

    System.out.println("Runtime for " + elementCount + " Elements with " + algorithmName + ": " + durationInNanoSeconds + " ns (" + durationInMilliSeconds + " ms); swapped " + swapCount + " times");
  }
}