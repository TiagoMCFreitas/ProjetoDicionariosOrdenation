package ClassesDeOrdenacao;

public class InsertionSort {
    
    public static void MakeInsertionSort(int vetor[]){
        for(int i = 1; i <= (vetor.length - 1);i++ ){
            int v = vetor[i];
            int j = i;
            while(j > 0 && vetor[j-1] > v){
                vetor[j] = vetor[j-1];
                j = j - 1;
            }
            vetor[j] = v;
        }   
    }
}
