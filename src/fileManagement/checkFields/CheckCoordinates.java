package fileManagement.checkFields;
/**
 * класс проверки координат
 */

import сlasses.Coordinates;
import java.util.Scanner;

public class CheckCoordinates {
    public static boolean check = false;

    /**
     * Проверка координат введеных с клавиатры
     * @param coordinates
     */
    public static void checkCoordinates(Coordinates coordinates) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты x,y поочередно");
        try {
            Long x = Long.parseLong(scanner.nextLine());
            if (x>-248){
                coordinates.setX(x);
                System.out.println("координата x = " + x);

            }else{
                System.err.println("число должно быть больше -248");
            }
            Double y = Double.parseDouble(scanner.nextLine());
            coordinates.setY(y);
            System.out.println("координата y = "+y);
            check=true;


        } catch (Exception e) {
            System.err.println("введенные данные не верны");


        }
    }

    /**
     * Проверка координат введеных из файла
     * @param coordinates
     * @param o
     * @param o1
     * @return
     */
    public static boolean checkCoordinatesExecute(Coordinates coordinates, String o, String o1) {
        try {
            Long x = Long.parseLong(o);
            if (x>-248){
                coordinates.setX(x);
                //System.out.println("координата x = " + x);

            }else{
                System.err.println("число должно быть больше -248");
            }
            Double y = Double.parseDouble(o1);
            coordinates.setY(y);
            //System.out.println("координата y = "+y);
            return true;


        } catch (Exception e) {
            System.err.println("введенные данные не верны");
            return false;


        }
    }
}