package btvn_24_12.bt29_12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    private final Scanner  scanner = new Scanner(System.in);

    public StudentManager() {
    }

    public Student creatStudent() {
        System.out.println("input name: ");
        String name = scanner.next();
        System.out.println("input age: ");
        int age = scanner.nextInt();
        System.out.println("input gender: ");
        String gender = scanner.next();
        System.out.println("input address: ");
        String address = scanner.next();
        System.out.println("input averagePoint");
        double avgPoint = scanner.nextDouble();
        scanner.nextLine();
        return new Student(name,age,gender,address,avgPoint);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student editStudent(String name) {
        Student student = null;
        for (Student s: students) {
            if (s.getName().equals(name)) {
                student = s;
            }
        }
        if (student != null){
            int index = students.indexOf(student);
            System.out.println("input new name: ");
            String name1 = scanner.next();
            student.setName(name1);
            System.out.println("input new age: ");
            int age = scanner.nextInt();
            student.setAge(age);
            System.out.println("input new gender: ");
            String gender = scanner.next();
            student.setGender(gender);
            System.out.println("input new address: ");
            String address = scanner.next();
            student.setAddress(address);
            System.out.println("input new averagePoint");
            double avgPoint = scanner.nextDouble();
            student.setAvgPoint(avgPoint);
            students.set(index,student);
        }
        return student;
    }

    public Student deleteStudent(String name){
        Student student = null;
        for (Student s: students) {
            if (s.getName().equals(name)) {
                student = s;
            }
        }
        if (student != null) {
            students.remove(student);
        }
        return student;
    }

    public void displayAll(){
        for (Student student: students) {
            System.out.println(student);
        }
    }

    public ArrayList<Student> displayByAvgPointOver7point5(){
        ArrayList<Student> student= new ArrayList<>();
        for (Student s: students) {
            if (s.getAvgPoint() > 7.5 ){
                    student.add(s);
            }
        }
        return student;

    }

    public void saveInfor() {
        File file = new File("btvn_24_12/bt29_12/SaveFile.txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bf = new BufferedWriter(fw);
            for (Student student : students ) {
                bf.write(student.displayXepLoai());
            }
            bf.flush();
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readInfor(){
        File file = new File("btvn_24_12/bt29_12/SaveFile.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
