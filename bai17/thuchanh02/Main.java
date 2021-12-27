package bai17.thuchanh02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Vu kieu A","Ha noi"));
        students.add(new Student(2,"Vu kieu B","Ha nam"));
        students.add(new Student(3,"Vu kieu C","Ha tay"));
        students.add(new Student(4,"Vu kieu D","Ha tinh"));
        students.add(new Student(5,"Vu kieu E","Ha bac"));
        students.add(new Student(6,"Vu kieu F","Ha tan"));
        writeToFile("Student.txt",students);
        List<Student> studentsDataFromFile = readDataFromFile("student.txt");
        for (Student student: studentsDataFromFile) {
            System.out.println(student);
        }
    }

    public static List<Student> readDataFromFile (String path) {
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }


}
