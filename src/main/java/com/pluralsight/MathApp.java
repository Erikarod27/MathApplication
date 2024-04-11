package com.pluralsight;
import java.util.Random;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MathApp {
    public static void main(String[] args) {
        //Question 1
        //declare variables
        int bobSalary = 70000;
        int garySalary = 50000;
        int highestSalary;
        //code solution
        highestSalary = Math.max(bobSalary, garySalary);
        //print answer
        System.out.println("Q1: The Highest salary is " + highestSalary);

        //Question 2
        //declare variables
        int carPrice = 35000;
        int truckPrice = 42000;
        int cheaperVehicle;
        //code solution
        cheaperVehicle = min(carPrice, truckPrice);
        //print answer
        System.out.println("Q2: The cheaper vehicle is " + cheaperVehicle);

        //Question 3
        //declare variables
        double radius = 7.50;
        //code solution
        double area = Math.PI * Math.pow(radius, 2);
        //print answer
        System.out.println("Q3: The area of a circle whose radius is " + radius + " is " + area);

        //Question 4
        //declare variables
        double num = 7.25;
        //code solution
        double squareRoot = Math.sqrt(num);
        //print answer
        System.out.println("Q4: The square root of " + num + " is " + squareRoot);

        //Question 5
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double distance;
        //code solution
        distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        //print answer
        System.out.println("Q5: The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distance);

        //Question 6
        //declare variable
        double negNum = -3.8;
        //code solution
        double absoluteValue = Math.abs(negNum);
        //print answer
        System.out.println("Q6: The absolute value of " + negNum + " is " + absoluteValue);

        //Question 7
        //declare variables
        //code solution
        Random random = new Random();
        double randomNum = random.nextDouble();
        //print solution
        System.out.println("Q7: A random number between 0 and 1 is " + randomNum);
        }
}
