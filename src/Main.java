//import fileManagement.Input;
//import сlasses.*;
//import com.google.gson.*;
//import commands.CommandWorker;

import fileManagement.Sender;
import сlasses.RequestedClass;

import java.io.*;

/**
 * Класс Main, организуюзий выполнение программы
 */
public class Main {

//        CommandWorker commandWorker = new CommandWorker();
//        commandWorker.worker();

    /**
     * Метод main
     *
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {

        Sender sender = new Sender();
        try {
            sender.connection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        while (true)
//            try (Socket socket = new Socket("127.0.0.1", 8000);
//                 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//                 BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            ) {
//                RequestedClass requestedClass = new RequestedClass("info",2L);
//                System.out.println("user connected");
//                Scanner scanner = new Scanner(System.in);
//                String a = scanner.nextLine();
//                //System.out.println(scanner);
//                ByteArrayOutputStream bos = new ByteArrayOutputStream();
//                ObjectOutputStream oos = new ObjectOutputStream(bos);
//                oos.writeObject(requestedClass);
//                oos.flush();
//                byte[] data = bos.toByteArray();
//                ByteBuffer buffer = ByteBuffer.wrap(data);
//                writer.newLine();
//                writer.flush();
//            } catch (IOException e) {
//                System.err.println("Connection error");
//                throw new RuntimeException(e);
//            }

        //System.out.println(roach.toJson(dragon));

        //Input in = new Input();
        //try {
        //    in.FileInput();
        //} catch (IOException e) {
        //e.printStackTrace();
        //}
        //catch (NullPointerException e){
        //    System.out.println("Проверьте переменную окружения на Гелиосе!");
        //}

    }
}
