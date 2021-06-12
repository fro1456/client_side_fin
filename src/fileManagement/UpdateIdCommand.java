package fileManagement;
/**
 * Данный класс отвечает за обновление выбранного поля в Dragon
 */

import fileManagement.checkFields.*;
import сlasses.Coordinates;
import сlasses.Dragon;
import сlasses.DragonCharacter;
import сlasses.DragonHead;

import java.util.HashMap;
import java.util.Locale;

import java.util.Map;
import java.util.Scanner;

public class UpdateIdCommand {
    /**
     * метод реализующий UpdateId
     *
     * @param key
     */
    public static Dragon updateId(Long key) {
        Dragon dragon = new Dragon();
        System.out.println("Выберите поле которое хотите изменить:");
        System.out.println("1-age");
        System.out.println("2-name");
        System.out.println("3-coordinates");
        System.out.println("4-age");
        System.out.println("5-Color");
        System.out.println("6-Type");
        System.out.println("7-Character");
        System.out.println("8-Size");
        System.out.println("9-eyesCount");
        System.out.println("10-ToothCount");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim().toLowerCase();
        switch (a) {
            case ("1"):
                while (!CheckAge.check) {
                    CheckAge.checkAge(dragon);
                }
                break;
            case ("2"):
                while (!CheckName.check) {
                    CheckName.checkName(dragon);

                }
                break;
            case ("3"):
                while (!CheckCoordinates.check) {
                    Coordinates coordinates = new Coordinates();
                    CheckCoordinates.checkCoordinates(coordinates);
                    dragon.setCoordinates(coordinates);
                }
                break;
            case ("4"):
                while (!CheckAge.check) {
                    CheckAge.checkAge(dragon);
                }
                break;
            case ("5"):
                while (!CheckColor.check) {
                    CheckColor.checkColor(dragon);
                }
                break;
            case ("6"):
                while (!CheckType.check) {
                    CheckType.checkType(dragon);
                }
                break;
            case ("7"):
                while (!CheckCharacter.check) {
                    CheckCharacter.checkCharacter(dragon);
                }
                break;
            case ("8"):
                while (!CheckHead.check2) {
                    DragonHead dragonHead = new DragonHead();
                    CheckHead.checkSize(dragonHead);
                }
                break;
            case ("9"):
                while (!CheckHead.check1) {
                    DragonHead dragonHead = new DragonHead();
                    CheckHead.checkEyes(dragonHead);
                }
                break;
            case ("10"):
                while (!CheckHead.check3) {
                    DragonHead dragonHead = new DragonHead();
                    CheckHead.checkTooth(dragonHead);
                }
                break;


        }
        return dragon;
    }

}

