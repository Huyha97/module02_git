package btvn_24_12.bt29_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Add student");
            System.out.println("2. Delete student by name");
            System.out.println("3. Edit student by name");
            System.out.println("4. Display all Student");
            System.out.println("5. Display all student with avgPoint > 7,5");
            System.out.println("6. Display student by syntax");
            System.out.println("0. Exit");
            System.out.println("Input your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Student student = studentManager.creatStudent();
                    studentManager.addStudent(student);
                    break;
                case 2:
                    System.out.println(" input student name want to delete");
                    String deleteName = scanner.next();
                    Student studentDelete = studentManager.deleteStudent(deleteName);
                    System.out.println(studentDelete);
                case 3:
                    System.out.println(" input student name want to edit");
                    String editName = scanner.next();
                    Student editStudent = studentManager.deleteStudent(editName);
                    System.out.println(editStudent);
                case 4:
                    studentManager.displayAll();
                case 5:
                    System.out.println(studentManager.displayByAvgPointOver7point5());
                case 6:
                    studentManager.saveInfor();
                case 7:
                    studentManager.readInfor();



            }
        } while (choice !=0);
    }
}
