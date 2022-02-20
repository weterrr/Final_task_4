package Story;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        String b;
        String c;
        String pp;
        System.out.printf("Отгадай загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает: ");
        a = in.nextLine();
        boolean result1;
        boolean result2;
        boolean result3;
        boolean result4;
        boolean result5;
        boolean result6;
        result1 = a.equalsIgnoreCase("Заархивированный вирус");
        result2 = a.equalsIgnoreCase("Подсказка");
        if (result1 == true) {
            System.out.printf("Правильно!");
        }
        if (result2 == true) {
            System.out.printf("Это что-то, что заархивировали...");
            System.out.printf("Ваш ответ: ");
            pp = in.nextLine();
            if (pp.equalsIgnoreCase("Заархивированный вирус") == true) {
                System.out.printf("Правильно!");
            } else {
                System.out.printf("Обидно, приходи в другой раз");
            }

        }
        if (result1 == false && result2 == false) {
            System.out.printf("Подумай еще! ");
            System.out.printf("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает: ");
            b = in.nextLine();
            result3 = b.equalsIgnoreCase("Заархивированный вирус");
            result4 = b.equalsIgnoreCase("Подсказка");
            if (result3 == true) {
                System.out.printf("Правильно!");
            }
            if (result4 == true) {
                do {
                    System.out.printf("Подсказка уже недоступна, ");
                    System.out.printf("Ответ: ");
                    b = in.nextLine();
                } while (b.equalsIgnoreCase("Подсказка") == true);
            }
            result3 = b.equalsIgnoreCase("Заархивированный вирус");
            if (result3 == true) {
                System.out.printf("Правильно!");
            }
                if (result3 == false) {
                    System.out.printf("Подумай ещё! ");
                    System.out.printf("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает: ");
                    c = in.nextLine();
                    result5 = c.equalsIgnoreCase("Заархивированный вирус");
                    result6 = c.equalsIgnoreCase("Подсказка");
                    if (result5 == true) {
                        System.out.printf("Правильно!");
                    }
                    if (result6 == true) {
                        do {
                            System.out.printf("Подсказка уже недоступна, ");
                            System.out.printf("Ответ: ");
                            c = in.nextLine();
                        } while (c.equalsIgnoreCase("Подсказка") == true);
                    }
                    result5 = c.equalsIgnoreCase("Заархивированный вирус");
                    if (result5 == true) {
                        System.out.printf("Правильно!");
                    }
                    if (result5 == false){
                        System.out.printf("Обидно, приходи в другой раз");
                    }
                }
            }
        }
    }
