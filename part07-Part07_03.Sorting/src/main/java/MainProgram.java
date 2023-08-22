import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // int[] array = {3, 1, 5, 99, 3, 12};
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);

    }

    public static int smallest(int[] array) {
        int result = array[0];
        for (int i=0; i<array.length; i++) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        return result;
    }

    public static int indexOfSmallest(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i=0; i<array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int min = table[startIndex];
        int index = startIndex;
        for (int i=startIndex; i<table.length; i++) {
            if (min > table[i]) {
                min = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array,indexOfSmallestFrom(array, i), i);
        }
    }

}
