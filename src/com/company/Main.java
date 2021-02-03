package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        practicalTaskNo2point1();
        practicalTaskNo2point2();
        practicalTaskNo2point3();
    }

    public static void practicalTaskNo2point1() {
        Scanner input = new Scanner (System.in);
        System.out.println("What day is it? Choose from 1 till 7!");
        int day = input.nextInt();
        if (day<0) {
            System.out.println("Day number can be only positive!");
        } else {
            switch (day) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("It is a working day.");
                    break;
                case 6:
                case 7:
                    System.out.println("It is holiday.");
                    break;
                default:
                    System.out.println("You day isn't valid.");
            }
        }
    }

    public static void practicalTaskNo2point2() {
        Scanner input = new Scanner (System.in);
        System.out.println("What is your grade?");
        System.out.println("A; B; C; D; E; F? ");
        char grade = input.next().toUpperCase().charAt(0);
        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Perfect! You are so clever!");
                break;
            case 'C':
                System.out.println("Good! But you can do better!");
                break;
            case 'D':
            case 'E':
                System.out.println("It is not good! You should study!");
                break;
            case 'F':
                System.out.println("Fail! You need to repeat the exam!");
                break;
            default:
                System.out.println("Your grade isn't valid!");
        }

    }
    public static void practicalTaskNo2point3() {
        Scanner input = new Scanner (System.in);
        System.out.println("Write you first number:");
        int valueOne = input.nextInt();
        System.out.println("Write you second number:");
        int valueTwo = input.nextInt();
        System.out.printf("What do you want to do with your numbers?%nChoose your operation:%n");
        System.out.printf(" to sum both elements +%n to do subtraction -%n to do dividing /%n to do multiplication *%n");
        System.out.println(" to get remainder %");
        System.out.printf(" to print out both elements p%n to verify which element is bigger b%n to verify which element is smaller s%n");
        char operation = input.next().charAt(0);
        switch (operation){
            case '+':
                System.out.println("Addition result: " + (valueOne + valueTwo));
                break;
            case '-':
                System.out.println("Subtraction result: " + (valueOne - valueTwo));
                break;
            case '/':
                System.out.println("Division result: " + (valueOne / valueTwo));
                break;
            case '*':
                System.out.println("Multiplication result: " + (valueOne * valueTwo));
                break;
            case '%':
                System.out.println("Remainder result: " + (valueOne % valueTwo));
                break;
            case 'p':
                System.out.printf("Your first number: " + valueOne + "%n" + "Your second number: " + valueTwo);
                break;
            case 'b':
                System.out.println("The bigger number is " + (valueOne > valueTwo ? "first one: " + valueOne : "second one: " + valueTwo));
                break;
            case 's':
                System.out.println("The smaller number is " + (valueOne < valueTwo ? "first one: " + valueOne : "second one: " + valueTwo));
                break;
            default:
                System.out.println("Your operation isn't valid.");

        }
    }


}
