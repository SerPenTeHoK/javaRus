package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        List<String> stringList = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            stringList.add(in.nextLine());
        }
        Integer minLength = Integer.MAX_VALUE;
        for (String str : stringList)
        {
            if (minLength > str.length())
                minLength = str.length();

        }
        List<String> minStrs = new ArrayList<String>();
        for (String str : stringList)
        {
            if (minLength == str.length())
                minStrs.add(str);
        }

        for (String str : minStrs )
        {
            System.out.println(str);
        }

    }
}
