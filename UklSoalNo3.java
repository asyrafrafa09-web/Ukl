/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoalno3;

/**
 *
 * @author asyraf
 */
import java.util.Scanner;
public class UklSoalNo3 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan bulat: ");
        int n = input.nextInt();

        long faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        System.out.println("Faktorial dari " + n + " adalah " + faktorial);
    }
}
