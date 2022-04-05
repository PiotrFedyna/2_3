package com.company;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int w,i;
        for (w=0;w<5;w++)
        {
            for (i=0;i<5*2;i++)
            {
                if (i < (5 - w) || i > (w + 5))
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println(" ");


        }
    }
}

