package com.company;

public class massiv {
    public static String maxWord(String[] array)
    {
        int max = array[0].length();
        String maximum = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].length() >= max) {
                max = array[i].length();
                maximum = array[i];
            }
        }
        return maximum;
    }

}
