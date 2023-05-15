package org.example;

public class Main {
    public static void main(String[] args) {

        // BEGIN1
        System.out.println("begin1");
        int a = 15;
        int P;
        P = 4*a;
        System.out.println("Ответ на begin1");
        System.out.println(P);
        //BEGIN7
        // НАЙТИ ДЛИНУ И ПЛОЩАДЬ ОКР
        int  r = 10;
        double s, l, pi= 3.14;
        l = 2*3.14*r;
        System.out.println("Результат длины");
        System.out.println(l);
        s = pi * Math.pow(r,2);
        System.out.println("Результат радиуса");
        System.out.println(r);
        //BEGIN12
        /*
        Даны катеты прямоугольного треугольника a и b.
        Найти его гипотенузу c и периметр P
         */
        int a1 = 12;
        int b = 4;
        int c;
        int P1;
        c = ((a1 ^ 2) + (b ^ 2)) ^ (1 / 2);
        P1 = a1 + b + c;
        System.out.println("гипотенуза");
        System.out.println(c);
        System.out.println("Ответ на begin12");
        System.out.println(P1);
        //BEGIN20
        //Найти расстояние между двумя точками
        int x1=4, x2=3, y1=6, y2 = -2, q;
        q = ((x2 - x1)^2 + (y2 - y1)^2)^1/2;
        System.out.println("Результат begin20");
        System.out.println(q);

        //BEGIN26
        /*
        Найти значение функции при данном значении x
         */
        int x=5;
        int y;
        y = 4 *(x-3)^6 - 7*(x-3)^3 +2;
        System.out.println("Результат begin26");
        System.out.println(y);
    }
}