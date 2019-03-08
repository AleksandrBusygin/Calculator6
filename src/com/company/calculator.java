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
            int a = 0;
            try{
                a = Integer.parseInt(s);
            } catch (Exception e){
                System.err.println("Неверное значение, введите номер задания: 1 - калькулятор, 2 – массив, 0 – выход из программ");
                continue;
            }
            if (!(a==0 || a==1 ||a==2)){
                System.err.println("Неверное значение, введите номер задания: 1 - калькулятор, 2 – массив, 0 – выход из программы ");
            }
            else if (a == 0) {
                break;
            }
            else if (a == 1) {
                double first = 0;
                double second = 0;
                boolean isNumber = true;
                while (isNumber) {
                    System.out.println("Введите первое число:");
                    try {
                        first = Double.parseDouble(reader.readLine());
                        isNumber = false;
                    } catch (Exception e) {
                        System.err.println("Необходимо вводить числа");
                    }
                }
                isNumber = true;
                while (isNumber) {
                    System.out.println("Введите второе число:");
                    try {
                        second = Double.parseDouble(reader.readLine());
                        isNumber = false;
                    } catch (Exception e) {
                        System.err.println("Необходмо вводить числа");
                    }
                }
                System.out.println("Введите необходимую операцию (или +, или -, или *, или /):");
                boolean makeOp = true;
                while (makeOp) {
                    String op = reader.readLine();
                    switch (op) {
                        case "+":
                            System.out.printf("Cумма равна %.4f", plus(first, second));
                            System.out.println();
                            makeOp = false;
                            break;
                        case "-":
                            System.out.printf("Разность равна %.4f", minus(first, second));
                            System.out.println();
                            makeOp = false;
                            break;
                        case "*":
                            System.out.printf("Результат умножения равен %.4f", multiplication(first, second));
                            System.out.println();
                            makeOp = false;
                            break;
                        case "/":
                            System.out.printf("Результат деления равен %.4f", division(first, second));
                            System.out.println();
                            makeOp = false;
                            break;
                        default:
                            System.err.println("Неверное значение для определения операции. Введите или +, или -, или *, или /");
                            break;
                    }
                }
            }
            else if (a == 2) {
                int countOfelements = 0;
                boolean isNumber = true;
                while (isNumber) {
                    System.out.println("Введите количество элементов массива:");
                    try {
                        countOfelements = Integer.parseInt(reader.readLine());
                        isNumber = false;
                    } catch (Exception e) {
                        System.err.println("Неверное значение, введите количество элементов (только числа!)");
                    }
                }
                System.out.println("Заполните массив словами:");
                String[] array = new String[countOfelements];
                for (int i = 0; i < array.length; i++) {
                    array[i] = reader.readLine();
                }
                System.out.println("Самое длинное слово: " + maxWord(array));
            }
        }
    }
}