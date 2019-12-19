package com.leandro.srl;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int numeroDeCajero;
        String productoSeleccionado;

        System.out.println("Elija el cajero para poder iniciar su orden, oprima 1 (para el primer cajero), " +
                "2 (para el segundo), o 3 (para el terero)");
        numeroDeCajero = scanner.nextInt();

        if (numeroDeCajero == 1) {

            System.out.println("Ah seleccionado al primer cajero, ingrese su pedido");

            for (int i = 0; i < 5; i++) {

                System.out.println("Escriba cono (como primera opcion), cuarto (como segunda opcion), y kilo (para tercer opcion ");
                productoSeleccionado = scanner1.nextLine();

                if (productoSeleccionado.equals("cono")) {


                    conoDeHeladoSeleccionado();

                } else if (productoSeleccionado.equals("cuarto")) {

                    cuartoDeHeladoSeleccionado();

                } else if (productoSeleccionado.equals("kilo")) {

                    kiloDeHeladoSeleccionado();

                }
            }
        } else if (numeroDeCajero == 2) {

            System.out.println("Ah seleccionado al segundo cajero, ingrese su pedido");

            for (int i = 0; i < 10; i++) {

                System.out.println("Escriba cono (como primera opcion), cuarto (como segunda opcion), y kilo (para tercer opcion ");
                productoSeleccionado = scanner1.nextLine();

                if (productoSeleccionado.equals("cono")) {

                    conoDeHeladoSeleccionado();

                } else if (productoSeleccionado.equals("cuarto")) {

                    cuartoDeHeladoSeleccionado();

                } else if (productoSeleccionado.equals("kilo")) {

                    kiloDeHeladoSeleccionado();

                }
            }
        } else if (numeroDeCajero == 3) {

            System.out.println("Ah seleccionado al tercer cajero, ingrese su pedido");

            for (int i = 0; i < 15; i++) {

                System.out.println("Escriba cono (como primera opcion), cuarto (como segunda opcion), y kilo (para tercer opcion ");
                productoSeleccionado = scanner1.nextLine();

                if (productoSeleccionado.equals("cono")) {

                    conoDeHeladoSeleccionado();

                } else if (productoSeleccionado.equals("cuarto")) {

                    cuartoDeHeladoSeleccionado();

                } else if (productoSeleccionado.equals("kilo")) {

                    kiloDeHeladoSeleccionado();

                }
            }
        }
    }

    public static void conoDeHeladoSeleccionado() {
        Scanner scanner2 = new Scanner(System.in);
        String saboresAElegir;
        helado pedidoSele = new helado();

        System.out.println("El cono dispone con una variedad de tan solo 2 sabores, ingrese su primer sabor deseado");
        saboresAElegir = scanner2.nextLine();
        pedidoSele.setPrimerSaborDeseado(saboresAElegir);

        System.out.println("Ingrese su segundo sabor desado");
        saboresAElegir = scanner2.nextLine();
        pedidoSele.setSegundoSaborDeseado(saboresAElegir);

        System.out.println("Su pedido es un cono con " + pedidoSele.toString());
    }

    public static void cuartoDeHeladoSeleccionado() {
        Scanner scanner2 = new Scanner(System.in);
        String saboresAElegir;
        helado pedidoSeleccionado = new helado();

        System.out.println("El cuarto de helado viene con un maximo de 3 sabores, ingrese su primer sabor deseado");
        saboresAElegir = scanner2.nextLine();
        pedidoSeleccionado.setPrimerSaborDeseado(saboresAElegir);

        System.out.println("Ingrese su segundo sabor deseado");
        saboresAElegir = scanner2.nextLine();
        pedidoSeleccionado.setSegundoSaborDeseado(saboresAElegir);

        System.out.println("Ingrese su tercer sabor");
        saboresAElegir = scanner2.nextLine();
        pedidoSeleccionado.setTercerSaborDeseado(saboresAElegir);

        System.out.println(pedidoSeleccionado.toString());
    }

    public static void kiloDeHeladoSeleccionado() {
        Scanner scanner2 = new Scanner(System.in);
        helado pedidoSeleccionado = new helado();
        String saboresAElegir;

        System.out.println("Ah elegido la promo del dia, el kilo de helado dispone de 4 gustos a elegir, elija su primer sabor");
        saboresAElegir = scanner2.nextLine();
        pedidoSeleccionado.setPrimerSaborDeseado(saboresAElegir);

        System.out.println("Elija su segundo sabor deseado");
        saboresAElegir = scanner2.nextLine();
        pedidoSeleccionado.setSegundoSaborDeseado(saboresAElegir);

        System.out.println("Elija su tercer sabor deseado");
        saboresAElegir = scanner2.nextLine();
        pedidoSeleccionado.setTercerSaborDeseado(saboresAElegir);

        System.out.println("Elija su cuarto sabor deseado");
        saboresAElegir = scanner2.nextLine();
        pedidoSeleccionado.setCuartoSaborDeseado(saboresAElegir);
    }

}
