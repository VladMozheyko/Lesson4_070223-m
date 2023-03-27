import java.util.Random;
import java.util.Scanner;

public class Test {
    /*
    План занятия
    1) Повторение
    2) Переменные и типы данных
     */

    /*
    Теория
      System.out.print() - вывод без перехода на новую строку
      System.out.println(); - вывод с переходом на новую строку
      System.out.printf(); - форматированный вывод

      System.out.printf("Указываются типы значений и количество символов вывода для этих значений", сами значения);

      Если глобальная и локальная переменная имеет одинаковое название, то приоритет будет у локальной переменной

      Если переменная не относится к одному из 8 примитивных видов переменных, значит она ссылочная.

      int a = 15; - Конструкция для объявления переменной

      int a - декларация(объявление) переменной, т.е. даем имя переменной.

      a = 15 - инициализация - присвоение значения переменной

      Чтобы декларировать(объявить) переменную, нужно сначала указать ее тип, затем название самой переменной.
      Названия переменных принято вводить с маленькой буквы.

      Чтобы инициализировать переменную нужно написать имя переменной поставить = и указать само значение, которые мы
      ей присваиваем.

      В Java классы принято называть с большой буквы, поэтому все ссылочные типы при объявлении называются с большой буквы,
      например:

      Scanner sc = new Scanner(System.in);  - в скобках указывваются параметры, которые мы передаем в объект

      В Java существует множество уже готовых классов(типов), которые как поставляются в виде базового функционала языка,
      так и в виде сторонних библиотек.

      В Java есть класс для генерации псевдослучайных чисел - в информатике не существует способа генерации настоящих случайных
      чисел.

      Класс называется Random

      В класс можно поместить не только данные но и операции, а затем вызвать их, чтобы вызвать операцию через ссылочную
      переменную(объект) нужно укаазать переменную поставить точку и выбрать доступную операцию

      String тоже ссылочная переменная, но в Java ее и только ее можно создавать еще и таким же синтаксисом как и примитивную
      переменную, например:
      String  = "Hello";

      Но переменные типа String также имеют набор методов, которые можно вызывать через точку

     */

    /*
    Заметки
    Над классом указываются импортированные библиотеки при помощи слова import
     */

    /*
    Задания*
    Если сложно с классами, сделать методы в основном классе
    1) Создать класс для обработки строк: конкантенация(сложение), поиск подстроки, проверка на паллиндром
    2) Создать класс для работы с массивом: Сортировка по возрастанию, вывод, поиск значения, удаление*, реверс
    *Показать работу через класс и через объект
     */

    static byte a = 10;                                                     // Глобальные переменные
    static Scanner sc = new Scanner(System.in);                             // При создании ссылочных переменных, не всегда
    static Random random = new Random();                                    // нужно передавать значения в конструктор

    public static void main(String[] args) {
        int a = 15;                                                         // Локальные переменные
        int b = 1000;
        float f = 15.454f;
        char c = 'd';

        double k = 4.378;
        a = 15 + 7;

        System.out.println("|-----|-----|");
        System.out.printf("%5d %5d\n",a, b );

        Human vlad = new Human("Vlad", "Teacher");                         // Создали объекты(представители типа), передали им параметры в виде имени и статуса участника урока
        Human katya = new Human("Katya", "Student");
        
        vlad.out();

        katya.out();

        String str = "Hello";

        System.out.println(str.toUpperCase());                             // Пример вызова метода у объекта

    }
}




