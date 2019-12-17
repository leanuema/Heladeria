package com.Leandro.srl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String sabores;

        Helados primerPedido = new Helados();
        Helados segundoPedido = new Helados();
        Helados tercerPedido = new Helados();

        System.out.println("Elija si quiere cono (oprima 1), cuarto de helado (oprima 2), o kilo (oprima 3)");
        numero = scanner.nextInt();

        if (numero == 1) {
            System.out.println("Usted eligio el cono, elija su primer sabor");
            primerPedido.setSaborUno("Vainilla");

            System.out.println("Ingrese su segundo sabor");
            sabores=scanner.nextLine();
            primerPedido.setSaborDos(sabores);

            System.out.println("Su pedido es un cono con " + primerPedido.toString());
        }
        else if (numero==2){
            System.out.println("Usted eligio el cuarto de helado, elija sus sabores");
            segundoPedido.setSaborUno("Chocolate");

            System.out.println("Ingrese su segundo sabor");
            segundoPedido.setSaborDos("Crema");

            System.out.println("Ingrese su tercer sabor");
            segundoPedido.setSaborTres("Vainilla");

            System.out.println(segundoPedido.toString());
        }

        else if (numero==3){
            System.out.println("Usted eligio el kilo de helado, elija sus sabores");
            tercerPedido.setSaborUno("Vainilla");

            System.out.println("Elija su segundo sabor");
            tercerPedido.setSaborDos("Chocolate");

            System.out.println("Elija su tercer sabor");
            tercerPedido.setSaborTres("Crema");

            System.out.println("Elija su cuarto sabor");
            tercerPedido.setSaborCuatro("Maracuya");

            System.out.println(tercerPedido.toString());
        }
    }
}
