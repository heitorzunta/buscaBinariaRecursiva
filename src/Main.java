public class Main {
    public static void main(String[] args) {

        int[] array = {1, 3, 5, 6, 8, 12, 19, 21, 27, 31, 35, 45, 80, 81, 82, 85, 87, 89, 95, 101, 200, 501, 707, 1000};

        buscaBinariaRecursiva busca = new buscaBinariaRecursiva(array);

        System.out.println(busca.buscaBinaria(89,0, array.length-1));


    }
}
