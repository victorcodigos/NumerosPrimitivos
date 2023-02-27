package com.numerosprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        String nome = escreva.nextLine();
        float nota = escreva.nextFloat();
        System.out.format("A nota de %s es %.1f \n", nome, nota);
    }
}
