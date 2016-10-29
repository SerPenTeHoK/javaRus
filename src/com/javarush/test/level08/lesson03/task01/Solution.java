package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        HashSet<String> stringHashSet = new HashSet<String>();
        String[] veg = new String[]{"арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"};
        List<String> stringList = Arrays.asList(veg);
        stringHashSet.addAll(stringList);
        for (String elem : stringHashSet)
        {
            System.out.println(elem);
        }

    }
}
