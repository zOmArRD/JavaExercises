/*
 * Created by IntelliJ Idea Ultimate
 *
 * User: zOmArRD
 * Date: 28/7/2023
 *
 * Copyright (c) 2023. OMY TECHNOLOGY <omar@omy.technology>
 */

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