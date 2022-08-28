package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int b;
        int bacteria = 0;
        int final_answer = 0;
        int time = 0;
        for (int t = 0; t <= 100; t++)
        {
            b = t * (t - 20) * (t - 100) + 120000;
            if (bacteria - b > final_answer)
            {
                final_answer = bacteria - b;
                time = t;
            }
            bacteria = b;
        }
        System.out.println(time);
    }
}
