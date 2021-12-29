package btvn_24_12.bt29_12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    // b1: tạo 1 thuộc tính
    public static final String PATH_NAME = "btvn_24_12/students.csv";
    private ArrayList<Student> students = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);



//b2: tạo constructor với tham số readfile
    public StudentManager() {
        this.students = readFile(PATH_NAME);
    }

    public ArrayList<Student> getStudents(){
        return students;
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
        return new Student(name, age, gender, address, avgPoint);
    }

    public void addStudent(Student student) {
        students.add(student);
        writeFile(students, PATH_NAME);
        System.out.println("Add successfully!");
    }

    public Student editStudent(String name) {
        Student student = null;
        for (Student s : students) {
            if (s.getName().equals(name)) {
                student = s;
            }
        }
        if (student != null) {
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
            students.set(index, student);
            writeFile(students, PATH_NAME);
            System.out.println("Update student have name = " + name + " successfully!");
        }
        return student;
    }

    public Student deleteStudent(String name) {
        Student student = null;
        for (Student s : students) {
            if (s.getName().equals(name)) {
                student = s;
            }
        }
        if (student != null) {
            students.remove(student);
            writeFile(students,PATH_NAME);
            System.out.println("Delete student have name = \" + name + \" successfully!");
        }
        return student;
    }

    public void displayAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public ArrayList<Student> displayByAvgPointOver7point5() {
        ArrayList<Student> student = new ArrayList<>();
        for (Student s : students) {
            if (s.getAvgPoint() > 7.5) {
                student.add(s);
            }
        }
        return student;

    }
    public void displayStudentFormat() {
        if (students.isEmpty()) {
            System.out.println("List students is Empty!");
            return;
        }
        for (Student student : students) {
            if (student.getAvgPoint() > 8.0) {
                System.out.println(student.getName() + " - " + student.getAvgPoint() + " - " + "Good");
            } else if (student.getAvgPoint() > 6.0) {
                System.out.println(student.getName() + " - " + student.getAvgPoint() + " - " + "Pretty");
            } else if (student.getAvgPoint() > 4.0) {
                System.out.println(student.getName() + " - " + student.getAvgPoint() + " - " + "Normal");
            } else {
                System.out.println(student.getName() + " - " + student.getAvgPoint() + " - " + "Weak");
            }
        }
    }

    public void writeFile(ArrayList<Student> students, String path) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Student student : students) {
                bufferedWriter.write(student.getName() + "," + student.getAge() + ","
                        + student.getGender() + "," + student.getAddress() + "," + student.getAvgPoint() +"\n");
            }
            bufferedWriter.close();
            System.out.println("Write file successfully!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public ArrayList<Student> readFile(String path) {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File(PATH_NAME);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                students.add(new Student(strings[0], Integer.parseInt(strings[1]), strings[2], strings[3], Double.parseDouble(strings[4])));
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return students;
    }

}
