package Youtube;

import java.io.*;
import java.util.List;

public class FileService {
    public static void writeToFile(List<Person> persons) throws IOException {
    FileOutputStream fileOutputStream = new FileOutputStream("person.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(persons);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public static List<Person> readFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileOutputStream = new FileInputStream("person.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileOutputStream);
        return (List<Person>) objectInputStream.readObject();
    }
}
