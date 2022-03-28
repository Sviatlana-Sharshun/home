package com.homework.arraylist9;

import java.util.ArrayList;
import java.util.Collections;

/**
 * В классе List9 объявлены методы: copy(ArrayList<String>, ArrayList<String>), addAll(ArrayList<String>, String...), replaceAll(ArrayList<String>, String, String). Тебе нужно переписать их реализацию, используя при этом только соответствующие методы класса Collections.
 * Параметр String... означает то же, что и String[], только аргументы String можно передавать через запятую.
 * Требования:
 * •	В классе List9 должен быть публичный статический метод copy(ArrayList<String>, ArrayList<String>) с типом возвращаемого значения void.
 * •	В классе List9 должен быть публичный статический метод addAll(ArrayList<String>, String...) с типом возвращаемого значения void.
 * •	В классе List9 должен быть публичный статический метод replaceAll(ArrayList<String>, String, String) с типом возвращаемого значения void.
 * •	Метод copy(ArrayList<String>, ArrayList<String>) нужно переписать, используя метод copy класса Collections.
 * •	Метод addAll(ArrayList<String>, String...) нужно переписать, используя метод addAll класса Collections.
 * •	Метод replaceAll(ArrayList<String>, String, String) нужно переписать, используя метод replaceAll класса Collections.
 */

public class List9 {

  public static void copy(ArrayList<String> destination, ArrayList<String> source) {
    Collections.copy(destination, source);
  }

  public static void addAll(ArrayList<String> list, String... strings) {
    Collections.addAll(list, strings);
  }

  public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
    Collections.replaceAll(list, oldValue, newValue);
  }
}
