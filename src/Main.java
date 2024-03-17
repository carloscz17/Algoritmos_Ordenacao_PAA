import java.util.Arrays;
import metodos.BuscaBinaria;
import metodos.BubbleSort;
import metodos.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 31, 14, 103, 20};
        // Bubble Sort
        System.out.println("Lista não ordenada: " + Arrays.toString(arr));
        BubbleSort.bubbleSort(arr);
        System.out.println("Lista ordenada: " + Arrays.toString(arr));
        System.out.println("---------------------------------------------");

        // Selection Sort
        System.out.println("Lista não ordenada: " + Arrays.toString(arr));
        SelectionSort.selectionSort(arr);
        System.out.println("Lista ordenada: " + Arrays.toString(arr));
        System.out.println("---------------------------------------------");

        // Busca Binária
        int target = 20;
        int result = BuscaBinaria.BuscaBinaria(arr, target);
        if (result != -1) {
            System.out.println("O elemento " + target + " está presente no índice " + result);
        } else {
            System.out.println("O elemento " + target + " não está presente na lista");
        }
    }
}
