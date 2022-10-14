package at.ac.fhcampuswien;

import java.util.Scanner;

import java.util.Scanner;

public class App {
    Scanner scan = new Scanner(System.in);

    //todo Task 1
    public void largestNumber() {
        // input your solution here
        double number;
        int count = 1;
        double max = 0;

        do {
            System.out.print("Number " + count + ": ");
            number = scan.nextFloat();
            //System.out.printf(); //für die doubles

            if (count == 1 && number <= 0) {
                System.out.println("No number entered.");
                break;
            }
            if (number > max) {
                max = number;
            }

            if (number <= 0) {

                System.out.printf( "The largest number is "+ "%.2f", max);
                System.out.println();

            }
            count++;

        } while (number > 0);
    }


    //todo Task 2
    public void stairs() {
        // input your solution here
        int z = 1;
        System.out.print("n: ");
        int rows = scan.nextInt();

        if (rows <= 0) {
            System.out.println("Invalid number!");
        } else {
            for (int i = 1; i <= rows; i++) {
                for (int y = 0; y < i; y++) {
                    System.out.print(z++ + " ");
                }
                System.out.println();
            }
        }

    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here
        int number = 6;

        for (int z = 1; z <= number; z++) {
            for (int k = number - z; k > 0; k--) {
                System.out.print(" ");
            }
            for (int q = 1; q <= (z * 2) - 1; q++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here
        System.out.print("h: ");
        int h = scan.nextInt(); //h=9
        System.out.print("c: ");
        char c = scan.next().charAt(0);


        if (h % 2 == 0) {
            System.out.println("Invalid number!");
        } else {
            for (int i = 1; i <= h / 2 + 1; i++) { // Zeilenumbruch
                for (int j = h / 2; j >= i; j--) {
                    System.out.print(" "); //Abstände
                }
                for (int k = i; k > 0; k--) {
                    System.out.print((char) (c - k + 1));
                }
                for (int l = 1; l < i; l++) {
                    System.out.print((char) (c - l));
                }
                System.out.println();
            }
            for (int i = h / 2; i > 0; i--) {
                for (int j = h / 2; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = i; k > 0; k--) {
                    System.out.print((char) (c - k + 1));
                }
                for (int l = 1; l < i; l++) {
                    System.out.print((char) (c - 1));
                }
                System.out.println();
            }
        }
    }

    //todo Task 5
    public void marks() {
        // input your solution here
        Scanner scan= new Scanner(System.in);
       int number = 1;
       double mark = 1;
       double sum = 0;
       double average;
       int countMarks = 0;
       int countNegativeMarks = 0;

       while (mark > 0){
           System.out.print("Mark " + number + ": ");
           number++;

           mark = scan.nextInt();

           if ((number == 2) && (mark == 0)) {
               System.out.println("Average: 0,00");
               System.out.println("Negative marks: 0");

           }else if ((mark > 5) && (mark != 0))
           {
               System.out.println("Invalid mark!");
               number--;

           }else if ((mark > 0) &&(mark < 6))
           {
               sum = sum + mark;
               countMarks++;

               if(mark == 5) {
                   countNegativeMarks++;
               }

           }else if (mark == 0){
               average = sum/(countMarks);
               System.out.println("Average: "+ String.format("%.2f", average));
               System.out.println("Negative marks: "+ countNegativeMarks);
           }
           }
       }
    //todo Task 6
    public void happyNumbers() {
        // input your solution here
        Scanner scan= new Scanner(System.in);
        System.out.print("n: ");
        int number = scan.nextInt();
        int sum_2;
        int digit3;
        int digit2;
        int digit1;

        while (number > 0) {

            if (number != 1 && number != 4) {
                digit3 = number % 10;
                digit2 = (number / 10) % 10;
                digit1 = (number / 100) % 10;

                sum_2 = (int) (Math.pow(digit1,2) + Math.pow(digit2,2) + Math.pow(digit3,2));
                number = sum_2;

            } else if (number == 1) {
                System.out.println("Happy number!");
                break;

            } else if (number == 4) {
                System.out.println("Sad number!");
                break;
            }
        }
    }
    public static void main(String[] args) {
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}