package com.homework.for_while_do_while4;

/**
 * Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
 * Слово "enough" выводить не нужно.
 * Для этого необходимо использовать бесконечный цикл (while(true)).
 *
 * Подсказка: чтобы завершить бесконечный цикл, используй оператор break.
 * Требования:
 * •	Программа должна считывать данные c клавиатуры.
 * •	В программе необходимо использовать цикл while.
 * •	Для завершения бесконечного цикла необходимо использовать оператор break.
 * •	Программа должна выводить в консоли все введенные данные с новой строки, пока на будет введено слово "enough".
 */

public class Cycle4 {

  public static void main(String[] args) {
    int height = 1;
    while (height <= 10) {
      int width = 1;
      while (width <= 20) {
        if (height == 1 || height == 10) {
          System.out.print('Б');
        } else if (width == 1 || width == 20) {
          System.out.print('Б');
        } else {
          System.out.print(' ');
        }
        width++;
      }
      System.out.println();
      height++;
    }
  }
}
