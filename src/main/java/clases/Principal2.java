/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author PC-12
 */
public class Principal2 {

    public static void main(String[] args) {
 

        var arreglo1 = new Arreglo();
        var arreglo2 = new Arreglo();
        var vector1 = arreglo1.crearVector(5);
        for (int i = 0; i < vector1.length; i++) {
            System.out.println(vector1[i]);
        }
        var vector2 = arreglo2.crearVector(5);
        for (int j = 0; j < vector2.length; j++) {
            System.out.println(vector2[j]);
        }
        var sumax = new Arreglo();
        var suma1 = sumax.sumaVector(vector1, vector2);

        var arreglo3 = new Arreglo();
        var arreglo4 = new Arreglo();
        var matriz1 = arreglo3.crearMatriz(5, 5);
        for (int k = 0; k < vector1.length; k++) {
            for (int m = 0; m < vector1.length; m++) {
                
            System.out.println(matriz1[k][m]);
        }
        }

        var matriz2 = arreglo4.crearMatriz(5,5);
        for (int l = 0; l < vector2.length; l++) {
            for (int n = 0; n < vector2.length; n++) {
            System.out.println(matriz2[l][n]);
            }
        }
        var sumay = new Arreglo();
        var suma2 = sumax.sumaMatriz(matriz1, matriz2);
    }
}
