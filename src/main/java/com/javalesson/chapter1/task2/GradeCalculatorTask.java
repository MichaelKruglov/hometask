package com.javalesson.chapter1.task2;

import java.util.Scanner;

/**
 * Напишите программу, которая принимает заранее неизвестное количество оценок
 * считает общую сумму оценок и среднее значение.
 * Оценки должны быть получены с консоли и от запуска к запуску их количество может меняться.
 * Для этого вам понадобится один из циклических операторов с заранее не известным количеством циклов.
 * Вспомните, какие бывают циклические операторы и в чем особенность каждого из них.
 * Так же вам понадобится определенное значение, которое будет обозначать завершение обработки
 * входящих данных и переход к вычислениям. Так как оценки не могут быть отрицательными,
 * можно использовать отрицательное целое значение (например -1 или -5) как указатель выхода из цикла.
 * <p>
 * Для выполнения задания Вам понадобится класс Scanner.
 * Создайте объект класса <code> Scanner scanner = new Scanner(System.in);</code>
 * Используя методы этого класса, Вы можете прочитать с консоли данные разного типа.
 * <code>
 * scanner.nextInt();
 * scanner.nextDouble();
 * scanner.nextLine();
 * scanner.nextFloat();
 * scanner.next();
 * </code>
 * <p>
 * После выполнения задания сверьтесь с тем что написано в  GradeCalculatorSolution.java.
 * <p>
 * Подумайте какие есть недостатки у решения в классе GradeCalculatorSolution.
 * <p>
 * Вам нужно предложить 2 улучшения. По желанию можно реализовать их самостоятельно (не обязательно).
 * Подсказка: одно из них реализовать очень просто.
 * Для второго Вам могут понадобиться знания из раздела Обработка исключений в Java.
 */
public class GradeCalculatorTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your grades. Enter negative value to show result.");
        float sum = 0;
        int counter = 0;
        int grade = in.nextInt();
        while (grade >= 0) {
            sum += grade;
            grade = in.nextInt();
            counter++;
        }

        if (counter == 0) {
            System.out.println("No grades");
        } else {
            System.out.println("Sum of grades: " + sum);
            System.out.println("Mean of grades: " + sum / counter);
        }
    }
}
