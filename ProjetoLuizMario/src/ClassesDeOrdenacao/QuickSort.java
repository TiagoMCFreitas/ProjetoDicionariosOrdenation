package ClassesDeOrdenacao;

public class QuickSort {
    private static void swap(String[] palavra, int i, int j) {
        String temp = palavra[i];
        palavra[i] = palavra[j];
        palavra[j] = temp;
    }

    private static int partition(String[] array, int low, int high) {
        String pivot = array[low];
        int i = low - 1, j = high + 1;

        while (true) {
            do {
                i++;
            } while (array[i].length() < pivot.length());

            do {
                j--;
            } while (array[j].length() > pivot.length());

            if (i >= j) {
                return j;
            }
            swap(array, i, j);
        }
    }

    public static String[] quickSort(String[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot);
            quickSort(array, (pivot + 1), high);
        }
        return array;
    }
}

