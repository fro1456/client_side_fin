package fileManagement.checkFields;

import сlasses.Dragon;

import java.util.Scanner;

/**
 * Класс отвечающий за проверку возраста
 */


public class CheckAge {
    public static boolean check = false;

    /**
     * Проверка age ввеленого с клавиатуры
     * @param dragon
     */
    public static void checkAge(Dragon dragon) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите возраст: ");
        try {
            int age = Integer.parseInt(scanner.nextLine());
            if (age > 0) {
                System.out.println("age = " + age);
                dragon.setAge(age);
                check = true;
            } else {
                System.err.println("Вводимый элемент меньше нуля");
            }

        }
        catch (NumberFormatException e){
            System.err.println("Введенные данные не верны");
        }
    }

    /**
     * Проверка age введенного из файла
     * @param age
     * @param executeDragon
     * @return
     */
    public static boolean checkAgeExecute(String age,Dragon executeDragon) {
        int a;
        try {
            a = Integer.parseInt(age);
            if (a > 0) {
                //System.out.println("age = " + age);

                executeDragon.setAge(a);
                return true;
            } else {
                System.err.println("Вводимый элемент меньше нуля");
                return false;
            }

        }
        catch (NumberFormatException e){
            System.err.println("Введенные данные не верны");
        }
        return false;
    }
}
