package com.javalesson.chapter1.task3;


import java.util.Scanner;

/**
 * Напишите программу которая  проверяет введенное с клавиатуры число и говорит
 * является ли данное число палиндромом.
 * Палиндром - это число которое читается одинаково и спереди назад и сзади наперед.
 * Примеры 12321, 45654, 787 и т.д.
 * <p>
 * Дополнительное условие: программа принимает только числа длинной 5 знаков.
 * В случае если было введено число длинной != 5, программа должна выполнить еще
 * одно прохождение цикла и попросить снова ввести значение с клавиатуры.
 * У данной задачи есть разные варианты решения.
 * 1) С помощью конвертации чисел в строки и обратно.
 * 2) Решение с помощью щю использования остатка от деления на 10.
 * <p>
 * Вам нужно выполнить задания двумя способами.
 */
public class PalindromeFinderTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5-length number");
        int a = in.nextInt();
        String number = Integer.toString(a);
        while (number.length() != 5) {
            System.out.println("Incorrect. Please enter 5-length number");
            a = in.nextInt();
            number = Integer.toString(a);
        }
        System.out.println("Enter method: 1- toString, 2- Divide by 10");
        int method = in.nextInt();
        int key = 0;
        if (method == 1) {
            for (int i = 0; i < 2; i++) {
                if (number.charAt(i) != number.charAt(4 - i)) {
                    key = 0;
                    break;
                } else {
                    key = 1;
                }
            }
        } else {
            int tmp = a;
            int reversed = 0;
            int rest = 0;
            while (tmp > 0){
                rest = tmp%10;
                reversed = reversed*10+rest;
                tmp = tmp/10;
            }
            if (a == reversed) {key =1;}
            else {key = 0;}
        }


        if (key == 1) {
            System.out.println("Your number is a palindrome!");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
