package org.example;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        // IF 2
        // Дано целое число. Если оно является положительным, то
        // прибавить к нему 1; в противном случае вычесть из него
        // 2. Вывести полученное число.
        System.out.println("IF 2");
        int x;
        int y;
        x = -5;
        y = 0;
        if(x>y){
            x += 1;
        }else{
            x -= 2;
        }
        System.out.println("Ответ: " + x);

        /*
        IF 6
        Даны два числа. Вывести большее из них.
         */
        System.out.println("IF 6");
        int x1;
        int y1;
        x1 = 9;
        y1 = 17;
        if(x1>y1){
            System.out.println("Ответ " + x1);
        }else{
            System.out.println("Ответ " + y1);
        }
        /*
        IF 13
        Даны три числа. Найти среднее из них ( то есть число,
        расположенное между наименьшим и наибольшим.
         */
        System.out.println("IF 13");
        int pe = 112, vt = 222, tr = 531;
        if((pe - vt) * (tr - pe) >= 0){
            System.out.print(pe);
        }else if ((vt - pe) * (tr - vt) >= 0) {
            System.out.print(vt + "\n");
        }else{
            System.out.print(tr);
        }
        /*
        IF 20
        На числовой оси расположены три точки: A, B, C. Определить
        какая из двух последних точек(B и C) расположены ближе к A,
        вывести эту точку и её расстояние от точки A.
         */
        System.out.println("IF 20");
        int a = 50, b = 40, c = 25;
        if(a - b < a - c){
            System.out.print("Ответ B ближе ");
        }else{
            System.out.print("Ответ C ближе ");
        }
        System.out.print("Расстояние от точки А и точки В 10 ");

        /*
         IF 26
         Для данного вещественного числа x найти значение следующей
         функции f, принимающей вещественный значения:
                Г -x, если x <=0,
        F(x) = {  x^2, если 0<x<2,
                L 4, если x=>2.
         */
        System.out.println("IF 26");
        Scanner in = new Scanner(System.in);

        System.out.printf("введите x:");
        float x2=in.nextFloat();

        if(x2<=0) {
            x2=-x2;
        }else if(x2>=2) {
            x2=4;
        }else {
            x2=x2*x2;
        }
        System.out.println("f(x)="+x);
    }
}



