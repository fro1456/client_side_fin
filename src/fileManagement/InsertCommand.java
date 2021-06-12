package fileManagement;
/**
 * Класс отвечает за команду Insert
 */

import fileManagement.checkFields.*;
import сlasses.Coordinates;
import сlasses.Dragon;
import сlasses.DragonHead;
import сlasses.RequestedClass;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class InsertCommand {
    /**
     * Метод отвечающий за команду Insert
     * @param
     * @param key
     */
    public String a;
    public static Dragon insert(long key) {

        Dragon dragon = new Dragon();
        dragon.setId(key);
        if(true) {
            Scanner scanner = new Scanner(System.in);
            String name;
            int age;
            int parseId;
            while (true) {
                //System.out.println("введите имя");
                //name = scanner.nextLine();
                    while (!CheckName.check) {
                        CheckName.checkName(dragon);
                        System.out.println(dragon.getName());
                    }
                    CheckName.check=false;
                  //  dragon.setName(name);
                  //  System.out.println("введите возраст");
                   // age = scanner.nextInt();
                    while (!CheckAge.check) {
                        CheckAge.checkAge(dragon);
                        //System.out.println(dragon.getAge());
                    }
                    CheckAge.check=false;
                    Coordinates coordinates = new Coordinates();
                    while (!CheckCoordinates.check) {
                        CheckCoordinates.checkCoordinates(coordinates);
                        System.out.println(dragon.getCoordinates());
                    }
                    dragon.setCoordinates(coordinates);
                    CheckCoordinates.check=false;
                    dragon.setCreationDate(new Date());
                    System.out.println("Дата создания установленна " + dragon.getCreationDate());
                    while (!CheckColor.check) {
                        CheckColor.checkColor(dragon);
                        System.out.println(dragon.getColor());
                    }
                CheckColor.check=false;
                while (!CheckCharacter.check) {
                        CheckCharacter.checkCharacter(dragon);
                        System.out.println(dragon.getCharacter());
                    }
                CheckCharacter.check=false;
                while (!CheckType.check) {
                        CheckType.checkType(dragon);
                        dragon.getType();
                }
                CheckType.check=false;
                try {

    System.out.println("Создание головы" + "(ограничения по вводимым данным отсутствуют)");
    DragonHead dragonHead = new DragonHead();
    // //System.out.println("введите количество глаз");
    //String s=scanner.nextLine();
//    try {
//        int l=Integer.parseInt(s);
//    }catch (NumberFormatException e){
//        int l;
//    }
    while (!CheckHead.check1){
        CheckHead.checkEyes(dragonHead);
    }
    CheckHead.check1=false;
//    while (!CheckHead.check2){
//        CheckHead.checkSize(dragonHead);
//    }
//    while (!CheckHead.check3){
//        CheckHead.checkTooth(dragonHead);
//    }
    System.out.println("введите размер головы");
    dragonHead.setSize(Float.parseFloat(scanner.nextLine()));
    System.out.println("Введите количество зубов");
    dragonHead.setToothCount(Double.parseDouble(scanner.nextLine()));

    dragon.setHead(dragonHead);

    System.out.println("Начинаем добавлять в колекцию");
    System.out.println(dragon);
    System.out.println("Вроде добавили");
    return dragon;
}catch (NumberFormatException r){

}

            }
        } else {
            System.err.println("ID некорректен!");
        }
        return null;
    }
}
