package Initial_tasks;

import java.util.Random;

public class ArrayTask {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] copyArray = new int[array.length];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(901) + 100;
        }

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            copyArray[j] = array[i];
            System.out.println(copyArray[j]);
        }
    }
}
