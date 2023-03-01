package ClassesDeOrdenacao;

public class BubbleSort {
    
    public static void MakeBubbleSort(int vetor[]){
        for(int i = vetor.length - 1;i >= 1;i--){
            for(int j = 1;j <= i;j++){
                if(vetor[j-1]>vetor[j]){
                    int t = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = t;
                }
            }
        }
    }
}
