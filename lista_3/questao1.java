public class questao1 {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int[] vetorInvertido = new int[vetor.length];
        int j = 0;
        for (int i = vetor.length - 1; i >= 0; i--) {
            vetorInvertido[j] = vetor[i];
            j++;
        }
        for (int i = 0; i < vetorInvertido.length; i++) {
            System.out.println(vetorInvertido[i]);
        }
    }
}