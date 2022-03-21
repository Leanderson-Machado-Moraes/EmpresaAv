package br.empresa.classes;

import java.util.Scanner;

public class UsaProducao extends Producao {

    public static void main(String[] args) {

        Producao prod = new Producao();
        Scanner ler = new Scanner(System.in);

        prod.calcularHMS();
        System.out.println(prod.toString());

        System.out.println("Nome da peça: ");
        prod.setPeca(ler.nextLine());

        System.out.println("Segundos: ");
        prod.setSegundos(ler.nextInt());

        prod.calcularHMS();
        System.out.println(prod.toString());

    }

    

}
