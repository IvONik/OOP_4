import java.io.*;
import java.util.List;

public class Record {
    public static void write(List<Task> taskList) {

        try {
            FileOutputStream fos = new FileOutputStream("task.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(taskList);

            oos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void read() {
        try {

            FileInputStream fis = new FileInputStream("task.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Task> taskList = (List<Task>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
