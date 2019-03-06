package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.company.massiv.maxWord;

/**
 * The program performs simple math operations.
 * @author Aleksandr Busygin
 * @see calculator
 * @see #plus(double, double) for
 * @return addition of first and second number
 * @see #minus(double, double) for
 * @return subtraction of first and second number
 * @see #division(double, double) for
 * @return division of first and second number
 * @see #multiplication(double, double) for
 * @return multiplication of first and second number
 */

public class calculator {

    public static double plus(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return (double) a / b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Введите номер задания: 1 - калькулятор, 2 – массив, 0 – выход из программы");
            String s = reader.readLine();
            int a = -2;
            try{
                a = Integer.parseInt(s);
            } catch (Exception e){
                System.out.println("Неверное значение, введите номер задания: 1 - калькулятор, 2 – массив, 0 – выход из программ");
                continue;
            }

            if (!(a==0 || a==1 ||a==2)){
                System.out.println("Неверное значение, введите номер задания: 1 - калькулятор, 2 – массив, 0 – выход из программы ");
                continue;
            }
            if (a == 0) {
                break;
            }
            if (a == 1) {
                System.out.println("Введите первое число:");
                double first = Double.parseDouble(reader.readLine());
                System.out.println("Введите второе число:");
                double second = Double.parseDouble(reader.readLine());
                System.out.println("Введите необходимую операцию (или +, или -, или *, или /):");
                String op = reader.readLine();

                if (op.equals("+")) {
                    System.out.printf("Cумма равна %.4f", plus(first, second) + '\n');
                    System.out.println("");
                } else if (op.equals("-")) {
                    System.out.printf("Разность равна %.4f", minus(first, second));
                    System.out.println("");
                } else if (op.equals("*")) {
                    System.out.printf("Результат умножения равен %.4f", multiplication(first, second));
                    System.out.println("");
                } else if (op.equals("/")) {
                    System.out.printf("Результат деления равен %.4f", division(first, second));
                    System.out.println("");
                } else {
                    System.out.println("Неверное значение для определения операции");
                }
            } else if (a == 2) {
                System.out.println("Введите количество элементов массива:");
                int countOfelements = Integer.parseInt(reader.readLine());
                System.out.println("Заполните массив словами:");
                String[] array = new String[countOfelements];
                for (int i = 0; i < array.length; i++) {
                    array[i] = reader.readLine();
                }
                System.out.println("Самое длинное слово: " + maxWord(array));
            } else {
                System.out.println("Введен неверный номер задания");
            }

        }
    }
}