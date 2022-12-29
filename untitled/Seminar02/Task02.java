package untitled.Seminar02;
//Используем наш код который мы писали на семинаре и дорабатываем, нужно сделать так чтобы мы могли написать формулу
//и заполнить все элементов которые сами же и ввели
//Например
//a + b + c
//2
//3
//4
//ответ 9

import java.util.Map;
import java.util.Scanner;
import java.util.*;
public class Task02 {
    public static void main(final String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Введите формулу: ");
        String equation = str.nextLine();
        equation = String.format(equation).replace(" ", "");
        List<String> st1 = new ArrayList<>(Arrays.asList(equation.split("\\+")));
        Task02 db = new Task02();
        System.out.println("Сумма: " + db.Equation(st1));
    }
    public int Equation(final List<String> st1) {
        Map<String, Integer> book = new HashMap<>();
        Map<String, Integer> book1 = new HashMap<>();
        for (String i : st1) {
            if (!book.containsKey(i)) {
                book.put(i, 1);
            } else {
                book.put(i, book.get(i) + 1);
            }
        }
        for (String key : book.keySet()) {
            Scanner str1 = new Scanner(System.in);
            System.out.println("Введите значение " + key + ":");
            book1.put(key, Integer.valueOf(str1.nextLine()));
        }
        ArrayList<Integer> array1 = new ArrayList<>(book.values());
        ArrayList<Integer> array2 = new ArrayList<>(book1.values());
        int sums = 0;
        for (int i = 0; i < array1.size(); i++) {
            sums += array1.get(i) * array2.get(i);
        }
        return sums;
    }
}