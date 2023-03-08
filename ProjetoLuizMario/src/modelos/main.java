package modelos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.SocketTimeoutException;
import java.util.Scanner;
import Busca.Busca;
import ClassesDeOrdenacao.BubbleSort;
import ClassesDeOrdenacao.MergeSort;
import ClassesDeOrdenacao.QuickSort;
import ClassesDeOrdenacao.InsertionSort;
public class main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int selecaoSort = 0;
        int selecao = 0;
        String arquivo;
        String[]vetor;
      
        vetor = new String[355821];
            
    do{
        try{
            
        // FileWriter fw = new FileWriter(arquivo,true);
        // BufferedWriter bw = new BufferedWriter(fw);
        System.out.println("Olá, seja bem vindo! " + "\n");
        System.out.println("#############################" + "\n");
        System.out.println("O que deseja fazer? " + "\n");
        
        System.out.println("(1) Buscas: " + "\n" + "(2) Sorts: " + "\n" + "Para sair digite (0)");
        selecao = leia.nextInt();
        
        while(selecao == 1){
        arquivo = "./src/arquivoTXT/dicionario_ordenado.txt";
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        for(int i = 0;i < vetor.length;i++){
            vetor[i] = br.readLine();   
        }
        String palavra = "";
        System.out.println("Informe a palavra a ser buscada: ");
        palavra = leia.next();
        
        System.out.println(Busca.sequential(vetor,palavra) + " Sequencial");
        System.out.println(Busca.binary(vetor, palavra, 0, vetor.length - 1) + " Binária");
        System.out.println("\n" + "Menu(3)" + "\n" + "Continuar (1)");
        selecao = leia.nextInt();
        }
        if(selecao == 2){
            arquivo = "./src/arquivoTXT/dicionario_desordenado.txt";
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);   
            System.out.println("Informe o sort que deseja fazer: ");
            String saida = "(1) BubbleSort: " + "\n";
            saida += "(2) InsertionSort: " + "\n";
            saida += "(3) MergeSort: " + "\n";
            saida += "(4) QuickSort: " + "\n";
            System.out.println(saida);
            selecaoSort = leia.nextInt();
            for(int i = 0;i < vetor.length;i++){
                vetor[i] = br.readLine();   
            }
        if(selecaoSort == 1){
            Long tempoInicial = System.currentTimeMillis();

            BubbleSort.MakeBubbleSort(vetor);
            System.out.println("VETOR ORDENADO");

            for(int i = 0; i< vetor.length;i++){
                System.out.println(vetor[i]);
            }
            System.out.println("VETOR ORDENADO" + "\n" + "TEMPO GASTO: " + ((System.currentTimeMillis() - tempoInicial)/1000) + " segundos");
        }
        if(selecaoSort == 2){
            Long tempoInicial = System.currentTimeMillis();
            InsertionSort.MakeInsertionSort(vetor);

            for(int i = 0; i< vetor.length;i++){
                System.out.println(vetor[i]);
            }
            System.out.println("VETOR ORDENADO" + "\n" + "TEMPO GASTO: " + ((System.currentTimeMillis() - tempoInicial)/1000) + " segundos");

        }
        if(selecaoSort == 3){
            Long tempoInicial = System.currentTimeMillis();

            MergeSort.MakeMergeSort(vetor, 0, vetor.length - 1);
            System.out.println("VETOR ORDENADO");

            for(int i = 0; i< vetor.length;i++){
                System.out.println(vetor[i].length());
                
            }
            System.out.println("VETOR ORDENADO" + "\n" + "TEMPO GASTO: " + ((System.currentTimeMillis() - tempoInicial)/1000) + " segundos");
        }
        if(selecaoSort == 4){
            Long tempoInicial = System.currentTimeMillis();

            QuickSort.quickSort(vetor, 0,vetor.length - 1);
            System.out.println("VETOR ORDENADO");
            for(int i = 0; i< vetor.length;i++){
                System.out.println(vetor[i].length());
                
            }
            System.out.println("VETOR ORDENADO" + "\n" + "TEMPO GASTO: " + ((System.currentTimeMillis() - tempoInicial)/1000) + " segundos");
        }
        System.out.println("\n" + "Menu(3)" + "\n" + "Continuar (1)");
        selecao = leia.nextInt();
        }
        
    }catch(Exception e){
        System.out.println(e);
    }
    }while(selecao != 0);
    
    }
}
