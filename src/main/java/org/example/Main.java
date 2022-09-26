package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv et nummer.");
        int num1 = sc.nextInt();
        System.out.println("Skriv et nummer mer.");
        int num2 = sc.nextInt();
        int sum = num1 * num2;
        System.out.println("Summen er: " + sum);
    }
}