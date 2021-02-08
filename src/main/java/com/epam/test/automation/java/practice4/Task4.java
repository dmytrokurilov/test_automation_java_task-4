package com.epam.test.automation.java.practice4;

public class Task4 {

    private Task4()
    {

    }
    public static double sumGeometricElements(int a1, double t, int alim) {

        if (alim <= 0)
        {
            throw new java.lang.IllegalArgumentException();
        }

        double sum = 0;
        while (a1 > alim)
        {
            sum += a1;
            a1 *= t;
        }
        return sum;
    }
}
