 package ClassesDeOrdenacao;

 public class InsertionSort {
    public static String[] MakeInsertionSort(String[] palavra) {
        for (int i = 0; i < palavra.length; i++) {
            String aux = palavra[i];
            int j = i;
            while (j > 0 && palavra[j - 1].length() > aux.length()) {
                palavra[j] = palavra[j - 1];
                j -= 1;
            }
            palavra[j] = aux;
        }

        return palavra;
    }
}
