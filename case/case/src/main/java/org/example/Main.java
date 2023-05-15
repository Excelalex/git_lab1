package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        CASE3
        Дан номер месяца — целое число в диапазоне 1–12
        (1 — январь, 2 — февраль и т. д.).
        Вывести название соответствующего времени года («зима»,
        «весна», «лето», «осень»).
         */
        System.out.println("CASE3");
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int x=in.nextInt();
        switch(x) {
            case 1:case 2:case 12:System.out.println("Ответ зима ");break;
            case 3:case 4:case 5:System.out.println("Ответ весна ");break;
            case 6:case 7:case 8:System.out.println("Ответ лето ");break;
            case 9:case 10:case 11:System.out.println("Ответ осень ");break;
            default:System.out.println("Ответ нет такого месяца ");break;
        }

        /*
        CASE10
        Робот может перемещаться в четырех направлениях («С» — север,
        «З» — запад, «Ю» — юг, «В» — восток) и принимать три цифровые команды:
        0 — продолжать движение, 1 — поворот налево, −1 — поворот направо.
        Дан символ C — исходное направление робота и целое число N— посланная ему команда.
        Вывести направление робота после выполнения полученной команды.
         */
        System.out.println("CASE3");
        Scanner in1 = new Scanner(System.in);
        System.out.printf("Укажите начальное положение робота(север,запад,юг,восток):");
        String c=in1.nextLine();
        System.out.printf("Введите номер команды: ");
        int n=in1.nextInt();
        switch(n) {
            case 0:
                System.out.println(c);break;
            case 1:
                switch(c) {
                    case "север":System.out.println("запад");break;
                    case "запад":System.out.println("юг");break;
                    case "юг":System.out.println("восток");break;
                    case "восток":System.out.println("север");break;
                    default:System.out.println("");break;
                }
                break;
            case -1:
                switch(c) {
                    case "север":System.out.println("восток");break;
                    case "запад":System.out.println("север");break;
                    case "юг":System.out.println("запад");break;
                    case "восток":System.out.println("юг");break;
                    default:System.out.println("");break;
                }
                break;
            default:System.out.println("");break;
        }

        /*
        CASE13
        Элементы равнобедренного прямоугольного треугольника
        пронумерованы следующим образом: 1- катет a, 2 - гипотенуза c = a*sqr2,
        3 - высота h, опущенная на гипотенузу (h=c/2), 4 - площадь S = c*h/2.
        Дан номер одного из этих элементов и его значение.
        Вывести значение остальных элементов данного треугольника(в том же порядке)
         */
        System.out.println("CASE13");
        Scanner in3 = new Scanner(System.in);
        System.out.printf("Введите номер элемента: ");
        int m=in.nextInt();
        System.out.printf("Введите значение: ");
        float n1=in.nextFloat();
        double a;
        double c1;
        double h;
        double s;
        switch(m) {
            case 1:
                a=n1;
                c1=a*Math.sqrt(2);
                h=c1/2;
                s=(c1*h)/2;
                break;
            case 2:
                c1=n1;
                a=c1/Math.sqrt(2);
                h=c1/2;
                s=(c1*h)/2;
                break;
            case 3:
                h=n;
                c1=h*2;
                a=c1/Math.sqrt(2);
                s=(c1*h)/2;
                break;
            case 4:
                s=n1;
                h=Math.sqrt(s);
                c1=h*2;
                a=c1/Math.sqrt(2);
                break;
            default:
                a=0;
                c1=0;
                h=0;
                s=0;
                System.out.println("Неверное число");
        }
        System.out.println("a= "+a);
        System.out.println("c1= "+c1);
        System.out.println("h= "+h);
        System.out.println("s= "+s);
    }
}

