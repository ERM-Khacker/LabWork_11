package edu;

public class Mathematical_sequence {
    public static void main(String[] args) {
        System.out.println(factorialOfNumber(5));
        System.out.println();
        arithmeticProgression(3.3, 2.1);
        System.out.println();
        geometricProgression(2.3, 1.2);
    }

    public static int factorialOfNumber(int num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum = sum * i;
        }
        return sum;
    }

    /*Арифметическая прогрессия определяется параметрами x0 и d, где x0 – это первый элемент данной последовательности,
    а d – так называемая разность прогрессии. Элементы последовательности вычисляются по формуле xn=xn-1+d.
    Напишите программу, которая выводит на экран 20 первых элементов арифметической прогрессии
    с параметрами x0=3.3 и d=2.1. Начало данной прогрессии имеет вид 3.3, 5.4, 7.5, 9.6 и т. д.*/
    public static void arithmeticProgression(double x0, double d) {
        int count = 0;
        double xn;
        System.out.println(x0);
        while (count < 20) {
            xn = x0 = x0 + d;
            System.out.println(xn);
            count++;
        }
    }

    /*Геометрическая прогрессия определяется параметрами x0 и q, где x0 – это первый элемент данной последовательности,
    а q – так называемый знаменатель прогрессии. Элементы последовательности вычисляются по формуле xn=xn-1*q.
    Напишите программу, которая выводит на экран 20 первых элементов геометрической прогрессии
    с параметрами x0=2.3 и q=1.2. Начало данной прогрессии имеет вид 2.3, 2.8, 3.3, 4.0, 4.8 и т. д.*/
    public static void geometricProgression(double x0, double q) {
        int count = 0;
        double xn;
        System.out.println(x0);
        while (count < 20) {
            xn = x0 = x0 * q;
            System.out.println(xn);
            count++;
        }
    }
}
