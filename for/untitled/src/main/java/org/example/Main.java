package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        FOR 1
        Даны целые числа K и N(N>0). Вывести
        N раз число K
         */
        System.out.println("FOR1 ");
        int K = 5;
        int N = 10;
            var x="";
            for(var i=1;i<=N;i++){

                x=x+K+" ";
            }
        System.out.println("FOR1 Ответ: "+x );

       /*
       FOR 7
       Даны два целых числа А и В(А<В).
       Найти сумму всех целых чисел от А до В включительно.
        */
        System.out.println("FOR7 ");
        int A =5;
        int B = 10;
        int sum = 0;
        for(int m = A; m <= B; m++)
            sum += m;
        System.out.println("FOR7 Ответ: "+sum);

        /*
        FOR 10
        Дано целое число N(>0). Найти сумму
        1+1/2+1/3+...+1/N
        (вещественное число)
         */
        System.out.println("FOR10");
        int n=5;
        float a=1;
        float c=0;
        float b=0;
        for (int i=0; i<n+1; i++) {
            b=1/a;
            a=a+1;
            c+=b;
        }
        System.out.println("FOR10 Ответ: "+c);

        /*
        FOR31
        Дано целое число N (> 0).
        Последовательность вещественных чисел A_K определяется
        следующим образом: A0 = 2, AK = 2 + 1/AK-1,
        K = 1, 2, … . Вывести элементы A1, A2, …, AN
         */
        System.out.println("FOR31 ");
        int n1 = 14;
        float A1 = 2;
        for (int i = 0; i <= n1; i++) {
            A1=2+1/A1;
            System.out.print(i + " "+A1);
            }

        /*
        FOR40
        Даны целые числа A и B (A < B).
        Вывести все целые числа от A до B включительно;
        при этом число A должно выводиться 1 раз,
        число A + 1
        должно выводиться 2 раза и т. д.
         */
        System.out.println("\nFOR40 ");
        int A2 = 5;
        int B2 = 10;
        for (int i = A2, count = 1; i <= B2; i++, count++) {
            System.out.print("a=");
            for (int j = 0; j < count; j++) System.out.print(i);
            System.out.println();
        }
    }
}
