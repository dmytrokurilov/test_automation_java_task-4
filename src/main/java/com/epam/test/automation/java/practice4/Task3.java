package com.epam.test.automation.java.practice4;

public class Task3 {

    private Task3()
    {

    }

    public static int multiArithmeticElements(int a1, int t, int n) {

        if (a1 < 0)
        {
            throw new IllegalArgumentException();
        }

        if (t <= 0)
            return 0;

        int total = 1;
        for (int i = 1; i <= n; i++)
        {
            total *= a1;
            a1 += t;
        }
        return total;
    }
}
