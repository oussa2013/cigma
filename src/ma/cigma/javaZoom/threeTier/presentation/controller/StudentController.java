package ma.cigma.javaZoom.threeTier.presentation.controller;

import ma.cigma.javaZoom.threeTier.presentation.model.Student;
import ma.cigma.javaZoom.threeTier.service.StudentService;
import ma.cigma.javaZoom.threeTier.service.StudentServiceImpl;

import java.util.Scanner;

/**
 * Created by Oussama_Qaiboub on 2020-12-29.
 */
public class StudentController {

    static StudentService studentService = new StudentServiceImpl();

    public static void main(String[] args) {

        //Recuperation
        Scanner student = new Scanner(System.in);
        System.out.println("Saisir le nom");
        String name = student.nextLine();
        System.out.println("Saisir votre age :");
        int age = student.nextInt();

        //Construire l'objet
        Student student1 = new Student();
        student1.setFirstName(name);
        student1.setAge(age);

        studentService.save(student1);
    }




}

