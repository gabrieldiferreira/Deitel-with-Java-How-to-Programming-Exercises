package LetterG;
import java.util.Scanner;

public class Pag130 {
    public static void main(String [] args){
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        System.out.printf("%s%n %s%n %s%n %s%n",
                "Enter the integer grades in the range 0-100" ,
                "Type the end-of-file indicator to terminate input" ,
                "On UNIX/LINUX/MAC OS X TYPE <CTRL> d then press Enter" ,
                "On Windows type <CTRL> z then press Enter");

        Scanner input = new Scanner(System.in);

        while(input.hasNext()) {
            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;

            switch (grade / 10) {
                case 9:
                case 10:
                    ++aCount;
                    break;

                case 8:
                    ++bCount;
                    break;

                case 7:
                    ++cCount;
                    break;

                case 6:
                    ++dCount;
                    break;

                default:
                    ++fCount;
                    break;
            }
        }

            if (gradeCounter != 0 ){
                double average = (double) total / gradeCounter;

                System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
                System.out.printf("Class averange is %.2f%n", average);
                System.out.printf("%n%s %n%s %n%s %n%s %n%s",
                        "A", aCount,
                        "B", bCount,
                        "C", cCount,
                        "D", dCount,
                        "F", fCount);

            }else {
                System.out.println("No grades were entered!");
            }



    }
}
