package modelos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import ClassesDeOrdenacao.BubbleSort;
import ClassesDeOrdenacao.InsertionSort;
import ClassesDeOrdenacao.MergeSort;
import ClassesDeOrdenacao.QuickSort;
public class main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int []vetor = new int [307374];
        String[]vetorString = new String[307374];
        int selecaoSort = 0;
        String arquivo = "./src/arquivoTXT/dicionario_port.txt";

        do{
        try{
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        
        for(int i = 0;i < vetorString.length;i++){
            vetorString[i] = br.readLine();
        }
        br.close();
        for(int a = 0; a < vetor.length;a++){
            vetor[a] = vetorString[a].length();
        }
        
       
        
        System.out.println("Informe o sort que deseja fazer: (1)BubbleSort (2)InsertionSort (3)MergeSort (4)QuickSort (5)Sair");
        selecaoSort = leia.nextInt();
    

        if(selecaoSort == 1){
            BubbleSort.MakeBubbleSort(vetor);
            for(int i = 0; i< vetor.length;i++){
                System.out.println(vetor[i]);
            }
        }
        if(selecaoSort == 2){
            InsertionSort.MakeInsertionSort(vetor);
            for(int i = 0; i< vetor.length;i++){
                System.out.println(vetor[i]);
            }
        }
        if(selecaoSort == 3){
            MergeSort.MakeMergeSort(vetor, 0, 307373);
            for(int i = 0; i< vetor.length;i++){
                System.out.println(vetor[i]);
            }
        }
        if(selecaoSort == 4){
            QuickSort.quickSort(vetor, 1, 307373);
            for(int i = 0; i< vetor.length;i++){
                System.out.println(vetor[i]);
            }
        }
    }catch(Exception e){
        System.out.println(e);
    }

    }while(selecaoSort != 5);


    }
}
