/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoalno4;

/**
 *
 * @author asyraf
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UklSoalNo4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int angkaBenar = rand.nextInt(100)+1; 
        ArrayList<Integer> riwayatTebakan = new ArrayList<>();

        System.out.println("=== Permainan Tebak Angka (1-100) ===");

        int tebakan = 0;
        while (tebakan != angkaBenar) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input.nextInt();
            riwayatTebakan.add(tebakan);

            if (tebakan > angkaBenar) {
                System.out.println("Tebakan terlalu tinggi!");
            } else if (tebakan < angkaBenar) {
                System.out.println("Tebakan terlalu rendah!");
            } else {
                System.out.println("Anda menebak dengan benar!");
            }
        }

        // Tampilkan riwayat tebakan
        System.out.println("\nRiwayat tebakan Anda:");
        for (int t : riwayatTebakan) {
            System.out.print(t + " ");
        }
    }
}
