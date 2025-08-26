package GradeBook;

import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] gradesArray = new int[10];

        System.out.println("Entre com 10 notas:");

        for(int i = 0; i < gradesArray.length; i++){
            System.out.printf("Nota do Aluno %d: ", i+1);
            gradesArray[i] = sc.nextInt();
        };

        GradeBook myGradeBook = new GradeBook("CS101 Introdution to java Programming!", gradesArray);

        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();

        sc.close();
    };
};
