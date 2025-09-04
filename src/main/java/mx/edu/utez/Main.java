package mx.edu.utez;

import mx.edu.utez.Menu;
import java.util.Scanner;

public class 11Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("BIENVENIDO CALCU PERU\n");
            System.out.println("""
                        1.Sumar
                        2.Restar
                        3.Multiplicar
                        4.Dividir
                        5.Salir
                        """);
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    menu.sumar();
                    break;
                case 2:
                    menu.resta();
                    break;
                case 3:
                    menu.multiplicacion();
                    break;
                case 4:
                    menu.division();
                    break;
                case 5:
                    System.out.println("Se ha finalizado la operacion\n");
                    break;
                default:
                    System.out.println("Opcion no valida\n");
                    break;

            }
        } while(option != 5);

    }
}