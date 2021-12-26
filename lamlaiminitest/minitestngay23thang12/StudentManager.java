package lamlaiminitest;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public Student CreatStudent() {
        System.out.println(" input name: ");
        String name = scanner.next();
        System.out.println(" input age: ");
        int age = scanner.nextInt();
        System.out.println(" input math point: ");
        double math = scanner.nextDouble();
        System.out.println(" input physics: ");
        double phy = scanner.nextDouble();
        System.out.println(" input chemistry point: ");
        double chem = scanner.nextDouble();
        scanner.nextLine();
        return new Student(name, age, math, phy, chem);

    }

    public boolean addStudent(Student student) {
        return students.add(student);
    }

    public Student upDAteStudent(int id) {
        Student student = null;
        for (Student s : students
        ) {
            if (s.getId() == id) {
                student = s;
            }

        }
        if (student != null) {
            int index = students.indexOf(student);
            System.out.println("input new name:");
            String name = scanner.next();
            student.setName(name);
            System.out.println(" input new age: ");
            int age = scanner.nextInt();
            student.setAge(age);
            System.out.println(" input new MathPoint:");
            double math = scanner.nextDouble();
            student.setMathPoint(math);
            System.out.println(" input new Physcics Point:");
            double phy = scanner.nextDouble();
            student.setPhyPoint(phy);
            System.out.println(" input new Chemistry Point:");
            double chem = scanner.nextDouble();
            student.setChemPoint(chem);
            students.set(index, student);
        }
        return student;
    }

    public Student DeleteStudent(int id) {
        Student student = null;
        for (Student s : students
        ) {
            if (s.getId() == id) {
                student = s;
            }

        }
        if (student != null)
            students.remove(student);
        return student;
    }

    public Student searchById(int id) {
        Student student = null;
        for (Student s : students
        ) {
            if (s.getId() == id) {
                student = s;
            }
        }
        return student;
    }

    public ArrayList<Student> getStudentsByMaxPoint() {
        ArrayList<Student> studentsmax = new ArrayList<>();
        double avg = students.get(0).getAveragePoint();
        for (Student s : students
        ) {
            if (s.getAveragePoint() > avg) {
                avg = s.getAveragePoint();
            }
        }
        for (Student s : students) {
            if (s.getAveragePoint() == avg) {
                students.add(s);
            }
        }
        return studentsmax;
    }

    public ArrayList<Student> sortByAvgPoint() {
        students.sort((o1, o2) -> Double.compare(o2.getAveragePoint(), o1.getAveragePoint()));
        return students;
    }
}



