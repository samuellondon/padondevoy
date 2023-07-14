package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declarando Los Datos De Entrada Del Problema
        String ubicacionusuario;
        String destino;
        String nombreUsuario;
        String telefonoUsuario;

        //Declarando un dato especial para capturar informacion desde el teclado
        Scanner teclado=new Scanner(System.in);

        //Espacio para inicializar las variables
        System.out.println("\u001B[36m pa donde voy \u001B[0m");

        System.out.print("Digite su ubicacion: ");
        ubicacionusuario=teclado. nextLine();

        System.out.print("Digite su destino: ");
        destino=teclado.nextLine();

        System.out.print("Digite su nombre: ");
        nombreUsuario=teclado.nextLine();

        System.out.print("Digite su telefono: ");
        telefonoUsuario=teclado.nextLine();

        //Proceso del problema

        String distancia="20";//ESTO ES UN TEXTO
        //DEBD HACER PARSEO DE LA VARIABLE distancia
        //PARSEO=CAMBIAR O MODIFICAR EL TIPO DE DATO DE UNA VARIABLE
        Integer distanciaEnEntero=Integer.parseInt(distancia);

        Integer costoporkilometro=6800;
        int cobrototal=distanciaEnEntero*costoporkilometro;

        //Salidas del problema
        System.out.println("\u001B[33m Señor usuario"+nombreUsuario+  "\u001B[0m");

        System.out.println("\u001B[32m El costo de su viaje es: $"+cobrototal+ "Pesos\u001B[0m");









    }
}