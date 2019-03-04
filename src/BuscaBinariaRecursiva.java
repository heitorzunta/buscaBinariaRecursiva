public class BuscaBinariaRecursiva {

    protected int[] vetor;

    public BuscaBinariaRecursiva(int[] vetor){
        this.vetor = vetor;
    }

    public int buscaBinaria(int num, int start, int end){
        int mid = media(start, end);

        if(vetor[mid] == num) return mid; //condicao de encontrar o elemento
        if(start > end) return -1; //condição de parada: não encontrei o elemento no vetor

        if(vetor[mid] < num) return buscaBinaria(num, mid+1, end); //metade a cima
        else return buscaBinaria(num, start, mid-1); //metade abaixo
    }

    public int media(int start, int end){
        return (start+end)/2;
    }


}
