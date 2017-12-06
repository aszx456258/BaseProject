package com.github.aszx456258;

import java.util.Scanner;

public class newclass{
    public static void main(String[] args) {
        System.out.println(prime(5));
    }
    public static int prime(int num)//1為質數 0則否
    {
        if(num == 1)
        {
            return 1;
        }
        for(int i = 2 ; i < num ; i++)
        {
            if(num%i == 0)
            {
                return 0;
            }
        }
        return 1;
    }

}
