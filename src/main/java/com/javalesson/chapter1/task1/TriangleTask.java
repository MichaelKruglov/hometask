package com.javalesson.chapter1.task1;

import java.util.Scanner;

/**
 *  Напишите программу которая принимает 3 числовых значения и проверяет, могут ли они быть
 *  сторонами треугольника.
 *  Для ввода значений с консоли Вам понадобится класс Scanner.
 *  <code>Scanner scanner = new Scanner(System.in);</code>
 *  <code>scanner.nextInt();</code>
 */
public class TriangleTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a <= b + c && b <= a + c && c <= a + b){
            System.out.println("Triangle exists");
        }
        else {
            System.out.println("Triangle DOESN'T exist");
        }
    }
}
