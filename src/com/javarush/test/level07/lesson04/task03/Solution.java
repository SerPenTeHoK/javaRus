package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        String[] strs = new String[10];
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++)
        {
            strs[i] = in.nextLine();
            nums[i] = strs[i].length();
        }

        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }
}
