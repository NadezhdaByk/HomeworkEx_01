package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный
// одномерный массив. Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
//
//Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

public class Main2 {

    public static void main(String[] args) {
        Main2 main = new Main2();
        Integer[] arr = new Integer[]{5, null, 0, null};
//        main.checkArray(arr);
        System.out.println("Не заданы элементы массива c индексами: " + main.checkArray(arr));
    }

    public List<Integer> checkArray(Integer[] arr) {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("Элемент массива " + i + " не задан");
                result.add(i);
            }
        }
        return result;
    }
}


