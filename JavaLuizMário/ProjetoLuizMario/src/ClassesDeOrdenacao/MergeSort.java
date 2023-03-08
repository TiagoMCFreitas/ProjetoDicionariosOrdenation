package ClassesDeOrdenacao;

public class MergeSort {
     public static String[] MakeMergeSort(String[] palavra, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            MakeMergeSort(palavra, start, middle);
            MakeMergeSort(palavra, middle + 1, end);
            palavra = merge(palavra, start, middle, end);
        }
        return palavra;
    }

    private static String[] merge(String[] palavra, int start, int middle, int end) {
        int leftLength = middle - start + 1;
        int rightLength = end - middle;

        String[] leftArray = new String[leftLength];
        String[] rightArray = new String[rightLength];

        for (int i = 0; i < leftLength; i++) {
            leftArray[i] = palavra[start + i];
        }
        for (int j = 0; j < rightLength; j++) {
            rightArray[j] = palavra[middle + j + 1];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while (i < leftLength && j < rightLength) {
            int leftArrayI = leftArray[i].length();
            int rightArrayJ = rightArray[j].length();
            if (leftArrayI <= rightArrayJ) {
                palavra[k] = leftArray[i];
                i++;
            } else {
                palavra[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftLength) {
            palavra[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightLength) {
            palavra[k] = rightArray[j];
            j++;
            k++;
        }
        return palavra;
    }
}