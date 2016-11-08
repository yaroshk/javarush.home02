package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (i < a && i > b || i > a && i < b)
        {
            System.out.println(i);//напишите тут ваш код
        } else if (a < i && a > b || a > i && a < b)
        {
            System.out.println(a);
        } else if (b < a && b > i || b > a && b < i)
        {
            System.out.println(b);
        }

    }
}