/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoalno1;

/**
 *
 * @author asyraf
 */
import java.util.Scanner;
public class UKLSoalNo1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen Fibonacci: ");
        int n = input.nextInt();
 
        int a = 0, b = 1;
        int ganjil = 0, genap = 0;

        System.out.println("Deret Fibonacci:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            if (a % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }

            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("\n\nJumlah bilangan genap: " + genap);
        System.out.println("Jumlah bilangan ganjil: " + ganjil);
    }
}
