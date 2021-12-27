package lamlaiminitest.minitestngay23thang12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            StudentManager studentManager = new StudentManager();
            Scanner scanner = new Scanner(System.in);

            int choice;
            do {
                System.out.println("Menu");
                System.out.println("1. Add student");
                System.out.println("2. Edit student");
                System.out.println("3. Delete student");
                System.out.println("4. Search student by id");
                System.out.println("5. Sort by average point");
                System.out.println("6. Find students by max average point");
                System.out.println("0. Exit");
                System.out.println("Input your choice: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        Student student = studentManager.CreatStudent();
                        studentManager.addStudent(student);
//                        if ( studentManager.addStudent(student))
//                            System.out.println("Add succcesfully!!");
//                        else
//                            System.out.println("Add failed!!!");
                        break;
                    case 2:
                        System.out.println(" input id want to edit");
                        int idEdit = scanner.nextInt();
                        Student studentEdit = studentManager.upDAteStudent(idEdit);
                        if (studentEdit != null)
                            System.out.println("Edit successfully!");
                        else
                            System.out.println(" Edit failed!");
                        break;
                    case 3:
                        System.out.println(" input id want to delete");
                        int idDelete = scanner.nextInt();
                        Student studentDelete = studentManager.DeleteStudent(idDelete);
                        if (studentDelete != null)
                            System.out.println("delete successfully");
                        else
                            System.out.println("delete failed!");
                        break;
                    case 4:
                        System.out.println("input id you want to search");
                        int idSearch = scanner.nextInt();
                        Student student4 = studentManager.searchById(idSearch);
                        if (student4 != null)
                            System.out.println(student4);
                        else
                            System.out.println("student not found");
                        break;
                    case 5:
                        ArrayList<Student> students = studentManager.sortByAvgPoint();
                        students.forEach(System.out :: println);
                        break;
                    case 6:
                        ArrayList<Student> studentMax = studentManager.getStudentsByMaxPoint();
                        studentMax.forEach(System.out::println);
                        break;
                }
            } while (choice != 0);
        }
    }