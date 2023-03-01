package ClassesDeOrdenacao;

public class MergeSort {
    public static void MakeMergeSort(int[] vetor, int primeiro, int ultimo) {
        if (primeiro < ultimo) {
            int meio = (primeiro + ultimo) / 2;
            MakeMergeSort(vetor, primeiro, meio);
            MakeMergeSort(vetor, meio + 1, ultimo);
            merge(vetor, primeiro, meio, ultimo);
        }
    }

    public static void merge(int[] vetor, int primeiro, int ultimo,int meio) {
        int[] vetorDois = new int[ultimo - primeiro + 1];
        int leftIndex = primeiro;
        int rightIndex = meio + 1;
        int tempIndex = 0;
        while (leftIndex <= meio && rightIndex <= ultimo) {
            if (vetor[leftIndex] <= vetor[rightIndex]) {
                vetorDois[tempIndex] = vetor[leftIndex];
                leftIndex++;
            } else {
                vetorDois[tempIndex] = vetor[rightIndex];
                rightIndex++;
            }
            tempIndex++;
        }
        while (leftIndex <= meio) {
            vetorDois[tempIndex] = vetor[leftIndex];
            leftIndex++;
            tempIndex++;
        }
        while (rightIndex <= ultimo) {
            vetorDois[tempIndex] = vetor[rightIndex];
            rightIndex++;
            tempIndex++;
        }
        for (int i = 0; i < vetorDois.length; i++) {
            vetor[primeiro + i] = vetorDois[i];
        }
    }
}