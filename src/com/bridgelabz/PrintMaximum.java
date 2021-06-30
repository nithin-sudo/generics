package com.bridgelabz;
public class PrintMaximum {
    /**
     * sorting the array by using bubble sort.
     * @param inputArray
     * @param <E>
     */
    public static <E extends Comparable> void sortArray(E[] inputArray) {
                for (int i = 0; i < inputArray.length; i++) {
                    for (int j = i + 1; j < inputArray.length; j++) {
                        if (inputArray[i].compareTo(inputArray[j]) > 0) {
                            E temp = inputArray[i];
                            inputArray[i] = inputArray[j];
                            inputArray[j] = temp;
                        }
                    }
                }
        printArray(inputArray);
    }
    /**
     * printing the array to the console.
     * @param inputArray
     * @param <E>
     */
    public static <E> void printArray(E[] inputArray){
        System.out.println("array elements after sorting:");
        for ( E i: inputArray){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {5,6,7,8};
        Double[] doubleArray = {4.22,2.22,3.22};
        sortArray(intArray);
        sortArray(doubleArray);
    }
}

