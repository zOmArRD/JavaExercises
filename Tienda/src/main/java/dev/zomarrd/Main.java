/*
 * Created by IntelliJ Idea Ultimate
 *
 * User: zOmArRD
 * Date: 24/7/2023
 *
 * Copyright (c) 2023. OMY TECHNOLOGY <omar@omy.technology>
 */

package dev.zomarrd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] ventas = new double[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa las 10 ventas del mes: ");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Venta " + (i + 1));
            ventas[i] = scanner.nextDouble();
        }

        int k, total;
        k = total = 0;

        while (k < 10 ) {
            if (ventas[k] >= 2000) {
                System.out.println("$" + ventas[k]);
                total++;
            }
            k++;
        }
        System.out.println("El total de ventas mayores a 2000 es: " + total);
    }
}