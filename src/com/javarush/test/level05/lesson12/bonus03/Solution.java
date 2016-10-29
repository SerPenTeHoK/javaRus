package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(reader.readLine());
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++)
        {
            Integer zn = Integer.valueOf(reader.readLine());
            if(maximum < zn)
                maximum = zn;
        }
        //напишите тут ваш код

        System.out.println(maximum);
    }
}
