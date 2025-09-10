package Desafio;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de cigarros fumados por dia: ");
        int cigarrosPorDia = scanner.nextInt();
        
        System.out.print("Digite a quantidade de anos que a pessoa já fumou: ");
        int anosFumando = scanner.nextInt();


        final int MINUTOS_PERDIDOS_POR_CIGARRO = 10;
        final int DIAS_NO_ANO = 365;
        final int MINUTOS_NO_DIA = 24 * 60;


        long totalCigarros = (long) cigarrosPorDia * DIAS_NO_ANO * anosFumando;


        long totalMinutosPerdidos = totalCigarros * MINUTOS_PERDIDOS_POR_CIGARRO;


        long totalDiasPerdidos = totalMinutosPerdidos / MINUTOS_NO_DIA;


        System.out.println("\n--- Resultado ---");
        System.out.println("Cigarros fumados no total: " + totalCigarros);
        System.out.println("Tempo de vida total perdido (em minutos): " + totalMinutosPerdidos);
        System.out.println("Tempo de vida total perdido (em dias): " + totalDiasPerdidos);
        

        scanner.close();
    }
}
