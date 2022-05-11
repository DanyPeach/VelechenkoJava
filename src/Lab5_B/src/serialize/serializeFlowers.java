package serialize;

import by.Print;

import java.io.*;
import java.util.ArrayList;

public class serializeFlowers {
    static by.Print print = new Print();
    public static void serialize(ArrayList<flower.Sweets> flowers, String path) throws IOException {
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            //создаем 2 потока для сериализации объекта и сохранения его в файл
            outputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(outputStream);

            // сохраняем объект в файл
            for (flower.Sweets flower:flowers) {
                objectOutputStream.writeObject(flower.toString());
            }
        } finally {
            // Закроем потоки в блоке finally
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    public static void deserialize(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            //создаем 2 потока для десериализации объекта из файла
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
            //загружаем объект из файла
            while (true){
                try {
                    print.print(String.valueOf(objectInputStream.readObject()));
                } catch (IOException e){
                    print.print("Десериализованы все объекты!");
                    break;
                }
            }
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
        }
    }
}
