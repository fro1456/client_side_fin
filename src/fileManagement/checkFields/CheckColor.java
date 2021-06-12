package fileManagement.checkFields;
/**
 * класс отвечающий за проверку цвета дракона
 */

import сlasses.Color;
import сlasses.Dragon;

import java.util.Locale;
import java.util.Scanner;

public class CheckColor {
    public static boolean check = false;

    /**
     * Проверка цвета введеного с клавиатуры
     * @param dragon
     * @return
     */
    public static boolean checkColor(Dragon dragon) {
        System.out.println("Введите цвет: " +
                "\n    {RED,\n" +
                "    BLACK,\n" +
                "    YELLOW,\n" +
                "    ORANGE,\n" +
                "    WHITE}");

        String color;
        //Dragon dragon = new Dragon();
        Scanner a = new Scanner(System.in);
        switch (a.nextLine().toLowerCase(Locale.ROOT).trim()) {
            case ("red"):
                dragon.setColor(Color.RED);
                check=true;
                return true;
            case ("black"):
                dragon.setColor(Color.BLACK);
                check=true;
                return true;
            case ("yellow"):
                dragon.setColor(Color.YELLOW);
                check=true;
                return true;
            case ("orange"):
                dragon.setColor(Color.ORANGE);
                check = true;
                return true;
            case ("white"):
                dragon.setColor(Color.WHITE);
                check= true;
                return true;
            default:
                System.out.println("введено неверное значение");
                return false;

        }
    }

    /**
     * Проверка цвета введеного из файла
     * @param color
     * @param executeDragon
     * @return
     */
    public static boolean checkColorExecute(String color,Dragon executeDragon) {
//        System.out.println("Введите цвет: " +
//                "\n    {RED,\n" +
//                "    BLACK,\n" +
//                "    YELLOW,\n" +
//                "    ORANGE,\n" +
//                "    WHITE}");
//        Dragon dragon = new Dragon();
        switch (color) {
            case ("red"):
                executeDragon.setColor(Color.RED);
                check = true;
                return true;
            case ("black"):
                executeDragon.setColor(Color.BLACK);
                check = true;
                return true;
            case ("yellow"):
                executeDragon.setColor(Color.YELLOW);
                check = true;
                return true;
            case ("orange"):
                executeDragon.setColor(Color.ORANGE);
                check = true;
                return true;
            case ("white"):
                executeDragon.setColor(Color.WHITE);
                check = true;
                return true;
            default:
                System.out.println("введено неверное значение");
                return false;

        }
    }
}

