package fileManagement.checkFields;
/**
 * класс отвечающий за тип дракона
 */

import сlasses.Color;
import сlasses.Dragon;
import сlasses.DragonType;

import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Scanner;

public class CheckType {
    public static boolean check = false;

    /**
     * Метод отвечающий за проверку типа
     * @param dragon
     * @return
     */
    public static boolean checkType(Dragon dragon) {
        System.out.println("Введите тип: " +
                "\n    {WATER,\n" +
                "    AIR,\n" +
                "    FIRE}");

        //Dragon dragon = new Dragon();
        Scanner a = new Scanner(System.in);
        switch (a.nextLine().toLowerCase(Locale.ROOT).trim()) {
            case ("water"):
                dragon.setType(DragonType.WATER);
                check = true;
                return true;
            case ("air"):
                dragon.setType(DragonType.AIR);
                check = true;
                return true;
            case ("fire"):
                dragon.setType(DragonType.FIRE);

                check = true;
                return true;
            default:
                System.out.println("введено неверное значение");
                return false;

        }
    }

    /**
     * Метод отвечающий за проверку типа введеного из файла
     * @param type
     * @param executeDragon
     * @return
     */
    public static boolean checkTypeExecute(String type,Dragon executeDragon) {
        switch (type) {
            case ("water"):
                executeDragon.setType(DragonType.WATER);
                check = true;
                return true;
            case ("air"):
                executeDragon.setType(DragonType.AIR);
                check = true;
                return true;
            case ("fire"):
                executeDragon.setType(DragonType.FIRE);
                check = true;
                return true;
            default:
                System.out.println("введено неверное значение");
                return false;

        }
    }
}
