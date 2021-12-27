package bai16;

import bai16.thuchanh02.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class demo1 {
    public static void main(String[] args) {

        Student s1 = new Student("nguyen van a", 20, 8.5);
        Student s2 = new Student("nguyen van b", 20, 8.5);
        Student s3 = new Student("nguyen van c", 20, 8.5);
        Student s4 = new Student("nguyen van d", 20, 8.5);
        Student s5 = new Student("nguyen van e", 20, 8.5);
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        try {
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (Student s : list) {
               bw.write(s.toString());
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
        }

    }
}
