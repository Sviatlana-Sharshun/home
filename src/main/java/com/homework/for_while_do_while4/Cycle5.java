package com.homework.for_while_do_while4;

import java.util.Scanner;

/**
 * Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.
 *
 * Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.
 * Требования:
 * •	Программа должна вывести в консоль сумму всех чисел от 1 до 100 включительно, не кратных 3.
 * •	В программе необходимо использовать цикл while.
 * •	В программе необходимо использовать оператор continue.
 */

public class Cycle5 {

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    while (true) {
      String s = console.nextLine();
      if (s.equals("enough")) {
        break;
      }
      System.out.println(s);
    }
  }
}
