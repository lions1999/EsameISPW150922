package main;

import java.util.Scanner;
public class Multiple {
    public static void main(String[] args) {
        System.out.println("Enter Input : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a%2){
            case 1:
                System.out.println(a+" is non a multiple of 2");
                break;
            case 0:
                System.out.println(a+" is a multiple of 2");
                break;
            default:
                System.out.println(a);
                break;
        }
        System.out.println(a);
        scanner.close();
    }
}