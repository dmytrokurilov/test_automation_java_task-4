package com.epam.test.automation.java.practice4;

public class Task1 {

    private Task1()
    {

    }

    public static boolean isSorted(int[] array, SortOrder order) {
        if (array == null)
        {
            throw new java.lang.IllegalArgumentException();
        }

        for (int i = 1; i < array.length; i++)
            if (order == SortOrder.ASC)
            {
                if (array[i] < array[i - 1]) return false;
            }
            else if (array[i] > array[i - 1]) return false;
        return true;
    }
}

