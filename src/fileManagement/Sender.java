package fileManagement;

import сlasses.AnswerClass;
import сlasses.Dragon;
import сlasses.RequestedClass;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Locale;
import java.util.Scanner;

public class Sender {
    private SocketChannel socketChannel;
    private ServerSocketChannel channel;
    private Socket s = new Socket();
    private ByteBuffer k;
    private Selector selector;
    private String answer;
    private RequestedClass data;

    //подключение
    public void connection() throws IOException, ClassNotFoundException, InterruptedException {
        while (true) {
            try {
                s = new Socket("localhost", 12842);
                System.out.println("connected...");
                while (true) {
                    try {
                        Scanner scanner = new Scanner(System.in);
                        String input = scanner.nextLine().toLowerCase(Locale.ROOT).trim();
                        String[] arr = input.split(" ");
                        Validation validation = new Validation();
                        RequestedClass command=validation.validation(arr);
                        //validation.validation(arr);
                        if (command!=null){
                            Working(command);
                        }
                        //System.out.println(command.toString());

                        //RequestedClass command = new RequestedClass(arr);

                    } catch (IOException e) {
                        //e.printStackTrace();
                    }
                }
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("connection was interupted...\n new connection after 5sec");
                Thread.sleep(5000);
            }
            connection();
        }

    }
    public void Working(RequestedClass command) throws InterruptedException, IOException, ClassNotFoundException {
        writing(command);
        reading();
    }
    private void reading() throws IOException, ClassNotFoundException, InterruptedException {
        try {


            ByteBuffer buffer = ByteBuffer.allocate(8192);
            buffer.clear();
            InputStream i = s.getInputStream();
            i.read(buffer.array());
            ByteArrayInputStream bais = new ByteArrayInputStream(buffer.array());
            ObjectInputStream ois = new ObjectInputStream(bais);
            AnswerClass command = (AnswerClass) ois.readObject();
            answer = command.getMessage();
            System.out.println(answer);
        }catch (Exception e){
            System.out.println("Connection lost");
            connection();
        }

        //System.out.println(ois.readObject());
        //data = (RequestedClass) ois.readObject();


//            Validation validation = new Validation();
//            validation.validation(arr);
//            RequestedClass command = new RequestedClass(arr);
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            ObjectOutputStream oos = new ObjectOutputStream(bos);
//            oos.writeObject(command);
//            oos.flush();
//            byte[] data = bos.toByteArray();
//            ByteBuffer buffer = ByteBuffer.wrap(data);
//            return buffer;

    }

    private void writing(RequestedClass command) throws IOException {
        try {


            ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            OutputStream o = s.getOutputStream();
            oos.writeObject(command);
            oos.flush();
            byte[] data = baos.toByteArray();
            ByteBuffer buffer = ByteBuffer.wrap(data);
            o.write(buffer.array());
        }catch (Exception e){
//            e.printStackTrace();
            System.out.println("потеряно соединение");
            try {
                connection();
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }

    //    public void connect() throws IOException {
//        while (true) {
//            try {
//                s = new Socket("localhost",12842);
//                ByteBuffer k = sendCommand();
//                //socketChannel = SocketChannel.open();
//                //socketChannel.connect(new InetSocketAddress("localhost",12842));
//
//            } catch (IOException e) {
//                e.printStackTrace();
//                System.out.println("server error, retry after 5sec");
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException interruptedException) {
//                    interruptedException.printStackTrace();
//                }
//                connect();
//            }
//        }
//    }
//
//    public ByteBuffer sendCommand() throws IOException {
//        while (true) {
//            OutputStream o = s.getOutputStream();
//            o.write(k.array());
//            InputStream i = s.getInputStream();
//            Scanner scanner = new Scanner(System.in);
//
//            String input = scanner.nextLine();
//            input = input.toLowerCase();
//            String arr[] = input.split(" ");
//            Validation validation = new Validation();
//            validation.validation(arr);
//            RequestedClass command = new RequestedClass(arr);
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            ObjectOutputStream oos = new ObjectOutputStream(bos);
//            oos.writeObject(command);
//            oos.flush();
//            byte[] data = bos.toByteArray();
//            ByteBuffer buffer = ByteBuffer.wrap(data);
//            return buffer;
//            //RequestedClass command = new RequestedClass(arr)
//        }
//    }
////        try {
//        //Socket socket = new Socket("127.0.0.1", 8000);
//        //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//
//        //RequestedClass requestedClass = new RequestedClass("info", 2L);
//        //System.out.println("connected");
////                Scanner scanner = new Scanner(System.in);
////                String a = scanner.nextLine();
//        //System.out.println(scanner);
////            socketChannel.write(buffer);
////                    writer.newLine();
////                    writer.flush();
//        //} catch (IOException e) {
//        //  System.err.println("Connection error");
//        //  connect();
//        //}
//        //return null;
//    //отправка
//
//    //server answer
    public void getAnswer() {
        try {
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            int num = socketChannel.read(byteBuffer);
            if (num == SocketChannel.open().read(byteBuffer)) ;

        } catch (IOException e) {
            System.out.println("connection error");
            e.printStackTrace();
        }
    }

}

