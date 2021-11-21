package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10;
        int b = 13;
        System.out.println("input number:");
        int input = scanner.nextInt();
        isPrime(input);
        isEven(input);
        getTotal(a, b);
        rand();
        minNum(a,b,input);
        avrgNum(a,b,input);
    }

    static void rand() {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(1,10));
        }
    }

    //1
    static void getTotal(int a, int b) {
        int sum = a + b;
        System.out.println("the total is:" + sum);
    }

    //2
    static void isEven(int a)
    {
        boolean res = false;
        int check = a % 2;
        if (check == 0) {
            res = true;
            System.out.println("this number is even");
        } else {
            System.out.println("this number not evnen");
        }
    }

    //3
    static void isPrime(int a)
    {
        int cunt = 0;

            for (int i = 1; i <= a; i++)
            {
                if (a % i == 0)
                {
                    cunt++;
                }
            }
            if (cunt == 2) {
                System.out.println("this number is prime");
            }
            else {
                System.out.println("this number not prime");
                }

    }

    //4
    static void minNum(int a,int b,int c)
    {
        System.out.println("the min number is: "+Math.min(Math.min(a,b),c));
    }

    //5
    static void avrgNum(int a,int b,int c)
    {
      double avrg = (double) (a + b + c);
      avrg = avrg/3;
        System.out.println("the averge if this 3 numbers is : "+avrg);
    }
}