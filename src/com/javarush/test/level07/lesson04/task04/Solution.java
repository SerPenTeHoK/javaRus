package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);

        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = in.nextInt();
        }

        for (int i = nums.length-1; i >= 0; i--)
        {
            System.out.println(nums[i]);
        }
    }
}
