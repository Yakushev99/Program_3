package ru.ibs.arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};

        int firstElement, sum;

        //Меняем местами первый и последний элементы в массиве
        firstElement = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = firstElement;

        //вывод элементов массива после того, как поменяли первый и последний элемент местами
        for (int i = 0; i< array.length; i++) {
            System.out.println("array["+i+"]="+array[i]);
        }

        //Считаем сумму первого и среднего элемента
        sum = array[0] + array[(array.length-1)/2];

        System.out.println("Summa = " + sum);
    }
}
