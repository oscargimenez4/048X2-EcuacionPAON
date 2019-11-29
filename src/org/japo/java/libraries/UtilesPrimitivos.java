/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author CicloM
 */
public class UtilesPrimitivos {

    //Scan
    public static final Scanner SCN
            = new Scanner(System.in, "ISO-8859-1")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    //Constantes operación
    public static final int OP_SUM = 0;     // Suma 
    public static final int OP_RES = 1;     // Resta 
    public static final int OP_MUL = 2;     // Producto 
    public static final int OP_DIV = 3;     // Cociente 
    public static final int OP_MOD = 4;     // Resto 
    public static final int OP_MED = 5;     // Media 
    public static final int OP_MAY = 6;     // Mayor 
    public static final int OP_MEN = 7;     // Menor 

    public static final int RANGE_IN = 0; // Dentro de Rango
    public static final int RANGE_BELOW = 1; // Debajo de Rango
    public static final int RANGE_ABOVE = 2; // Encima de Rango

    //Constantes Analisis
    //Constantes Analisis
    public static final int AN_PAR = 0;
    public static final int AN_IMP = 1;
    public static final int AN_POS = 2;
    public static final int AN_NEG = 3;

    //Constantes
    public static final int NUM = 0;
    public static final int MIN = 1;
    public static final int MAX = 10;
    public static final String MSG_USR = "Número ......: ";
    public static final String MSG_MIN = "Mínimo ......: ";
    public static final String MSG_MAX = "Máximo ......: ";
    public static final String MSG_ANA = "Análisis ....: ";
    public static final String MSG_ERR = "Error";

    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static final int DNI_NUM = 73100957;
    public static final char DNI_CTR = 'B';

    public static final double operar(double n1, double n2, int op) {
        double result = 0;

        switch (op) {
            case OP_SUM:
                result = n1 + n2;
                break;
            case OP_RES:
                result = n1 - n2;
                break;
            case OP_MUL:
                result = n1 * n2;
                break;
            case OP_DIV:
                result = n1 / n2;
                break;
            case OP_MOD:
                result = n1 % n2;
                break;
            case OP_MED:
                result = (n1 + n2) / 2;
                break;
            case OP_MAY:
                result = n1 > n2 ? n1 : n2;
                break;

            case OP_MEN:
                result = n1 < n2 ? n1 : n2;
                break;

        }

        return result;

    }

    public static final int analizarRango(double num, int min, int max) {
        boolean errorOK = true;
        int valor = 0;
        do {
            try {
                System.out.print(MSG_USR);
                num = SCN.nextInt();
                if (num > min && num < max) {
                    valor = 0;
                } else if (num < min) {
                    valor = 1;
                } else if (num > max) {
                    valor = 2;
                }
                errorOK = false;

            } catch (Exception e) {
                System.out.println(MSG_ERR);
                System.out.println("---");

            } finally {
                SCN.nextLine();
            }
        } while (errorOK);

        System.out.println("---");
        System.out.printf(MSG_MIN + "%d%n", min);
        System.out.printf(MSG_MAX + "%d%n", max);
        System.out.println("---");

        return valor;
    }

    public static final char calcular(int num) {
        return LETRAS.charAt(num % 23);

    }

    public static final boolean validar(int num, char ctr) {
        return ctr == calcular(num);
    }

    public static final boolean analizar(double n, int an) {
        boolean testOk = false;
        switch (an) {
            case AN_PAR:
                testOk = n % 2 == 0;
                break;
            case AN_IMP:
                testOk = n % 2 != 0;
                break;
            case AN_POS:
                testOk = n >= 0;
                break;
            case AN_NEG:
                testOk = n < 0;
        }
        return testOk;
    }

    public static final boolean validarPar(double n) {
        return analizar(n, AN_PAR);
    }

    public static final boolean validarPositivo(double n) {
        return analizar(n, AN_POS);
    }

    public static final boolean validarImpar(double n) {
        return analizar(n, AN_IMP);
    }

    public static final boolean validarNegativo(double n) {
        return analizar(n, AN_NEG);
    }

    public static final double ecuacionSegundoGradoMas(double a, double b, double c) {
        double valor;
        double numero;

        numero = (b * b) - (4 * a * c);

        valor = ((-b + Math.sqrt(numero)) / 2 * a);

        return valor;
    }

    public static final double ecuacionSegundoGradoMenos(double a, double b, double c) {
        double valor;
        double numero;

        numero = (b * b) - (4 * a * c);

        valor = ((-b - Math.sqrt(numero)) / 2 * a);

        return valor;
    }
}
