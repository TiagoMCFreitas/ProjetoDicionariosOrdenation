package Busca;

public class Busca {
    public static int sequential(String[] vetor, String word) throws Exception {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equalsIgnoreCase(word)) {
                return i;
            }
        }
        return -1;     
    }
    public static int binary(String[] palavra, String palavraBuscada, int inicio, int fim) throws Exception {
        int meio = (inicio + fim) / 2;
        if (palavraBuscada.length() == palavra[meio].length()) {
            if (palavraBuscada.equals(palavra[meio])) {
                return meio;
            } else {
                int i = meio;
                while (palavraBuscada.length() == palavra[i].length()) {
                    
                    if (palavraBuscada.equalsIgnoreCase(palavra[i])) {
                        return i;
                    }
                    i++;
                }
                i = meio;
                while (palavraBuscada.length() == palavra[i].length()) {
                    i--;
                    if (palavraBuscada.equals(palavra[i])) {
                        return i;
                    }
                }
            }
        } else if (palavraBuscada.length() < palavra[meio].length()) {
            return binary(palavra, palavraBuscada, inicio, (meio - 1));
        } else if(palavraBuscada.length() > palavra[meio].length()) {
            return binary(palavra, palavraBuscada, (meio + 1), fim);
        }

        return -1;
    }
}





