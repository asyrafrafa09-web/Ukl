/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoalno2;

/**
 *
 * @author asyraf
 */
public class UklSoalNo2 {

    public static void main(String[] args) {
        for (int i = 1; i >= 50; i++) {

            if (i == 1) {
                System.out.println(i + ". saya senang");
            } 
            else if (i % 3 == 0) {
                System.out.println(i + ". saya angkatan 34");
            }
            else if (i % 2 == 0) {
                System.out.println(i + ". saya anak moklet");
            }
            else {
                System.out.println(i + ". saya anak wikusama");
            }
        }
    }
}
