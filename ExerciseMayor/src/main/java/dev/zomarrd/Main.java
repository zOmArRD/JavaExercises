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
        int[] array = new int[5];
        int mayor = array[0];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los 5 numeros: ");

        int i = 0;
        do {
            array[i] = scanner.nextInt();
            if (array[i] > mayor) {
                mayor = array[i];
            }
            i++;
        } while (i < array.length);

        System.out.println("El numero mayor es: " + mayor);
    }
}