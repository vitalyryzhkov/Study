package harder_tasks;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("Введите %d-й массива: ", i+1);
            array[i] = scanner.nextInt();
        }

        System.out.println("Массив после сортировки: ");
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + "-й элемент массива: " + array[i]);
        }

    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
