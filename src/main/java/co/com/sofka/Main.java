package co.com.sofka;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Main.class.getName());
        Calculadora calculadora = new Calculadora();
        List<Double> lista1 = List.of(10.0,10.0,2.0,0.0);
        List<Double> lista2 = List.of(1.0,10.0,0.0,10.0);
        Scanner in = new Scanner(System.in);
        int option;
        do {
            log.info("""
                    ****** CALCULADORA SOFKA ********:\s
                     1-Sumar\s
                     2-Restar\s
                     3-Multiplicar\s
                     4-Dividir\s
                     5-Salir
                     """);
            option = in.nextInt();
            switch (option) {
                case 1 ->{
                    calculadora.suma(lista1,lista2);
                }
                case 2 ->{
                    calculadora.resta(lista1,lista2);
                }
                case 3 ->{
                    calculadora.multiplicacion(lista1,lista2);
                }
                case 4 ->{
                    calculadora.division(lista1,lista2);
                }
                case 5 -> log.info("");
                default ->log.info("OPCION INCORRECTA DIGITE DE NUEVO");
            }
        } while (option != 5);
        log.info("Saliste satisfactoriamente");
    }
}