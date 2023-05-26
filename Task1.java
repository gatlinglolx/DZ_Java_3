// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.ArrayList;
import java.util.Collections;


public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < 9; i++) {
            arr.add(i);
        }
        System.out.println("ArrayList: " + arr);

        // for (int i = 0; i < arr.size(); i++) {
        //     int x = arr.get(i) % 2;
        //     if (x % 2 == 0) {
        //         arr.remove(i);
        //     }
        // }
        // Collections.sort(arr);
        // System.out.println("1) Удалены все четные числа: " + arr);

        int min = arr.get(0);
        int max = arr.get(0);
        float sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int x = arr.get(i);
            if (x < min) {
                min = x;
            } 
            if (x > max) {
                max = x;
            }
            sum += x;
        }
        float av = sum / arr.size();
        System.out.println("2) Мнимальное значение: " + min);
        System.out.println("3) Максимальное значение: " + max);
        System.out.println("4) Среднее значение: " + av);
    } 
}