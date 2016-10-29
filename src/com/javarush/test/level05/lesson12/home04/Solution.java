package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Date nowDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd MM YYYY");
        String strToPrint = dateFormat.format(nowDate);

        System.out.printf(strToPrint);

    }
}
