package ht02VarsAndTypes;

public class Task8 {
    public static void main(String[] args) {
        int i = 3;
        i++;
        System.out.println(i); // "4"
        ++i;
        System.out.println(i); // "5"
        System.out.println(++i); // "6"
        System.out.println(i++); // "6" пост инкремент изменяет переменную после вывода на экран
        System.out.println(i); // "7"
    }
}
