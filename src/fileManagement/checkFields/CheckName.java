package fileManagement.checkFields;

import сlasses.Dragon;

import java.util.Scanner;

/**
 * класс отвечающий за проверку имени
 */
public class CheckName {
    public static boolean check = false;
    private Dragon dragon;

    /**
     * метод проверки имени
     * @param dragon
     */
    public static void checkName(Dragon dragon) {
        try {
            System.out.println("Введите имя:");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            name = name.replaceAll("\\s", "");
            if (name.isEmpty()) {
                System.err.println("Ошибка! Поле имени не должно быть null!");
            } else {
                dragon.setName(name);
                System.out.println("name = " + name);
                check = true;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    /**
     * Проверка имени введеного с клавиатуры
     * @param name
     * @param executeDragon
     * @return
     */
    public static boolean checkNameExecute(String name,Dragon executeDragon) {
        try {
            Scanner scanner = new Scanner(name);
            if (name.isEmpty()) {
                System.err.println("Ошибка! Поле имени не должно быть null!");
                return false;
            } else {
                executeDragon.setName(name);
                //System.out.println("name = " + name);
                return true;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return false;


    }
}
