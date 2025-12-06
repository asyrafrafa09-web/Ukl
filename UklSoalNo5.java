/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoalno5;

/**
 *
 * @author asyraf
 */
import java.util.HashMap;
import java.util.Arrays;
public class UklSoalNo5 {

    public static void main(String[] args) {

        int[] array = {1, 2, 2, 3, 3, 3, 4};

        // Tampilkan array
        System.out.println("Array: " + Arrays.toString(array));

        HashMap<Integer, Integer> frekuensi = new HashMap<>();

        // Hitung frekuensi setiap elemen
        for (int num : array) {
            if (frekuensi.containsKey(num)) {
                frekuensi.put(num, frekuensi.get(num) + 1);
            } else {
                frekuensi.put(num, 1);
            }
        }

        // Tampilkan hasil frekuensi
        System.out.println("\nFrekuensi elemen:");
        for (int key : frekuensi.keySet()) {
            System.out.println(key + " muncul " + frekuensi.get(key) + " kali");
        }
    }
}

