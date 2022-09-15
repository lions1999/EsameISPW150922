package main;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Multiple {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Multiple.class.getName());
        logger.log(Level.INFO,"Enter Input : ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        switch (inputNumber%2){
            case 1:
                logger.log(Level.INFO,"Is non a multiple of 2");
                break;
            case 0:
                logger.log(Level.INFO,"Is a multiple of 2");
                break;
            default:
                logger.log(Level.INFO,"Input is not compatible");
                break;
        }
        scanner.close();
    }
}