package doc_ghi_file;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite<E> {

    public void writeFile(String TOBI,List<E> list) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(TOBI);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<E> readFile(String TOBI) {
        List<E> list = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(TOBI);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<E>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

}
