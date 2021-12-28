package Youtube;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("JMaster.io");
        p1.setAge(6);

        Person p2 = new Person();
        p1.setName("Trungtamjava.com");
        p1.setAge(3);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);

        FileService fileService = new FileService();
        try {
            fileService.writeToFile(persons);

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            List<Person> plist = fileService.readFromFile();
            for (Person p: plist) {
                System.out.println(p.getName());
            }

            Person p3 = new Person();
            p3.setName("abc");
            p3.setAge(7);

            plist.add(p3);

            fileService.writeToFile(plist);
            System.out.println(" sau khi update");

            for (Person p: fileService.readFromFile()) {
                System.out.println(p.getName());
            }

        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
