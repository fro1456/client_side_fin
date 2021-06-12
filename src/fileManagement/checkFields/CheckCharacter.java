package fileManagement.checkFields;
/**
 * Класс отвечающий за проверку Character
 */

import сlasses.Color;
import сlasses.Dragon;
import сlasses.DragonCharacter;

import java.util.Locale;
import java.util.Scanner;

public class CheckCharacter {
        public static boolean check = false;

    /**
     * Проверка character введеного с клавиатуры
     * @param dragon
     * @return
     */
    public static boolean checkCharacter(Dragon dragon) {
            System.out.println("Введите характер: " + "\n CUNNING,"+
                    "\n WISE," +
                    "\n CHAOTIC,"+
                    "\n CHAOTIC_EVIL,"+
                    "\n FICKLE;");

            String character;
            //Dragon dragon = new Dragon();
            Scanner a = new Scanner(System.in);
            switch (a.nextLine().toLowerCase(Locale.ROOT).trim()) {
                case ("wise"):
                    dragon.setCharacter(DragonCharacter.WISE);
                    check=true;
                    return true;
                case ("chaotic"):
                    dragon.setCharacter(DragonCharacter.CHAOTIC);
                    check=true;
                    return true;
                case ("chaotic_evil"):
                    dragon.setCharacter(DragonCharacter.CHAOTIC_EVIL);
                    check=true;
                    return true;
                case ("fickle"):
                    dragon.setCharacter(DragonCharacter.FICKLE);
                    check=true;
                    return true;
                case ("cunning"):
                    dragon.setCharacter(DragonCharacter.CUNNING);
                    check=true;
                    return true;
                default:
                    System.out.println("введено неверное значение");
                    return false;
            }
        }

    /**
     * Проверка Character введеного из файла
     * @param character
     * @param executeDragon
     * @return
     */
    public static boolean checkCharacterExecute(String character,Dragon executeDragon) {
//        System.out.println("Введите характер: " + "\n CUNNING,"+
//                "\n WISE," +
//                "\n CHAOTIC,"+
//                "\n CHAOTIC_EVIL,"+
//                "\n FICKLE;");
//
        //Dragon dragon = new Dragon();
        //Scanner a = new Scanner(System.in);
        switch (character) {
            case ("wise"):
                executeDragon.setCharacter(DragonCharacter.WISE);
                check=true;
                return true;
            case ("chaotic"):
                executeDragon.setCharacter(DragonCharacter.CHAOTIC);
                check=true;
                return true;
            case ("chaotic_evil"):
                executeDragon.setCharacter(DragonCharacter.CHAOTIC_EVIL);
                check=true;
                return true;
            case ("fickle"):
                executeDragon.setCharacter(DragonCharacter.FICKLE);
                check=true;
                return true;
            case ("cunning"):
                executeDragon.setCharacter(DragonCharacter.CUNNING);
                check=true;
                return true;
            default:
                System.out.println("введено неверное значение");
                return false;
        }
    }
    }
