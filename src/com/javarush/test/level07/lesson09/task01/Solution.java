package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        List<Integer> mainInt = new ArrayList<Integer>();
        List<Integer> mainInt3 = new ArrayList<Integer>();
        List<Integer> mainInt2 = new ArrayList<Integer>();
        List<Integer> mainIntOther = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++)
        {
            Integer tmpInt = in.nextInt();
            mainInt.add(tmpInt);
            if (tmpInt % 3 == 0)
                mainInt3.add(tmpInt);
            if (tmpInt % 2 == 0)
                mainInt2.add(tmpInt);
            if (tmpInt % 2 != 0 && tmpInt % 3 != 0)
                mainIntOther.add(tmpInt);
        }

        printList(mainInt3);
        printList(mainInt2);
        printList(mainIntOther);
    }

    public static void printList(List<Integer> list)
    {
        //напишите тут ваш код
        for (Integer tmp : list)
        {
            System.out.println(tmp);
        }
    }
}
