import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Swap(array, 0,8);
        transformation(list, array);





    }

    public static int[] Swap(int[] array1, int firstInd, int secondind) {
        System.out.println("Задание 1: ");
        System.out.println("Исходный массив: " + Arrays.toString(array1));
            int num;
            for (int i = 0; i < array1.length; i++) {
                num = array1[secondind];
                array1[secondind] = array1[firstInd];
                array1[firstInd] = num;
            }
        System.out.println("Массив с измененными позициями эллементов " +  Arrays.toString(array1));
        return array1;
    }
    public static void transformation(ArrayList  list, int[] array) {
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        System.out.println("Задание 2: ");
        System.out.println("Печатаем коллекцию с добавленым в нее массивом "+list);
    }
}
