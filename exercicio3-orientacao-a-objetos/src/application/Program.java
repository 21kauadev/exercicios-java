package application;

import java.util.Scanner;

import entities.Grader;
import entities.Student;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student; // aluno
        student = new Student();

        Grader grader; // fará a análise se o aluno passou ou não
        grader = new Grader();

        System.out.print("Student name: ");
        student.name = sc.nextLine();

        System.out.print("Grade 1: ");
        student.grade1 = sc.nextDouble();

        System.out.print("Grade 2: ");
        student.grade2 = sc.nextDouble();

        System.out.print("Grade 3: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
        System.out.println(grader.verifyStudentApproval(student));

        if (grader.verifyStudentApproval(student) == "FAILED")
            System.out.printf("MISSING %.2f POINTS", student.calculatesMissingPoints());

        // optei por nao sobrescrever o metodo toString desta vez, pois a exibição foi
        // bem simples.

        sc.close();
    }
}
