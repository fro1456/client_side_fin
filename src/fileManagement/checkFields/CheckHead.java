package fileManagement.checkFields;

import сlasses.Dragon;
import сlasses.DragonHead;
/**
 * В данном классе производится проверка полей связанных с головой
 */
import java.util.Scanner;

public class CheckHead {
    public static boolean check1 = false;
    public static boolean check2 = false;
    public static boolean check3 = false;
    public static boolean check4 = false;
    //DragonHead dragonHead = new DragonHead();

    /**
     * Проверка значения глаз
     * @param dragonHead
     */
    public static void checkEyes(DragonHead dragonHead) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите количество глаз");
        try {
            String input = scanner.nextLine();
            if (input.trim().equals("")){
                dragonHead.setEyesCount(null);
            }else{

                dragonHead.setEyesCount(Float.parseFloat(input));
            }

            check1=true;
        }
        catch (NumberFormatException e){
            System.err.println("Введенные данные не верны");
        }
    }

    /**
     * Проверка значений головы
     * @param dragonHead
     */
    public static void checkSize(DragonHead dragonHead) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите размер");
        try {
            String input = scanner.nextLine();
            if (input.trim().equals("")){
                dragonHead.setSize(null);
            }else{
                dragonHead.setSize(Float.parseFloat(input));
            }


            check2=true;
        }
        catch (NumberFormatException e){
            e.printStackTrace();
            System.err.println("Введенные данные не верны");
        }
    }

    /**
     * Проверка значений зубов
     * @param dragonHead
     */
    public static void checkTooth(DragonHead dragonHead) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите количество зубов");
        try {
            String input = scanner.nextLine();
            if (input.trim().equals("")){
                dragonHead.setToothCount(null);
            }else{
                dragonHead.setToothCount(Double.parseDouble(input));
            }
            check3=true;
        }
        catch (NumberFormatException e){
            System.err.println("Введенные данные не верны");
        }
    }

    /**
     * Проверка глаз введеных из файла
     * @param dragonHead
     * @param s
     * @return
     */
    public static boolean checkEyesExecute(DragonHead dragonHead, String s) {
        try {
            if (s.equals("")){
                dragonHead.setEyesCount(null);
                return true;
            }else{

                dragonHead.setEyesCount(Float.parseFloat(s));
                return true;
            }


        }
        catch (NumberFormatException e){
            System.err.println("Введенные данные не верны");
        return false;
        }
    }

    /**
     * Проверка размера введеного с файа
     * @param dragonHead
     * @param size
     * @return
     */
    public static boolean checkSizeExecute(DragonHead dragonHead,String size) {
        try {
            if (size.equals("")){
                dragonHead.setSize(null);
                return true;
            }else{
                dragonHead.setSize(Float.parseFloat(size));
                return true;
            }
        }
        catch (NumberFormatException e){
            e.printStackTrace();
            System.err.println("Введенные данные не верны");
            return false;
        }
    }

    /**
     * Проверка зубов введеных из файла
     * @param dragonHead
     * @param tooth
     * @return
     */
    public static boolean checkToothExecute(DragonHead dragonHead,String tooth) {
        try {
            if (tooth.equals("")){
                dragonHead.setToothCount(null);

                return true;
            }else{
                dragonHead.setToothCount(Double.parseDouble(tooth));
                return true;
            }
        }
        catch (NumberFormatException e){
            System.err.println("Введенные данные не верны");
            return false;
        }
    }
}
