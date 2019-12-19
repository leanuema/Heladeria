package com.leandro.srl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int numero;
        String sabores;
        String productoUno;

        Helados primerPedido = new Helados();
        Helados segundoPedido = new Helados();
        Helados tercerPedido = new Helados();

        System.out.println("Elija el cajero para pedir la orden, oprima 1 (para el primer cajero), 2 (para el segundo), y 3 (para el terero)");
        numero = scanner.nextInt();

        if (numero == 1) {

            System.out.println("Usted eligio el primer cajero");

            System.out.println("Escriba cono (como primera opcion), cuarto (como segunda opcion), y kilo (para tercer opcion ");
            productoUno = scanner1.nextLine();

            if (productoUno.equals("cono")) {
                System.out.println("Usted eligio el cono, elija su primer sabor");
                sabores = scanner2.nextLine();
                primerPedido.setPrimerSabor(sabores);

                System.out.println("Ingrese su segundo sabor");
                sabores = scanner2.nextLine();
                primerPedido.setSegundoSabor(sabores);

                System.out.println("Su pedido es un cono con " + primerPedido.toString());
            } else if (productoUno.equals("cuarto")) {
                System.out.println("Usted eligio el cuarto de helado, elija sus sabores");
                System.out.println("Sabor uno");
                sabores = scanner2.nextLine();
                segundoPedido.setPrimerSabor(sabores);

                System.out.println("Ingrese su segundo sabor");
                sabores = scanner2.nextLine();
                segundoPedido.setSegundoSabor(sabores);

                System.out.println("Ingrese su tercer sabor");
                sabores = scanner2.nextLine();
                segundoPedido.setTercerSabor(sabores);

                System.out.println(segundoPedido.toString());
            } else if (productoUno.equals("kilo")) {
                System.out.println("Usted eligio el kilo de helado, elija sus sabores");
                System.out.println("Sabor uno");
                sabores = scanner2.nextLine();
                tercerPedido.setPrimerSabor(sabores);

                System.out.println("Elija su segundo sabor");
                sabores = scanner2.nextLine();
                tercerPedido.setSegundoSabor(sabores);

                System.out.println("Elija su tercer sabor");
                sabores = scanner2.nextLine();
                tercerPedido.setTercerSabor(sabores);

                System.out.println("Elija su cuarto sabor");
                sabores = scanner2.nextLine();
                tercerPedido.setCuartoSabor(sabores);

                System.out.println(tercerPedido.toString());
            }
        } else if (numero == 2) {

            System.out.println("Usted eligio el segundo cajero");

            System.out.println("Escriba cono (como primera opcion), cuarto (como segunda opcion), y kilo (para tercer opcion ");
            productoUno = scanner1.nextLine();

            if (productoUno.equals("cono")) {
                System.out.println("Usted eligio el cono, elija su primer sabor");
                sabores = scanner2.nextLine();
                primerPedido.setPrimerSabor(sabores);

                System.out.println("Ingrese su segundo sabor");
                sabores = scanner2.nextLine();
                primerPedido.setSegundoSabor(sabores);

                System.out.println("Su pedido es un cono con " + primerPedido.toString());
            } else if (productoUno.equals("cuarto")) {
                System.out.println("Usted eligio el cuarto de helado, elija sus sabores");
                System.out.println("Sabor uno");
                sabores = scanner2.nextLine();
                segundoPedido.setPrimerSabor(sabores);

                System.out.println("Ingrese su segundo sabor");
                sabores = scanner2.nextLine();
                segundoPedido.setSegundoSabor(sabores);

                System.out.println("Ingrese su tercer sabor");
                sabores = scanner2.nextLine();
                segundoPedido.setTercerSabor(sabores);

                System.out.println(segundoPedido.toString());
            } else if (productoUno.equals("kilo")) {
                System.out.println("Usted eligio el kilo de helado, elija sus sabores");
                System.out.println("Sabor uno");
                sabores = scanner2.nextLine();
                tercerPedido.setPrimerSabor(sabores);

                System.out.println("Elija su segundo sabor");
                sabores = scanner2.nextLine();
                tercerPedido.setSegundoSabor(sabores);

                System.out.println("Elija su tercer sabor");
                sabores = scanner2.nextLine();
                tercerPedido.setTercerSabor(sabores);

                System.out.println("Elija su cuarto sabor");
                sabores = scanner2.nextLine();
                tercerPedido.setCuartoSabor(sabores);

                System.out.println(tercerPedido.toString());
            }
        } else if (numero == 3) {

            System.out.println("Usted eligio el tercer cajero");

            System.out.println("Escriba cono (como primera opcion), cuarto (como segunda opcion), y kilo (para tercer opcion ");
            productoUno = scanner1.nextLine();

            if (productoUno.equals("cono")) {
                System.out.println("Usted eligio el cono, elija su primer sabor");
                sabores = scanner2.nextLine();
                primerPedido.setPrimerSabor(sabores);

                System.out.println("Ingrese su segundo sabor");
                sabores = scanner2.nextLine();
                primerPedido.setSegundoSabor(sabores);

                System.out.println("Su pedido es un cono con " + primerPedido.toString());
            } else if (productoUno.equals("cuarto")) {
                System.out.println("Usted eligio el cuarto de helado, elija sus sabores");
                System.out.println("Sabor uno");
                sabores = scanner2.nextLine();
                segundoPedido.setPrimerSabor(sabores);

                System.out.println("Ingrese su segundo sabor");
                sabores = scanner2.nextLine();
                segundoPedido.setSegundoSabor(sabores);

                System.out.println("Ingrese su tercer sabor");
                sabores = scanner2.nextLine();
                segundoPedido.setTercerSabor(sabores);

                System.out.println(segundoPedido.toString());
            } else if (productoUno.equals("kilo")) {
                System.out.println("Usted eligio el kilo de helado, elija sus sabores");
                System.out.println("Sabor uno");
                sabores = scanner2.nextLine();
                tercerPedido.setPrimerSabor(sabores);

                System.out.println("Elija su segundo sabor");
                sabores = scanner2.nextLine();
                tercerPedido.setSegundoSabor(sabores);

                System.out.println("Elija su tercer sabor");
                sabores = scanner2.nextLine();
                tercerPedido.setTercerSabor(sabores);

                System.out.println("Elija su cuarto sabor");
                sabores = scanner2.nextLine();
                tercerPedido.setCuartoSabor(sabores);

                System.out.println(tercerPedido.toString());
            }
        }
    }
}
