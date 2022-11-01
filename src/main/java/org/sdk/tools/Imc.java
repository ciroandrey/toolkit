package org.sdk.tools;

import java.util.Scanner;

public class Imc {

    public static void calcImc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome da Pessoa 1: ");
        String name = scanner.nextLine();
        System.out.println("Peso da Pessoa 1 (kg): ");
        float weight = scanner.nextFloat();
        System.out.println("Altura da Pessoa 1 (m): ");
        float height = scanner.nextFloat();
        scanner.nextLine();


        float imc1 = calcularIMC(weight, height);

        String classifica = resultadoIMC(imc1);

        System.out.printf("IMC da Pessoa 1 = %.1f - %s\n",imc1,classifica);

    }

    private static float calcularIMC(float p, float h) {
        return p/(h*h);
    }


    private static String resultadoIMC(float imc) {
        String result;
        if (imc <= 19)
            result = "Abaixo do Peso";
        else
        if (imc <= 25)
            result = "Peso ideal";
        else
        if (imc <= 30)
            result = "Acima do Peso";
        else
        if (imc <= 35)
            result = "Obesidade Leve";
        else
            result = "Obesidade";

        return result;
    }
}
