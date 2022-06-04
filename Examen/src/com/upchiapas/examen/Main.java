//Manuel Alejandro Peregrino Clemente       221324
//Yazmín Reyes Ruiz                         221262

package com.upchiapas.examen;
import com.upchiapas.examen.models.palabra;
import java.util.Scanner;

public class Main {
     public static String Teclado;

    public static void main(String[] args)
    {
        System.out.println("Introduzca una notación a ordenar");
        Scanner teclado = new Scanner(System.in);
        Teclado = teclado.nextLine();
        palabra Palabrita = new palabra(Teclado);
        Palabrita.Pref();



    }
}