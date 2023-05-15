package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        WHILE2
        Даны положительные числа A и B (A > B).
        На отрезке длины A размещено максимально возможное количество отрезков длины B
        (без наложений). Не используя операции умножения и деления,
        найти количество отрезков B, размещенных на отрезке A.
         */
        System.out.println("WHILE2");
        Scanner outData = new Scanner(System.in);
        int a = 0, b = 0;
        while (a <= b) {
            System.out.print("Введите длинну отрезка А: ");
            a = outData.nextInt();
            System.out.print("Введите длинну отрезка B: ");
            b = outData.nextInt();
            if (a <= b) System.err.print("ОШИБКА: отрезок <А> должен быть больше <В>!!!");
        }
        int countOtr = a/b;
        System.out.print("В отрезке <А> возможно разместить отрезок <В> " + countOtr + " раз(а);");

        /*
        WHILE9
        Дано целое число N (> 1).
        Найти наименьшее целое число K, при
        котором выполняется неравенство 3K > N.
         */
        System.out.print("\nWHILE9 ");
        Scanner input = new Scanner (System.in);
        System.out.print("Введите число больше нуля: ");
        int num1 = input.nextInt();
        int k = 1;
        while (3*k < num1) { k++;
        }
        k = k - 1;
        System.out.println();
        System.out.println("Найденное число K равно " + k);

        /*
        WHILE15
    Начальный вклад в банке равен 1000 руб.
    Через каждый месяц размер вклада увеличивается на P процентов
    от имеющейся суммы (P —вещественное число, 0 < P < 25).
    По данному P определить, через сколько
    месяцев размер вклада превысит 1100 руб.,
    и вывести найденное количество месяцев K (целое число)
    и итоговый размер вклада S (вещественноечисло).
         */
        System.out.print("\nWHILE15 ");
        int p=10;
        int n=1000;
        int k1=0;
        while (n<1100)
        {
            n+=(n*p)/100;
            k1+=1;
        }
        System.out.println("Всего\t"+n);
        System.out.println("Кол-во месяцев\t"+k1);

        /*
        WHILE24
        Дано целое число N (> 1). Последовательность чисел Фибоначчи FK
    определяется следующим образом:
    F1 = 1, F2 = 1, FK = FK−2 + FK−1, K = 3, 4, . . . .
    Проверить, является ли число N числом Фибоначчи. Если является, то
    вывести TRUE, если нет — вывести FALSE.
         */
        System.out.println("WHILE24");
        int N=48;
        int f1=1;
        int f2=1;
        int sum=0;
        while(sum<=N)
        {
            sum=f1+f2;
            f1=f2;
            f2=sum;
            System.out.println("Сумма\t"+sum);
        }
        if(sum==N)
        {
            System.out.println("WHILE24 Ответ: "+true);
        }
        else {
            System.out.println("WHILE24 Ответ: "+false);
        }

        /*
        WHILE30
        Даны положительные числа A, B, C.
        На прямоугольнике размера A × B размещено максимально возможное
        количество квадратов со стороной C (без наложений).
        Найти количество квадратов, размещенных
        на прямоугольнике. Операции умножения и деления не использовать.
         */
        System.out.println("WHILE30 ");
        int a1 = 10;
        int b2 = 7;
        int c3 = 3;
        // Кол-во квадратов по вертикали
        int vertCount = 0;
        while (b2 >= c3)
        {
            b2 -= c3;
            vertCount++;
        }
        // Кол-во по горизонтали
        int horzCount = 0;
        while (a1 >= c3)
        {
            a1 -= c3;
            horzCount++;
        }
        int result = 0;
        for (int i = 0; i < vertCount; i++)
        {
            result += horzCount;
        }
        System.out.println("WHILE30 " + result);
    }

}

