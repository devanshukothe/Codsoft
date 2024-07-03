package Studentmanagement;

import java.util.Scanner;

public class Main {
    private static StudentManagementSystem sms = new StudentManagementSystem();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n--- Student Management System Menu ---");
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Search Student");
        System.out.println("4. Display All Students");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        Student student = new Student(name, rollNumber, grade, address);
        sms.addStudent(student);
        System.out.println("Student added successfully.");
    }

    private static void removeStudent() {
        System.out.print("Enter roll number of the student to remove: ");
        int rollNumber = Integer.parseInt(scanner.nextLine());
        sms.removeStudent(rollNumber);
        System.out.println("Student removed successfully.");
    }

    private static void searchStudent() {
        System.out.print("Enter roll number of the student to search: ");
        int rollNumber = Integer.parseInt(scanner.nextLine());
        Student student = sms.searchStudent(rollNumber);
        if (student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void displayAllStudents() {
        System.out.println("List of all students:");
        for (Student student : sms.getAllStudents()) {
            System.out.println(student);
        }
    }
}
