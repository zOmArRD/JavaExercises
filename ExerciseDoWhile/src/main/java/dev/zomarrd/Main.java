package dev.zomarrd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, suma = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Introduce un numero: ");
            num = scanner.nextInt();
            suma = suma + num;
        } while (num != 0);

        System.out.println("La suma de todos los numeros es " + suma);
    }
}