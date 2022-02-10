package Operators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число x:");
        double x = sc.nextDouble();
        System.out.print("Введите число y:");
        double y = sc.nextDouble();
        System.out.print("Введите число z:");
        double z = sc.nextDouble();
        sc.close();
        double M = (x+y+z)/3;
        System.out.println("Среднее арифметическое чисел:" + M);
        double A = M/2;
        double C = Math.floor(A);
        if (C > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
